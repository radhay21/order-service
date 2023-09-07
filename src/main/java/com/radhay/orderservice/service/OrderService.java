package com.radhay.orderservice.service;

import com.radhay.orderservice.dto.OrderLineItems;
import com.radhay.orderservice.dto.OrderRequest;
import com.radhay.orderservice.dto.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderService {

    public OrderResponse createOrder(OrderRequest orderRequest){
        List<OrderLineItems> orderItemsList = orderRequest.getOrderItemsList();

        for(OrderLineItems order: orderItemsList){

        }
        OrderResponse orderResponse = new OrderResponse();
        return orderResponse;
    }
}
