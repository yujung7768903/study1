package com.codewith.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// DB Layer 접근자
public interface PostsRepository extends  JpaRepository<Posts, Long>{
}
