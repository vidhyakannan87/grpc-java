package com.vidhya.grpc.blog.client;

import com.proto.blog.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class BlogClient {


  private void run() {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
            .usePlaintext()
            .build();
     createBlog(channel);
    //readBlogById(channel);
    //updateBlog(channel);
    //deleteBlog(channel);
    listAllBlogs(channel);
    channel.shutdown();
  }

  private void createBlog(ManagedChannel channel) {
    BlogServiceGrpc.BlogServiceBlockingStub syncClient = BlogServiceGrpc.newBlockingStub(channel);
    CreateBlogRequest request = CreateBlogRequest.newBuilder().setBlog(Blog.newBuilder()
            .setAuthorId("123")
            .setContent("Eat imagine you chiefly few end ferrars compass. Be visitor females am ferrars inquiry. Latter law remark two lively thrown. Spot set they know rest its. Raptures law diverted believed jennings consider children the see. Had invited beloved carried the colonel. Occasional principles discretion it as he unpleasing boisterous. She bed sing dear now son half.\n" +
                    "\n" +
                    "May musical arrival beloved luckily adapted him. Shyness mention married son she his started now. Rose if as past near were. To graceful he elegance oh moderate attended entrance pleasure. Vulgar saw fat sudden edward way played either. Thoughts smallest at or peculiar relation breeding produced an. At depart spirit on stairs. She the either are wisdom praise things she before. Be mother itself vanity favour do me of. Begin sex was power joy after had walls miles.")
            .setTitle("Random Musings #1").build()

    ).build();
    CreateBlogResponse response = syncClient.createBlog(request);
    System.out.println(response.getResponse());

  }

  private void readBlogById(ManagedChannel channel) {
    BlogServiceGrpc.BlogServiceBlockingStub syncClient = BlogServiceGrpc.newBlockingStub(channel);
    try {
      GetBlogResponse response = syncClient.getBlogById(GetBlogRequest.newBuilder().setBlogId("61bcffed1de5526d8f83c6c6").build());
      System.out.println(response.toString());
    } catch (StatusRuntimeException ex) {
      ex.printStackTrace();
    }

  }

  private void updateBlog(ManagedChannel channel) {
    BlogServiceGrpc.BlogServiceBlockingStub syncClient = BlogServiceGrpc.newBlockingStub(channel);
    Blog updatedBlog = Blog.newBuilder().setId("61bcf143fd4ea3037a1cd140")
            .setAuthorId("123")
            .setTitle("Random Musings #1")
            .setContent("Updated Blog Content")
            .build();
    UpdateBlogRequest blogRequest = UpdateBlogRequest.newBuilder().setBlog(updatedBlog).build();
    try {
      UpdateBlogResponse response = syncClient.updateBlog(blogRequest);
      System.out.println(response.getResponse());
    } catch (StatusRuntimeException ex) {
      ex.printStackTrace();
    }

  }

  private void deleteBlog(ManagedChannel channel){
     BlogServiceGrpc.BlogServiceBlockingStub syncClient = BlogServiceGrpc.newBlockingStub(channel);
     try {
       DeleteBlogResponse response = syncClient.deleteBlog(DeleteBlogRequest.newBuilder().setBlogId("61bcff6e1de5526d8f83c6c5").build());
       System.out.println(response.toString());
     }catch (StatusRuntimeException ex) {
       ex.printStackTrace();
     }
  }

  private void listAllBlogs(ManagedChannel channel){
    BlogServiceGrpc.BlogServiceBlockingStub syncClient = BlogServiceGrpc.newBlockingStub(channel);
    syncClient.listAllBlog(ListBlogRequest.newBuilder().build()).forEachRemaining(listBlogResponse -> {
      System.out.println(listBlogResponse.getBlog().toString());
    });


  }

  public static void main(String[] args) {
    BlogClient client = new BlogClient();
    client.run();
  }
}
