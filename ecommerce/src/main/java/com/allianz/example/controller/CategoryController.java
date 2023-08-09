package com.allianz.example.controller;

import com.allianz.example.database.entity.CategoryEntity;
import com.allianz.example.database.entity.PersonEntity;
import com.allianz.example.model.CategoryDTO;
import com.allianz.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("CategoryDTO")
public class CategoryController {

        @Autowired
        CategoryService categoryService;

        @GetMapping("CategoryDTO")
        public ResponseEntity<CategoryDTO> CategoryDTOApi() {

            CategoryDTO CategoryDTO = new CategoryDTO();

            CategoryDTO.setName("Furkan");
            return new ResponseEntity<>(CategoryDTO, HttpStatus.OK);
        }

        @GetMapping("CategoryDTO/{CategoryDTOId}")
        public ResponseEntity<CategoryDTO> CategoryDTOGetByPersonDTOIdApi(@PathVariable int CategoryDTOId) {
            CategoryDTO CategoryDTO = new CategoryDTO();
            return new ResponseEntity<>(CategoryDTO, HttpStatus.OK);
        }

        @GetMapping("PersonDTO-by-request-param")
        public ResponseEntity<CategoryDTO> PersonDTOGetByPersonDTOIdRequestParamApi(@RequestParam String name, @RequestParam list<Product> produc ) {




            return new ResponseEntity<>(CategoryDTO, HttpStatus.OK);
        }



        @DeleteMapping("PersonDTO/{name}")
        public ResponseEntity<Boolean> deletePersonDTO(@PathVariable UUID uuid) {

            Boolean isDeleted = categoryService.deleteCategoryByName(name);
            if (isDeleted) {
                return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(Boolean.FALSE, HttpStatus.NOT_FOUND);
            }
        }


        @GetMapping("PersonDTO-list-by-name-start-with/{key}")
        public ResponseEntity<List<PersonEntity>> getPersonDTOListByNameStartWith(@PathVariable String key) {

            return new ResponseEntity<>(categoryService.getCategoryNameStartWith(key), HttpStatus.OK);
        }


        @GetMapping("PersonDTO-list-by-name-i-contains/{key}")
        public ResponseEntity<List<PersonEntity>> getPersonDTOListByNameICOntains(@PathVariable String key) {
            return new ResponseEntity<>(categoryService.getPersonNameIContains(key), HttpStatus.OK);
        }


        @GetMapping("PersonDTO-list-by-name-surname-start-with/name/{name}/surname/{surname}")
        public ResponseEntity<List<PersonEntity>> getPersonDTOListByNameICOntains(
                @PathVariable String name, @PathVariable String surname) {
            return new ResponseEntity<>(
                    categoryService.getPersonNameStartWithAndSurnameStartWith(name, surname), HttpStatus.OK);
        }


        @GetMapping("PersonDTO-by-uuid/{uuid}")
        public ResponseEntity<PersonEntity> getPersonDTOByUUID(@PathVariable UUID uuid) {

            PersonEntity PersonEntity = categoryService.getCategoryByUUID(uuid);

            if (PersonEntity != null) {

                return new ResponseEntity<>(PersonEntity, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }


        }

        @PutMapping("PersonDTO/{uuid}")
        public ResponseEntity<PersonEntity> updatePersonDTOByUUID(@PathVariable UUID uuid,
                                                                  @RequestBody CategoryEntity CategoryEntityNew) {
            CategoryEntity categoryEntity = categoryService.updateCategoryByUUID(uuid, CategoryEntityNew);
            if (CategoryEntity != null) {

                return new ResponseEntity<>(CategoryEntity, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }

        }

    }
