package com.codegym.repository;

import com.codegym.models.Status123;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface IBlogRepo extends PagingAndSortingRepository<Status123,Long> {
    Page<Status123> findByTitleContaining(Pageable pageable, String title);
    Optional<Status123> findByTitle(String title);

}
