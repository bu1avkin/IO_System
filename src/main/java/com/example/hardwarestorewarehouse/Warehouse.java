package com.example.hardwarestorewarehouse;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String equipment_type;
    private String equipment_group;
    private Date date_imported;
    private Date date_exported;
    private String driver_name;

    protected Warehouse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipmentType() {
        return equipment_type;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipment_type = equipmentType;
    }

    public String getEquipmentGroup() {
        return equipment_group;
    }

    public void setEquipmentGroup(String equipmentGroup) {
        this.equipment_group = equipmentGroup;
    }

    public Date getDateImported() {
        return date_imported;
    }

    public void setDateImported(Date dateImported) {
        this.date_imported = dateImported;
    }

    public Date getDateExported() {
        return date_exported;
    }

    public void setDateExported(Date dateExported) {
        this.date_exported = dateExported;
    }

    public String getDriverName() {
        return driver_name;
    }

    public void setDriverName(String driverName) {
        this.driver_name = driverName;
    }
}
