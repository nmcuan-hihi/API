package com.employee.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Position {
    @Id
    private String maCV;
    private String tenCV;

    // Default constructor
    public Position() {
    }

    // Constructor with all parameters
    public Position(String maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    // Getters and setters
    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    // toString method
    @Override
    public String toString() {
        return "Position{" +
                "maCV='" + maCV + '\'' +
                ", tenCV='" + tenCV + '\'' +
                '}';
    }
}
