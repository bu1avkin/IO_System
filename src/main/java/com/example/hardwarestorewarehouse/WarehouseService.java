package com.example.hardwarestorewarehouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository repo;

    public List<Machine> listAll(String keyword){
        if (keyword != null){
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public void save(Machine warehouse) {
        repo.save(warehouse);
    }

    public Machine get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
