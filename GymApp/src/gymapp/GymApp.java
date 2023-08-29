/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymapp;

import gymapp.services.ClientService;
import gymapp.services.WorkoutService;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class GymApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int option;
        
        System.out.println("Welcome to SportEdge!");
                        
        do{
        System.out.println("_______________________________________");
        System.out.println("_______________MAIN MENU_______________");
        System.out.println("1. Client Menu");
        System.out.println("2. Workout Menu");
        System.out.println("3. EXIT");
        System.out.println("_______________________________________");
        
        option = input.nextInt();
        
        if (option == 1){
            
            ClientService.menu();
        
        } else if (option == 2){
        
            WorkoutService.menu();
        }
        
        } while (option < 3);
        
        System.out.println("Exiting the system...");
        System.out.println("");
        System.out.println("See you soon!");
                
    }
    
}
