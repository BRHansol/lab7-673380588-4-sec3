package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component("student")
public class StudentDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.9;
    }
    @Override
    public String getDisplayName() {
        return "ส่วนลดนักศึกษา 10%";
    }
}