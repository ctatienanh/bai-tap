package com.codegym.validate;

import com.codegym.models.Status123;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class ValidateBlog implements Validator {
    @Autowired
    BlogService blogService;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Status123 blog = (Status123) target;
        Optional<Status123> optional = blogService.findByTitle(blog.getTitle());
        if (optional.isPresent()){
            errors.rejectValue("title", "", "Trung title roi nhe");
        }

        if(blog.getContent().equals("Hoàng")){
            errors.rejectValue("content", "", "Content bị cấm");

        }
    }
}