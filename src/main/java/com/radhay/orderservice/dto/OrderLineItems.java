package com.radhay.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItems {
    public long id;

    public String order_number;
    public String skucode;
    public BigDecimal price;
    public Integer quantity;
}
