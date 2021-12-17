package com.vidhya.grpc.blog.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.proto.blog.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

public class BlogServiceImpl extends BlogServiceGrpc.BlogServiceImplBase {

  private MongoClient client = MongoClients.create("mongodb://localhost:27017");
  private MongoDatabase database = client.getDatabase("blogDB");
  private MongoCollection<Document> collection = database.getCollection("blog");

  @Override
  public void createBlog(CreateBlogRequest request, StreamObserver<CreateBlogResponse> responseObserver) {
    Blog blog = request.getBlog();
    Document document = new Document("author_id", blog.getAuthorId())
            .append("title", blog.getTitle())
            .append("content", blog.getContent());

    collection.insertOne(document);
    String response = "Successfully inserted  entry " + document.get("_id").toString();
    responseObserver.onNext(CreateBlogResponse.newBuilder().setResponse(response).build());
    responseObserver.onCompleted();

  }

  @Override
  public void getBlogById(GetBlogRequest request, StreamObserver<GetBlogResponse> responseObserver) {
    String blogId = request.getBlogId();
    Document document = collection.find(Filters.eq("_id", new ObjectId(blogId))).first();
    if (document == null) {
      responseObserver.onError(Status.NOT_FOUND.withDescription("No Blog with Id " + blogId + " found").asException());
    }
    Blog blog = Blog.newBuilder().setAuthorId(document.getString("author_id"))
            .setContent(document.getString("content"))
            .setTitle(document.getString("title"))
            .build();

    GetBlogResponse response = GetBlogResponse.newBuilder().setBlog(blog).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();

  }

  @Override
  public void deleteBlog(DeleteBlogRequest request, StreamObserver<DeleteBlogResponse> responseObserver) {
      Document document = collection.find(Filters.eq("_id",new ObjectId(request.getBlogId()))).first();
      if(document == null){
        responseObserver.onError(Status.NOT_FOUND.withDescription("No Blog with Id " + request.getBlogId() + " found").asException());
      }else{
        collection.deleteOne(document);
        DeleteBlogResponse response = DeleteBlogResponse.newBuilder().setResponse("Blog with Id "+request.getBlogId()+" successfully deleted").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
      }
  }

  private Blog documentToBlog(Document document){
      Blog blog = Blog.newBuilder()
              .setContent(document.getString("content"))
              .setTitle(document.getString("title"))
              .setAuthorId(document.getString("author_id"))
              .setId(document.get("_id").toString())
              .build();

      return  blog;
  }

  @Override
  public void listAllBlog(ListBlogRequest request, StreamObserver<ListBlogResponse> responseObserver) {
     collection.find().forEach(document -> {
         responseObserver.onNext(ListBlogResponse.newBuilder().setBlog(documentToBlog(document)).build());
     });
     responseObserver.onCompleted();

  }

  @Override
  public void updateBlog(UpdateBlogRequest request, StreamObserver<UpdateBlogResponse> responseObserver) {
    Blog blog = request.getBlog();
    Document result = collection.find(Filters.eq("_id",new ObjectId(blog.getId()))).first();
    if (result == null) {
      responseObserver.onError(Status.NOT_FOUND.withDescription("No Blog with Id " + blog.getId() + " found").asException());
    }else{
      Document replacement = new Document("author_id", blog.getAuthorId())
              .append("title", blog.getTitle())
              .append("content", blog.getContent());
      collection.replaceOne(result,replacement);
      String response = "Blog with id "+ blog.getId()+" successfully updated";
      UpdateBlogResponse blogResponse = UpdateBlogResponse.newBuilder().setResponse(response).build();
      responseObserver.onNext(blogResponse);
      responseObserver.onCompleted();

    }





  }
}
