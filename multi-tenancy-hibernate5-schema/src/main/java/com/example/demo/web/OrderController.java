package com.example.demo.web;

import com.example.demo.model.OrderEntity;
import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orders;

    @GetMapping("")
    public ResponseEntity<List<OrderEntity>> all() {
        return ok().body(this.orders.findAll());
    }
}

