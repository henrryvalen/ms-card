package com.crud.card.controller;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")
public class CardController {

    @GetMapping(value = "/list")
    @Operation(summary = "Find student by id, also returns a link to retrieve all students with rel - all-students")

    public ResponseEntity<String> list(){

        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

}
