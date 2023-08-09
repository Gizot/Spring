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
    List<CategoryEntity> findAllByNameStartingWithCategory(String key);

    List<CategoryEntity> findAllByNameContainsIgnoreCaseForCategory(String key);


    List<CategoryEntity> findAllByNameStartingWithOrSurnameStartingWithforCategory(String name, String surname);


    //sql injection "select * from User where username="+username+" and password="+passsword +"or 1=1"

    @Query("select p from CategoryEntity  p where p.name = ?1 ")
    List<PersonEntity> getCategoryAllByName(String name, String surname);


    @Modifying
    @Query("delete from CategoryEntity p where p.name=?1")
    void deleteCategoryByName(String name);


    Optional<CategoryEntity> findByName(String name);

    @Modifying
    @Query("delete from CategoryEntity p where p.name=?1")
    void deleteCategoryByUUID(UUID uuid);

    long deleteByUuid(UUID uuid);

}
