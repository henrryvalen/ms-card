package com.crud.card.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")
public class CardController {

    @GetMapping("/list")
    public ResponseEntity<String> list(){

        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

}
