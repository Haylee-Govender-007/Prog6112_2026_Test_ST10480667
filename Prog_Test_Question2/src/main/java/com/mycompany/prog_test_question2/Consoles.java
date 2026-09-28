/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog_test_question2;

/**
 *
 * @author emeris
 */
public abstract class Consoles implements iConsole {
    
    // Variables to store the following
    private String consoleType; 
    private String store; 
    private int totalSales; 

    // Constructor to accept data
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getters
    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
    
    
    
    
}
