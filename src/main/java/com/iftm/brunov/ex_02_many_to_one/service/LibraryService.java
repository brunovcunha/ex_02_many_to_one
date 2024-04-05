package com.iftm.brunov.ex_02_many_to_one.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iftm.brunov.ex_02_many_to_one.entities.Library;
import com.iftm.brunov.ex_02_many_to_one.repository.LibraryRepository;

@Service
public class LibraryService {

    LibraryRepository repository;

    public List<Library> getAll() {
        try {
            List<Library> books = new ArrayList<Library>();

            repository.findAll().forEach(books::add);
            return books;
        } catch (Exception e) {
            return null;
        }
    }

    public Library create(Library library) {
        return repository.save(library);
    }

    public boolean delete(Long id){
        try{
            repository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}