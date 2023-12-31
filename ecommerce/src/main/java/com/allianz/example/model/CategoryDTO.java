package com.allianz.example.model;

import com.allianz.example.database.entity.ProductEntity;
import com.allianz.example.util.BaseDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class CategoryDTO extends BaseDTO {
    private String name;
    private Set<ProductEntity> productList = new HashSet<>();


}

