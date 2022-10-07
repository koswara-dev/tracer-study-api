package com.juaracoding.tracerstudy.service;

import com.juaracoding.tracerstudy.model.Tag;
import com.juaracoding.tracerstudy.payload.ApiResponse;
import com.juaracoding.tracerstudy.payload.PagedResponse;
import com.juaracoding.tracerstudy.security.UserPrincipal;

public interface TagService {

	PagedResponse<Tag> getAllTags(int page, int size);

	Tag getTag(Long id);

	Tag addTag(Tag tag, UserPrincipal currentUser);

	Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

	ApiResponse deleteTag(Long id, UserPrincipal currentUser);

}
