package com.allianz.example.database.repository;

import com.allianz.example.database.entity.AddressEntity;
import com.allianz.example.database.entity.CategoryEntity;
import com.allianz.example.database.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Long> {


}
