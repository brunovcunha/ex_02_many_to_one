package com.iftm.brunov.ex_02_many_to_one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.brunov.ex_02_many_to_one.entities.Book;
import com.iftm.brunov.ex_02_many_to_one.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService service;

    @GetMapping
    public List<Book> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return service.create(book);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long id){
        return service.delete(id);
    }
 }
