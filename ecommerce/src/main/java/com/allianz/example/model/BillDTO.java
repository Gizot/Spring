package com.allianz.example.model;

import com.allianz.example.database.entity.OrderEntity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class BillDTO {
    private String billNo;

    private LocalDateTime billDate;
    private BigDecimal taxRate;

    private BigDecimal taxAmount;

    private BigDecimal totalSellNetPrice;

    private BigDecimal totalSellPrice;

    private OrderEntity order;

}
