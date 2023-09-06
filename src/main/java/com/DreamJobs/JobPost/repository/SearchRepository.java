package com.DreamJobs.JobPost.repository;

import com.DreamJobs.JobPost.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
