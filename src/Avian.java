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
public class Avian extends Animal implements InAvian {

    public Avian(String type, String name, String dob, String doa, String gender, String offspring, String medication, String vaccine, String keeper) {
        super(type, name, dob, doa, gender, offspring, medication, vaccine, keeper);
    }

    public Avian() {
    }

    
    
    public String animalType(){
            return "I'm a avian";
 
    
    }

}
