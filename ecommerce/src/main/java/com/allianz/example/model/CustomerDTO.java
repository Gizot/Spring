package com.allianz.example.model;

import com.allianz.example.database.entity.PersonEntity;
import com.allianz.example.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDTO extends BaseEntity {
    private PersonEntity person;
    private Boolean isCorporate;
    private String companyName;
    private String taxNumber;
    private String taxOffice;
    private List<OrderDTO> orderList;

}
