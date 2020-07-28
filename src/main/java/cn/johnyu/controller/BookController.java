package cn.johnyu.controller;


import cn.johnyu.mapper.BookMapper;
import cn.johnyu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookMapper bookMapper;
    @RequestMapping(value = "/books/{id}",method = RequestMethod.GET)
    public String loadBook(@PathVariable  int id){
        Book book= bookMapper.loadBook(id);
        return book.getName();
    }

    @RequestMapping(value = "/books",method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book){
        bookMapper.addBook(book);
        return book;
    }
    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public List<Book> findAllBook(){
        return bookMapper.findAllBooks();
    }
}
