/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymapp.services;

import gymapp.entities.Client;
//import gymapp.entities.Level; add level update
import java.util.ArrayList;
import java.util.Scanner;

public class ClientService {

    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Client> clientList = new ArrayList<>();

    public static void addClient() {
        Client newClient = new Client();

        System.out.println("Name: ");
        newClient.setName(input.next());

        System.out.println("ID: ");
        newClient.setId(input.nextInt());

        System.out.println("Age: ");
        newClient.setAge(input.nextByte());

        System.out.println("Height");
        newClient.setHeight(input.nextShort());

        System.out.println("Weight: ");
        newClient.setWeight(input.nextShort());

        System.out.println("Goal: ");
        newClient.setGoal(input.next());

        clientList.add(newClient);
    }

    public static void showClientList() {
        
        clientList.forEach(client -> System.out.println(client.toString()));
    }
    
    public static void updateClient(int id) {
        
        Client client = searchClient(id);

        if (client != null) {

            System.out.println("Name: ");
            client.setName(input.next());

            System.out.println("Age: ");
            client.setAge(input.nextByte());

            System.out.println("Height");
            client.setHeight(input.nextShort());

            System.out.println("Weight: ");
            client.setWeight(input.nextShort());

            System.out.println("Goal: ");
            client.setGoal(input.next());
            
            System.out.println("");
            System.out.println("Client updated!");
            
        } else {
            System.out.println("Member not found.");
        }
    }

    static Client searchClient(int id) {
        
        Client clientFound = null;

        for (Client client : clientList) {
            
            if (client.getId() == id) {
                
                clientFound = client;
            }
            break;
        }
        return clientFound;
    }

    public static void removeClient(int id) {
        
        Client client = searchClient(id);
        
        if (client != null) {
            clientList.remove(client);
        } else {
            System.out.println("Member doesn't exist, can't delete an unexistent member.");
        }
    }
    
    // MENU
    public static void menu(){
        int option;
        
        do{
            System.out.println("_______________________________________");
            System.out.println("_____________CLIENT MENU_______________");
            System.out.println("1. New Client");
            System.out.println("2. Update Client");
            System.out.println("3. Delete Client");
            System.out.println("4. Client List");
            System.out.println("5. EXIT to Main Menu");
            System.out.println("_______________________________________");

            option = input.nextInt();
            int id;

            switch (option) {
                case 1: // Create Client
                    addClient();
                    break;

                case 2: // Update Client
                    System.out.println("Enter client ID: ");
                    id = input.nextInt();

                    updateClient(id);
                    break;

                case 3: // Delete Client
                    System.out.println("Enter client ID: ");
                    id = input.nextInt();

                    removeClient(id);
                    break;

                case 4: // Show Client List
                    showClientList();
                    break;

            }           
        } while (option < 5);

    }
    
}