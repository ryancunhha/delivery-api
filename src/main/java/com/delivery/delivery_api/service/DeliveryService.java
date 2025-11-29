package com.delivery.delivery_api.service;

import com.delivery.delivery_api.model.Delivery;
import com.delivery.delivery_api.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    private final DeliveryRepository repository;

    public DeliveryService(DeliveryRepository repository) {
        this.repository = repository;
    }

    public List<Delivery> findAll() {
        return repository.findAll();
    }

    public Delivery findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Delivery save(Delivery delivery) {
        return repository.save(delivery);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
