package com.nanshan.springbootmvctest.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@Builder
public class Product {

    private Long id;
    private String name;
    private BigDecimal price;

}
