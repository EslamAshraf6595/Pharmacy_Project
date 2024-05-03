/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

/**
 *
 * @author mohamed
 */
public class Drug {
    private String drugName;
    private int drugId;
    private double drugPrice;
    private String drugCategory;
    private int drugAvailableQ;

    public Drug(String drugName, int drugId, double drugPrice, String drugCategory, int drugAvailableQ) {
        this.drugName = drugName;
        this.drugId = drugId;
        this.drugPrice = drugPrice;
        this.drugCategory = drugCategory;
        this.drugAvailableQ = drugAvailableQ;
    }

    public String getDrugName() {
        return drugName;
    }

    public int getDrugId() {
        return drugId;
    }

    public double getDrugPrice() {
        return drugPrice;
    }

    public String getDrugCategory() {
        return drugCategory;
    }

    public int getDrugAvailableQ() {
        return drugAvailableQ;
    }
    
}
