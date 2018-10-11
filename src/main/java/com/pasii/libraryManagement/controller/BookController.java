package com.pasii.libraryManagement.controller;

import com.pasii.libraryManagement.dto.AddBookRequest;
import com.pasii.libraryManagement.dto.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pasindum on 11/10/2018.
 */
@RestController
public class BookController {

@PostMapping("/addBook")
public CommonResponse addBook(@RequestBody AddBookRequest addBookRequest) {

    return null;
}
}
