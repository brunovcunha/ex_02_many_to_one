package com.iftm.brunov.ex_02_many_to_one.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.brunov.ex_02_many_to_one.entities.Library;
import com.iftm.brunov.ex_02_many_to_one.service.LibraryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    LibraryService service;

    @GetMapping()
    public List<Library> getAll(){
        
        List<Library> books = service.getAll();
        return books;
    }

    @PostMapping
    public Library create(@RequestBody Library book){
        Library library = service.create(book);
        return library;
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long id, @RequestBody Library book){
        return service.delete(id);
    }
    
    

}
