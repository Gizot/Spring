package com.allianz.example.model;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
public class SettingsDTO extends BaseDTO {
    private String key;
    private String value;
}
