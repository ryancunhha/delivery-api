package com.delivery.delivery_api.controller;

import com.delivery.delivery_api.model.Delivery;
import com.delivery.delivery_api.service.DeliveryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    private final DeliveryService service;

    public DeliveryController(DeliveryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Delivery> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Delivery getOne(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Delivery create(@RequestBody Delivery delivery) {
        return service.save(delivery);
    }

    @PutMapping("/{id}")
    public Delivery update(@PathVariable Long id, @RequestBody Delivery delivery) {
        Delivery d = service.findById(id);
        if (d == null) return null;

        d.setCliente(delivery.getCliente());
        d.setEndereco(delivery.getEndereco());
        d.setProduto(delivery.getProduto());
        d.setValor(delivery.getValor());

        return service.save(d);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
