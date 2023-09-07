package com.radhay.orderservice.dto;

import com.radhay.orderservice.model.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    public List<OrderLineItems> orderItemsList;

}
