/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog_test_question2;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles {

    //Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
    
    // Display method
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*".repeat(50));
        System.out.println("CONSOLE TYPE: "+ getConsoleType());
        System.out.println("STORE: "+ getStore());
        System.out.println("TOTAL SALES: "+ getTotalSales());
    
    }
 
    
}
