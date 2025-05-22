package com.calapplicion.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
   @Autowired
   private  Repo repo;

    public void addmet(Enty enty) {
        repo.save(enty);
    }
    public List<Enty> getall() {
        return repo.findAll();
    }
}
