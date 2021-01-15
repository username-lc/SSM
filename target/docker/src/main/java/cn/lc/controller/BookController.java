package cn.lc.controller;

import cn.lc.beans.Book;
import cn.lc.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/queryById/{id}", method = RequestMethod.GET)
    public Book queryById(@PathVariable int id) {
        Book book = bookService.queryById(id);
        return book;
    }

    public static void main(String[] args) {
        log.info("=============");
    }
}
