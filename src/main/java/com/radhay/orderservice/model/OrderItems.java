package com.radhay.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "order_line_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String order_number;
    public String skucode;
    public BigDecimal price;
    public Integer quantity;

}
