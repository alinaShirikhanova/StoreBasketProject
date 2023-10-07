package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store")
public class Controller {

   private final BasketService basketService;

    public Controller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.getItems();
    }

    @GetMapping("/add")
    public void add(@RequestParam("list") List<Integer> listOfItems) {
        basketService.addItems(listOfItems);
    }
}
