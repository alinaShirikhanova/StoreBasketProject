package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
public class Basket {
    private final List<Integer> items;

    public Basket(List<Integer> items) {
        this.items = items;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void addItems(List<Integer> items){
        this.items.addAll(items);
    }
}
