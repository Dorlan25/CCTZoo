/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo.setuphelper;

import cctzoo.Animal;
import cctzoo.Avian;
import cctzoo.Keeper;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dorla
 */
public class Menu {
     
    private ArrayList<Animal> myArray = new ArrayList<Animal>();
    private ArrayList<Keeper> myArray2 = new ArrayList<Keeper>();
    private static Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
	//This menu will be the first content to appear in the console
     public void showMainMenu(){
        System.out.println("Enter your choice below");
	System.out.println("Enter 1 to add an animal");
	System.out.println("Enter 2 to add a keeper");
	System.out.println("Enter 3 to search an animal");
	System.out.println("Enter 4 to search a keeper");
	System.out.println("Enter 5 to update an animal");
	System.out.println("Enter 6 to update a keeper");
        System.out.println("Enter 7 to see the list of animals on CCTZOO");
	System.out.println("Enter 8 show menu");
        System.out.println("Enter 9 to see the list of keeper on CCTZOO");
        System.out.println("Enter 0 exit the program");
        
         int choice = 0;
		choice = scanner.nextInt();
		scanner.nextLine();
		//Diferent options to type, depends what the user chooses
		//the program will perform an activity
		switch(choice){
                    
                    case 1:
                        addAnimals();
                        break;
                    case 2:
                        addKeeper();
                        break;
                    case 3:
                        searchAnimal();
                        break;
                    case 4:
                        searchKeeper();
                        break;
                    case 5:
                        modifyAnimal();
                        break;
                    case 6:
                        modifyKeeper();
                    case 7: 
                        printListOfAnimals();
                        break;
                    case 8: 
                        showMainMenu();
                        break;
                    case 9:
                        printListOfKeepers();
                        break;
                    case 0:
                         endProgram();  
                        break;
                }
     }
    
  
     
    public void createOnTheFly(){
        myArray = Data.ramdomiseData(50);
        int aux =0;
        for (Animal a : myArray) {
            
           // System.out.println(a);
        }    
    }
     
     public void createOnTheFlyKeepers(){
        myArray2 = Data2.ramdomiseData(50);
        int aux =0;
        for (Keeper a : myArray2) {
            
           // System.out.println(a);
        }    
    }
    
    
    
    
    
     
    public void printListOfAnimals(){
        for(int i = 0; i < myArray.size(); i++){
            System.out.println((i+1) + " . " + myArray.get(i));
        }
         smallMenu();
     }
   
     public void printListOfKeepers(){
         
        for(int i = 0; i < myArray2.size(); i++){
            int  n = rand.nextInt(10) + 1;
            //System.out.println((i+1) + " . " + myArray2.get(i)+ " is on charge of " + myArray.get(1));
          System.out.println((i+1) + " . " + myArray2.get(i)+ " is on charge of " + n + " animals");
        }
         smallMenu();
     }
    
     
    
    public void addAnimals(){
        System.out.println("Please enter the type of the animal\nBetween these types: (Mammal/Reptile/Aquatic/Avian)");
        String typeA = scanner.nextLine();
        System.out.println("Please enter the name of the animal");
        String name = scanner.nextLine();
        System.out.println("Please enter the date of birth of the animal\nIn format DD/MM/YYYY:");
        String dob = scanner.nextLine();
        System.out.println("Please enter the day of arrival of the animal\nIn format DD/MM/YYYY:");
        String doa = scanner.nextLine();
        System.out.println("Please enter the gender of the animal\n(Male/Female):");
        String gender = scanner.nextLine();
        System.out.println("Please enter the if the animal has offspring\n(Yes or No):");
        String offspring = scanner.nextLine();
        System.out.println("Please enter if the animal take any  medication");
        String medication = scanner.nextLine();
        System.out.println("Please enter if the animal has been vaccinated\n(Yes or No)");
        String vaccine = scanner.nextLine();
        System.out.println("Please enter the name of the keeper");
        String keeperN = scanner.nextLine();
                 
        myArray.add(new Avian(typeA, name, dob, doa, gender,offspring, medication, vaccine, keeperN ));
                 
        System.out.println("Your animal has been added successfully");
        System.out.println("Enter 1 to go to the main menu");
        System.out.println("Enter 2 to see the list of animals including the one that you add");
        System.out.println("Enter 3 to exit the program");
            int option = 0;
            option = scanner.nextInt();
            switch(option){
                case 1:
                    showMainMenu();
                    break;               
                case 2:
                    printListOfAnimals();
                    break;                    
                case 3:
                   endProgram(); 
                   break;
            }
         
    }
     
     
    
    public void addKeeper(){
        System.out.println("Please enter the name of the keeper");
        String name = scanner.nextLine();       
        myArray2.add(new Keeper(name));
                 
        System.out.println("Your animal has been added successfully");
        System.out.println("Enter 1 to go to the main menu");
        System.out.println("Enter 2 to see the list of Keepers including the one that you add");
        System.out.println("Enter 3 to exit the program");
            int option = 0;
            option = scanner.nextInt();
            switch(option){
                case 1:
                    showMainMenu();
                    break;              
                case 2:
                    printListOfKeepers();
                    break;                   
                case 3:
                    endProgram(); 
                    break;
            }
    }
    
        
    
    public void searchAnimal(){
        System.out.println("Please enter the name of animal that you would like to search");
        String name = scanner.nextLine();
            for (Animal a : myArray) {
                if(a.getName().equals(name)){
                    System.out.println(a);
                }
            }
            smallMenu();
    }
     
    public void searchKeeper(){
        int  n = rand.nextInt(10) + 1;
        System.out.println("Please enter the name of the keeper that you would like to search");
        String name = scanner.nextLine();
             for (Keeper a : myArray2) {
                if(a.getKeeperName().equals(name)){
                    System.out.println(a+ " is on charge of " + n + " animals");
                }
            }
        smallMenu();
    }
     
     
     public void modifyAnimal(){
        System.out.println("Enter the name of the animal that you would like to modify");
        String name = scanner.nextLine();
            for (Animal a : myArray) {
                if(a.getName().equals(name)){
                    System.out.println(a);
                    System.out.println("Enter the type of the animal");
                    String type2 = scanner.nextLine();
                    a.setType(type2);
                    System.out.println("Enter the name of the animal");
                    String name2 = scanner.nextLine();
                    a.setName(name2);
                    System.out.println("Enter the dob of the animal");
                    String dob2 = scanner.nextLine();
                    a.setDob(dob2);
                    System.out.println("Enter the doa of the animal");
                    String doa2 = scanner.nextLine();
                    a.setDoa(doa2);
                    System.out.println("Enter the gender of the animal");
                    String gender2 = scanner.nextLine();
                    a.setGender(gender2);
                    System.out.println("Enter offspring of the animal");
                    String offspring2 = scanner.nextLine();
                    a.setOffspring(offspring2);
                    System.out.println("Enter the medication of the animal");
                    String medication2 = scanner.nextLine();
                    a.setMedication(medication2);
                    System.out.println("Enter if the animals has been vaccinated");
                    String vaccine2 = scanner.nextLine();
                    a.setVaccine(vaccine2);
                    System.out.println("Enter the name of the keeper who is going to take care of the animal");
                    String keeperName = scanner.nextLine();
                    a.setKeeper(keeperName);
                }
            }
            smallMenu();
    }      
     
     
     
     
      public void modifyKeeper(){
        System.out.println("Enter the name of the keeper that you would like to modify");
        String d= null;
        String name2 = scanner.nextLine();
        
            for (Keeper a : myArray2) {
                if(a.getKeeperName().equals(name2)){
                    System.out.println(a);
                    System.out.println("Enter the name of the keeper");
                    String name = scanner.nextLine();
                    a.setKeeperName(name);  
   
                    
                }               
            }
           
            
            
            smallMenu();
    }      
     
     
     
     
    public void smallMenu(){
      
        System.out.println("Enter 1 to go to main menu or 0 to exit the program");
            int option = 0;
           option = scanner.nextInt();
           
             switch(option){
                case 1:
                    showMainMenu();
                    break;
                case 2:
                   endProgram();  
                   break;
            }
             
    }
    
    
    
    
    
    
    
    public void endProgram(){
        System.out.println("Good bye Thanks for using CCTZoo");
         System.exit(0);
         
    }
     
}
    
    
  