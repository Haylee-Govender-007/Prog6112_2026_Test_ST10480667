/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_test_question1;

/**
 *
 * @author emeris
 */
public class Prog_Test_Question1 {

    public static void main(String[] args) {
        
         // Array used to store the names of the gaming consoles
         String[] gamingConsole = {"PS5", "XBOX", "SWTICH"};
         
         // Array used to store cities
         String [] city = {"Cape Town", "Port Elizabeth", "Pretoria"};
         
         // 2D Array used to store number of sales
         int[][] numOfSales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
         
         // Print the report
        System.out.println("-".repeat(50));
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-".repeat(50));
        System.out.print("\t\t\t");
        
        // for loop used to display console names
        for (String Console : gamingConsole) {
            System.out.print(Console + "\t");
        }
        
         System.out.println();
         
         // For loop used to display number of sales in rows and colums format
         for (int row = 0; row < numOfSales.length; row++) {
            System.out.print(city[row] + "\t\t");
            for (int col = 0; col < numOfSales[row].length; col++) {
                System.out.print(numOfSales[row][col] + "\t");
            }
            System.out.println();
        }
         
         // Displaying heading
        System.out.println("-".repeat(50));
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-".repeat(50));
          
        // Variables used to find the city with the most sales 
        int highestTotal = 0;
        String highestCity = "";
        
         // For loop used to calculate total number of sales for ech city
         for (int i = 0; i < city.length; i++) {
            
            int total = numOfSales[i][0] + numOfSales[i][1] + numOfSales[i][2];
            
            // Display city with total
             System.out.println(city[i] + "\t"+total);
             
              // Check for the city with the most sales
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = city[i];
            }
             
        }
         
        // Displaying the city with most sales  
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + highestCity.toUpperCase());
        System.out.println("-".repeat(50));
        
    }
}
