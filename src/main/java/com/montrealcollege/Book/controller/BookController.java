/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montrealcollege.Book.controller;



import com.montrealcollege.Book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vish
 */
@RestController
@RequestMapping("/mainBook")
public class BookController {
   
    private String creation;

    public String getCreation() {
        return creation;
    }
    public void setCreation(String creation) {
        this.creation = creation;
    }
    
   @Autowired
    private Book book;
    
    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public Book createBook(
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam Integer year,
            @RequestParam Double price){
        
            book.setTitle(title);
            book.setAuthor(author);
            book.setYear(year);
            book.setPrice(price);

        return book;
    }
}