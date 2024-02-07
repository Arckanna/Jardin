package com.visiplus.graines.controllers;

import com.visiplus.graines.business.TypeDeGraine;
import com.visiplus.graines.services.TypeDeGraineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/types-de-graine")
public class TypeDeGraineController {

    @Autowired
    private TypeDeGraineService typeDeGraineService;

    @GetMapping
    public ResponseEntity<List<TypeDeGraine>> getAllTypesDeGraine() {
        return ResponseEntity.ok(typeDeGraineService.getAllTypesDeGraine());
    }

    @PostMapping
    public ResponseEntity<TypeDeGraine> createTypeDeGraine(@RequestBody TypeDeGraine typeDeGraine) {
        return new ResponseEntity<>(typeDeGraineService.createTypeDeGraine(typeDeGraine), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TypeDeGraine> updateTypeDeGraine(@PathVariable Long id, @RequestBody TypeDeGraine typeDeGraine) {
        return ResponseEntity.ok(typeDeGraineService.updateTypeDeGraine(id, typeDeGraine));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTypeDeGraine(@PathVariable Long id) {
        typeDeGraineService.deleteTypeDeGraine(id);
        return ResponseEntity.noContent().build();
    }
}