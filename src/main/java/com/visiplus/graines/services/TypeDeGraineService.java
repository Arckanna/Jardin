package com.visiplus.graines.services;

import com.visiplus.graines.business.TypeDeGraine;
import com.visiplus.graines.DAO.TypeDeGraineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeDeGraineService {
    private final TypeDeGraineRepository typeDeGraineRepository;

    public TypeDeGraineService(TypeDeGraineRepository typeDeGraineRepository) {
        this.typeDeGraineRepository = typeDeGraineRepository;
    }

    public List<TypeDeGraine> getAllTypesDeGraine() {
        return typeDeGraineRepository.findAll();
    }

    public TypeDeGraine createTypeDeGraine(TypeDeGraine typeDeGraine) {
        return typeDeGraineRepository.save(typeDeGraine);
    }

    public Optional<TypeDeGraine> updateTypeDeGraine(Long id, TypeDeGraine typeDeGraine) {
        return typeDeGraineRepository.findById(id)
                .map(existingTypeDeGraine -> {
                    typeDeGraine.setId(id);
                    return typeDeGraineRepository.save(typeDeGraine);
                });
    }

    public void deleteTypeDeGraine(Long id) {
        typeDeGraineRepository.deleteById(id);
    }
}