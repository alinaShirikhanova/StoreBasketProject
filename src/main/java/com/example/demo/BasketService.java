package com.example.demo;

import java.util.List;

public interface BasketService {


    void addItems(List<Integer> items);

    List<Integer> getItems();
}
