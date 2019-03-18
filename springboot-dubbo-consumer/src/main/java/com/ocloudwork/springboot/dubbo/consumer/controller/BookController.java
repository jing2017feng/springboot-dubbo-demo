package com.ocloudwork.springboot.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ocloudwork.springboot.dubbo.api.domain.Book;
import com.ocloudwork.springboot.dubbo.api.service.IBookService;

/**
 * @author minghui
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Reference(version = "1.0",
            application = "${dubbo.application.id}")
    private IBookService bookService;

    @GetMapping
    public Book findBook(@RequestParam("name") String name) {
        return bookService.findBook(name);
    }

}