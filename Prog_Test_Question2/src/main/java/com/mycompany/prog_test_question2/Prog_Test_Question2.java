/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_test_question2;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class Prog_Test_Question2 {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        // Get information from the user
        System.out.println("Select the console type: ");
        
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        int consoleChoice = kb.nextInt(); 
        kb.nextLine();
        
        
    String consoleType;
        // Determine the console type based on the user's choice
    switch (consoleChoice) {
        case 1:
            consoleType = "PS5";
        break;
        case 2:
            consoleType = "XBOX";
        break;
        case 3:
            consoleType = "SWITCH";
        break;
        default:
            consoleType = "UNKNOWN";
            System.out.println("Invalid console choice.");
        break;
}

        
        System.out.print("Enter the store: ");
        String storeType = kb.nextLine(); 
        
        System.out.println("Enter the total sales of "+consoleType+" for "+storeType+": ");
        int totalSales = kb.nextInt();

         // Create consoleSales object
        ConsoleSales consoleSales =new ConsoleSales(consoleType, storeType,totalSales);

        // Display the report
        System.out.println();
        consoleSales.printReport();
       
    }
}
