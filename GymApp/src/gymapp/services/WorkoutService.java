/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymapp.services;

    import gymapp.entities.Level;
    import gymapp.entities.Workout;
    import java.util.ArrayList;
    import java.util.Scanner;

/**
 *
 * @author carol
 */

public class WorkoutService {
    
    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Workout> workoutList = new ArrayList<>();

    public static void newWorkout() {
        Workout newWorkout = new Workout();

        System.out.println("Workout name: ");
        newWorkout.setName(input.next());

        System.out.println("Workout ID: ");
        newWorkout.setId(input.nextInt());

        System.out.println("Workout length (in hours): ");
        newWorkout.setLength(input.nextInt());
        
        System.out.println("Difficulty: ");
        System.out.println("1. LOW");
        System.out.println("2. MEDIUM");
        System.out.println("3. HIGH");

        int option2 = input.nextInt();

        switch (option2){
            case 1:
                newWorkout.setDifficulty(Level.LOW);
                break;

            case 2:
                newWorkout.setDifficulty(Level.MEDIUM);
                break;
                
            case 3:
                newWorkout.setDifficulty(Level.HIGH);
                break;
                
            default:
                System.out.println("invalid option...");
                break;
        }

        System.out.println("Workout description: ");
        newWorkout.setDescription(input.next());

        workoutList.add(newWorkout);
    }

    public static void showWorkouts() {
        workoutList.forEach(workout -> System.out.println(workout.toString()));
    }

    public static void updateWorkout(int id) {
        
        Workout workoutToUpdate = searchWorkout(id);

        if (workoutToUpdate != null) {
            System.out.println("Workout name: ");
            workoutToUpdate.setName(input.next());

            System.out.println("Workout length (in hours): ");
            workoutToUpdate.setLength(input.nextInt());

            System.out.println("Difficulty: ");
            System.out.println("1. LOW");
            System.out.println("2. MEDIUM");
            System.out.println("3. HIGH");

            int option2 = input.nextInt();

            switch (option2) {
                case 1:
                    workoutToUpdate.setDifficulty(Level.LOW);
                    break;

                case 2:
                    workoutToUpdate.setDifficulty(Level.MEDIUM);
                    break;

                case 3:
                    workoutToUpdate.setDifficulty(Level.HIGH);
                    break;

                default:
                    System.out.println("invalid option...");
                    break;
            }

            System.out.println("Workout description: "); 
            workoutToUpdate.setDescription(input.next());
            
            System.out.println("");
            System.out.println("Workout updated!");   
            
        } else {
            System.out.println("Workout not found.");
        }
    }

    static Workout searchWorkout(int id) {

        Workout workoutFound = null;

        for (Workout workout : workoutList) {
            
            if (workout.getId() == id) {
            
                workoutFound = workout;
            }
            
            break;
        }
        
        return workoutFound;
    }

    public static void deleteWorkout(int id) {
        
        Workout workoutToDelete = searchWorkout(id);
        
        if (workoutToDelete != null) {
            
            workoutList.remove(workoutToDelete);
        
        } else {
        
            System.out.println("Workout doesn't exist, can't delete an unexistent workout.");
        }
    }
    
    public static void menu(){
        
        int option;
        
        do{
            System.out.println("________________________________________");
            System.out.println("______________WORKOUT MENU______________");
            System.out.println("1. New Workout");
            System.out.println("2. Update Workout");
            System.out.println("3. Delete Wokout");
            System.out.println("4. Show Workout List");
            System.out.println("5. EXIT to Main Menu");
            System.out.println("________________________________________");

            option = input.nextInt();
            int id;

            switch (option) {
                
                case 1: // New Workout
                    
                    WorkoutService.newWorkout();
                    break;

                case 2: // Update Workout
                    
                    System.out.println("Workout ID: ");
                    id = input.nextInt();
                    
                    WorkoutService.updateWorkout(id);
                    break;

                case 3: // Delete Wokout
                    
                    System.out.println("Enter client ID: ");
                    id = input.nextInt();

                    WorkoutService.deleteWorkout(id);
                    break;

                case 4: // Show Workout List
                    
                    WorkoutService.showWorkouts();
                    break;
            }           
        } while (option < 5);

    }    
}
