package com.iftm.brunov.ex_02_many_to_one.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.iftm.brunov.ex_02_many_to_one.entities.Book;
import com.iftm.brunov.ex_02_many_to_one.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public List<Book> getAll(){

        try{
            List<Book> books = new ArrayList<Book>();

            repository.findAll().forEach(books::add);
            return books;

        } catch(Exception e){
            return null;
        }
    }

    public Book create(Book book) {
        return repository.save(book);
}
    
        public boolean delete(Long id) {
            try {
                    repository.deleteById(id);
                    return true;
            } catch (Exception e) {
                    return false;
            }
    }

}
