package com.radhay.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class OrderResponse {
    public List<OrderLineItems> orderLineItemsList;
}
