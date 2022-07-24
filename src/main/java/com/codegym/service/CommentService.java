package com.codegym.service;

import com.codegym.models.Comment;
import com.codegym.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentService {
    @Autowired
    ICommentRepo iCommentRepo;


    public List<Comment> getall(){
        return (List<Comment>) iCommentRepo.findAll();
    }

    public void Create(Comment comment){
         iCommentRepo.save(comment);
    }
}
