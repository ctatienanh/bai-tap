package com.codegym.repository;

import com.codegym.models.Comment;
import com.codegym.models.Status123;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICommentRepo extends PagingAndSortingRepository<Comment,Integer> {
}
