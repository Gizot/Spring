package com.allianz.example.service;

import com.allianz.example.database.entity.AddressEntity;
import com.allianz.example.database.entity.CategoryEntity;
import com.allianz.example.database.entity.PersonEntity;
import com.allianz.example.database.repository.CategoryEntityRepository;
import com.allianz.example.mapper.CategoryMapper;
import com.allianz.example.model.AddressDTO;
import com.allianz.example.model.CategoryDTO;
import com.allianz.example.model.requestDTO.CategoryRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class CategoryService {

    @Autowired
    CategoryEntityRepository categoryEntityRepository;

    @Autowired
    CategoryMapper categoryMapper;

    public CategoryDTO save(CategoryRequestDTO dto) {

        CategoryEntity categoryEntity = categoryMapper.requestDTOToEntity(dto);

        categoryEntityRepository.save(categoryEntity);

        return categoryMapper.entityToDTO(categoryEntity);
    }


    public List<CategoryDTO> getAll() {
        List<CategoryEntity> categoryEntityList = categoryEntityRepository.findAll();
        return categoryMapper.entityListToDTOList(categoryEntityList);
    }

    public PersonEntity getPersonByName(String name) {

        Optional<CategoryEntity> categoryEntityOptional = categoryEntityRepository.findByName(name);

        if (categoryEntityOptional.isPresent()) {
            return categoryEntityOptional;
        } else {
            return null;
        }

    }

    @Transactional
    public Boolean deletePersonByName(String name) {
        CategoryEntity categoryEntity = getCategoryByName(name);

        if (categoryEntity != null) {
            personEntityRepository.deleteById(personEntity.getId());
            return true;
        } else {
            return false;
        }
    }


}
