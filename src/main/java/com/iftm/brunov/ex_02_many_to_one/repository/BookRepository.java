package com.iftm.brunov.ex_02_many_to_one.repository;

import org.springframework.data.repository.CrudRepository;

import com.iftm.brunov.ex_02_many_to_one.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    
}
