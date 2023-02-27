package com.example.hardwarestorewarehouse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface WarehouseRepository extends JpaRepository<Machine, Long>{
    @Query("SELECT p FROM Warehouse p WHERE CONCAT(p.equipment_type, '', p.equipment_group, '', p.date_imported, '', p.date_exported, '', p.driver_name) LIKE %?1%")
    List<Machine> search(String keywoard);
}
