package com.juaracoding.tracerstudy.service;

import com.juaracoding.tracerstudy.model.Post;
import com.juaracoding.tracerstudy.payload.ApiResponse;
import com.juaracoding.tracerstudy.payload.PagedResponse;
import com.juaracoding.tracerstudy.payload.PostRequest;
import com.juaracoding.tracerstudy.payload.PostResponse;
import com.juaracoding.tracerstudy.security.UserPrincipal;

public interface PostService {

	PagedResponse<Post> getAllPosts(int page, int size);

	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);

	PagedResponse<Post> getPostsByCategory(Long id, int page, int size);

	PagedResponse<Post> getPostsByTag(Long id, int page, int size);

	Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);

	ApiResponse deletePost(Long id, UserPrincipal currentUser);

	PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);

	Post getPost(Long id);

}
