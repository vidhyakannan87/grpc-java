// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.proto.blog;

public final class BlogOuterClass {
  private BlogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Blog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Blog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_GetBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_GetBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_GetBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_GetBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_UpdateBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_UpdateBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_UpdateBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_UpdateBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_DeleteBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_DeleteBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_DeleteBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_DeleteBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_ListBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_ListBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_ListBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_ListBlogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017blog/blog.proto\022\004blog\"E\n\004Blog\022\n\n\002id\030\001 " +
      "\001(\t\022\021\n\tauthor_id\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\017\n" +
      "\007content\030\004 \001(\t\"-\n\021CreateBlogRequest\022\030\n\004b" +
      "log\030\001 \001(\0132\n.blog.Blog\"&\n\022CreateBlogRespo" +
      "nse\022\020\n\010response\030\001 \001(\t\" \n\016GetBlogRequest\022" +
      "\016\n\006blogId\030\001 \001(\t\"+\n\017GetBlogResponse\022\030\n\004bl" +
      "og\030\001 \001(\0132\n.blog.Blog\"-\n\021UpdateBlogReques" +
      "t\022\030\n\004blog\030\001 \001(\0132\n.blog.Blog\"&\n\022UpdateBlo" +
      "gResponse\022\020\n\010response\030\001 \001(\t\"#\n\021DeleteBlo" +
      "gRequest\022\016\n\006blogId\030\001 \001(\t\"&\n\022DeleteBlogRe" +
      "sponse\022\020\n\010response\030\001 \001(\t\"\021\n\017ListBlogRequ" +
      "est\",\n\020ListBlogResponse\022\030\n\004blog\030\001 \001(\0132\n." +
      "blog.Blog2\326\002\n\013BlogService\022A\n\nCreateBlog\022" +
      "\027.blog.CreateBlogRequest\032\030.blog.CreateBl" +
      "ogResponse\"\000\022<\n\013GetBlogById\022\024.blog.GetBl" +
      "ogRequest\032\025.blog.GetBlogResponse\"\000\022A\n\nUp" +
      "dateBlog\022\027.blog.UpdateBlogRequest\032\030.blog" +
      ".UpdateBlogResponse\"\000\022A\n\nDeleteBlog\022\027.bl" +
      "og.DeleteBlogRequest\032\030.blog.DeleteBlogRe" +
      "sponse\"\000\022@\n\013ListAllBlog\022\025.blog.ListBlogR" +
      "equest\032\026.blog.ListBlogResponse\"\0000\001B\022\n\016co" +
      "m.proto.blogP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_blog_Blog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_blog_Blog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Blog_descriptor,
        new java.lang.String[] { "Id", "AuthorId", "Title", "Content", });
    internal_static_blog_CreateBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_blog_CreateBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateBlogRequest_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_CreateBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_blog_CreateBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateBlogResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_blog_GetBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_blog_GetBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_GetBlogRequest_descriptor,
        new java.lang.String[] { "BlogId", });
    internal_static_blog_GetBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_blog_GetBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_GetBlogResponse_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_UpdateBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_blog_UpdateBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_UpdateBlogRequest_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_UpdateBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_blog_UpdateBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_UpdateBlogResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_blog_DeleteBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_blog_DeleteBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_DeleteBlogRequest_descriptor,
        new java.lang.String[] { "BlogId", });
    internal_static_blog_DeleteBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_blog_DeleteBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_DeleteBlogResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_blog_ListBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_blog_ListBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_ListBlogRequest_descriptor,
        new java.lang.String[] { });
    internal_static_blog_ListBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_blog_ListBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_ListBlogResponse_descriptor,
        new java.lang.String[] { "Blog", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
