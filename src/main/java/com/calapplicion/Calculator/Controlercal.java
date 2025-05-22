package com.calapplicion.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controlercal {
   @Autowired
    private CalculatorService calculatorService;

   @PostMapping("/add")
   public ResponseEntity<String> add(@RequestBody Enty enty) {
        calculatorService.addmet(enty);
        return new ResponseEntity<>("ADDED", HttpStatus.OK);
   }
   @GetMapping("/show")
   public List<Enty> getal() {
     return calculatorService.getall();
   }
}
