package com.allianz.example.model;

import com.allianz.example.database.entity.ProductEntity;
import com.allianz.example.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO extends BaseEntity {
    private ProductEntity product;
    @Column
    private Integer quantity;
    @Column
    private BigDecimal sellPrice;
}
