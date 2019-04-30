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
//And implements from InReptile and InAquatic classes.
public class ReptileAquaticAnimal extends Animal implements InAquatic, InReptile{
    
    public ReptileAquaticAnimal(String type,String name, String dob, String doa, String gender, String offspring, String medication, String vaccine, String keeper) {
        super(type, name, dob, doa, gender, offspring, medication, vaccine, keeper);
    }

    public ReptileAquaticAnimal() {
    }
    
    public String animalType(){
            return "I'm a Reptile";
 
    
    }
    
}
