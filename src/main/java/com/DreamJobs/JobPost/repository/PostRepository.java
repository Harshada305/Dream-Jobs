package com.DreamJobs.JobPost.repository;

import com.DreamJobs.JobPost.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
