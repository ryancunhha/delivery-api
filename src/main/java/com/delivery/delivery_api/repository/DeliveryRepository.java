package com.delivery.delivery_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.delivery.delivery_api.model.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {}
