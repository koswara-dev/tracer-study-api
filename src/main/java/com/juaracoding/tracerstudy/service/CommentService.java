package com.juaracoding.tracerstudy.service;

import com.juaracoding.tracerstudy.model.Comment;
import com.juaracoding.tracerstudy.payload.ApiResponse;
import com.juaracoding.tracerstudy.payload.CommentRequest;
import com.juaracoding.tracerstudy.payload.PagedResponse;
import com.juaracoding.tracerstudy.security.UserPrincipal;

public interface CommentService {

	PagedResponse<Comment> getAllComments(Long postId, int page, int size);

	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);

	Comment getComment(Long postId, Long id);

	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);

	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);

}
