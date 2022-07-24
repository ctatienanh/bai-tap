package com.codegym.service;

import com.codegym.models.Status123;
import com.codegym.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BlogService {
    @Autowired
    IBlogRepo iBlogRepo;

    public List<Status123> Full(){
        return (List<Status123>) iBlogRepo.findAll();
    }

    public Page<Status123> getAll(Pageable pageable) {
        return  iBlogRepo.findAll(pageable);
    }
    public Page<Status123> getAllByTitle(Pageable pageable, String title) {
        return  iBlogRepo.findByTitleContaining(pageable,title);
    }

    public void save(Status123 blogs) {
        iBlogRepo.save(blogs);
    }

    public void delete(long id) {
        iBlogRepo.deleteById(id);
    }


    public Optional<Status123> findByTitle(String title) {
        return iBlogRepo.findByTitle(title);
    }

}
