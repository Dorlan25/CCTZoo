/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dorla
 */
public abstract class Animal {
     private Scanner scanner = new Scanner(System.in);
    
     
    private String type;
    private String name;
    private String dob;
    private String doa;
    private String gender;
    private String offspring;
    private String medication;
    private String vaccine;
    private String keeperName;
    private final int exhibitNumber;
    private static int aux = 0;
    
    public Animal(){
        this.exhibitNumber = aux;
        this.aux++;
    }
    //Constructor
    public Animal(String type,String name, String dob, String doa, String gender,
            String offspring, String medication, String vaccine,String keeperName){
        
        this.type = type;
        this.name = name;
        this.dob = dob;
        this.doa = doa;
        this.gender = gender;
        this.offspring = offspring;
        this.medication = medication;
        this.vaccine = vaccine;
        this.keeperName = keeperName;
        this.exhibitNumber = aux;
        this.aux++;
                
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeeperName() {
        return keeperName;
    }

    public void setKeeper(String keeperName) {
        this.keeperName = keeperName;
    }

    
    
    
    
    
    public Scanner getScanner() {
        return scanner;
    }
   

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getDoa() {
        return doa;
    }

    public String getGender() {
        return gender;
    }

    public String getOffspring() {
        return offspring;
    }

    public String getMedication() {
        return medication;
    }

    public String getVaccine() {
        return vaccine;
    }

    public int getExhibitNumber() {
        return exhibitNumber;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOffspring(String offspring) {
        this.offspring = offspring;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    @Override
	//To String method that will display the Animal Attributes
    public String toString() {
        return  "Type = " + type +" \n "
                + "     Name = " + name +" \n "
                + "     Date of Birthday: " +dob+" \n "
                + "     Date of Arrival: "+doa+" \n "
                + "     Gender: "+gender+" \n "
		+ "     Offspring: "+offspring+" \n "
		+ "     Medication: "+medication+" \n "
		+ "     Vaccine: "+vaccine+" \n "
                + "     Exhibit number: "+exhibitNumber+" \n "
                + "     Keeper name: " + keeperName + " \n "
                + "\n ";
         }

    
   
    
    
}
