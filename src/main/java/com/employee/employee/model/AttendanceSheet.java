package com.employee.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AttendanceSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String maNV;
    private String date;
    private String timein;
    private String timeout;

    public AttendanceSheet(String maNV, String date, String timein, String timeout) {
        this.maNV = maNV;
        this.date = date;
        this.timein = timein;
        this.timeout = timeout;

    }
    public AttendanceSheet() {}

    @Override
    public String toString() {
        return "AttendanceSheet{" +
                "id=" + id +
                ", maNV='" + maNV + '\'' +
                ", date='" + date + '\'' +
                ", timein='" + timein + '\'' +
                ", timeout='" + timeout + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimein() {
        return timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}
