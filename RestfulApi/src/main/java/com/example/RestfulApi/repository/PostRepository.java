package com.example.RestfulApi.repository;

import com.example.RestfulApi.bean.Post;
import com.example.RestfulApi.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
