package com.example.demo;

import java.util.List;

public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addItems(List<Integer> items) {
        basket.addItems(items);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}
