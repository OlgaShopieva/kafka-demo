package com.example.consumer.service.messaging;

import com.example.consumer.domain.Order;
import com.example.consumer.service.dto.OrderDto;

public interface OrderService {
    Order save(OrderDto clientDto);
}