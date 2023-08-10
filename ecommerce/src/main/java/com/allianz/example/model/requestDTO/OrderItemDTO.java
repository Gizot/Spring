package com.allianz.example.model.requestDTO;

import com.allianz.example.database.entity.ProductEntity;
import com.allianz.example.util.BaseDTO;
import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO extends BaseDTO {
    private ProductEntity product;
    @Column
    private Integer quantity;
    @Column
    private BigDecimal sellPrice;
}
