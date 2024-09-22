package com.huoruyi.controller;

import com.huoruyi.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return List.of(
                new Restaurant("惊喜餐厅", "市中心", "特色美食")
        );
    }
}