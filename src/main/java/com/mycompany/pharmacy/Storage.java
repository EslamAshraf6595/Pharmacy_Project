/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

/**
 *
 * @author mohamed
 */
import java.util.*;
public class Storage {
    private int pharmaSpace;
    private double sale;
    private ArrayList<Drug> storage =new ArrayList<Drug>(); 
    


public Storage(int pharmaSpace) {
       this.pharmaSpace = pharmaSpace;
      this.sale=0;
       
    }

    public int getPharmaSpace() {
        return pharmaSpace;
    }

    public double getSale() {
        return sale;
    }

    public void incrementSale(double sale) {
        this.sale += sale;
    }

}