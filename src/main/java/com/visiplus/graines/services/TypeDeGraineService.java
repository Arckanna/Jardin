package com.visiplus.graines.services;

import com.visiplus.graines.business.TypeDeGraine;
import com.visiplus.graines.DAO.TypeDeGraineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeDeGraineService {

    @Autowired
    private TypeDeGraineRepository typeDeGraineRepository;

    public List<TypeDeGraine> getAllTypesDeGraine() {
        return typeDeGraineRepository.findAll();
    }

    public TypeDeGraine createTypeDeGraine(TypeDeGraine typeDeGraine) {
        return typeDeGraineRepository.save(typeDeGraine);
    }

    public TypeDeGraine updateTypeDeGraine(Long id, TypeDeGraine typeDeGraine) {
        typeDeGraine.setId(id);
        return typeDeGraineRepository.save(typeDeGraine);
    }

    public void deleteTypeDeGraine(Long id) {
        typeDeGraineRepository.deleteById(id);
    }
}