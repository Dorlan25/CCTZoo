/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

/**
 *
 * @author dorla
 */
//Class for Hybrid Animals that extends from Animal Class
//And implements from InMammal and InAquatic classes.
public class MammalAquaticAnimal extends Animal implements InMammal, InAquatic {
    

    
    public MammalAquaticAnimal(){
        
    }

//    public MammalAquaticAnimal(String type, String name, String dob, String doa, String gender, String offspring, String medication, String vaccine, String keeperName) {
//        super(type,name, dob, doa, gender, offspring, medication, vaccine, keeperName);
//    }

    public MammalAquaticAnimal(String type, String name, String dob, String doa, String gender, String offspring, String medication, String vaccine, String keeperName) {
        super(type, name, dob, doa, gender, offspring, medication, vaccine, keeperName);
    }
        
    
   
    public String animalType(){
            return "I'm a mammalAquatic Aninmal";
 
    
    }
    
    //Just some data that we used when we started to code the program to test it
    
//   public String[] mammalAquaticName = new String[]{"Leon", "Tigre", " combola"};
//    
//   public String[] mammalAquaticDob = new String[]{"12/01/2001", "10/04/2002", " 28/09/2000"};
//   
//   public String[] mammalAquaticDoa = new String[]{"12/01/2011", "10/04/2012", " 28/09/2013"};
//    
//   public String[] mammalAquaticGender = new String[]{"Male", "Female"};
//   
//   public String[] mammalAquaticOffspring = new String[]{"five", " four", "seven"};
//   
//   public String[] mammalAquaticMedication = new String[]{"amoxicina", "aspirine", " ampicilina"};
//   
//   public String[] mammalAquaticVaccine = new String[]{"True", "False"};
//   
//   public String[] mammalAquaticExhibitNumber = new String[]{"9.000", "9.255", " 9325"};
   
   
   
   
   
   

}