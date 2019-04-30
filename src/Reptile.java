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
public class Reptile extends Animal{
    
	//Constructor of Reptile and extends from Animal
    public Reptile(String type,String name, String dob, String doa, String gender, String offspring, String medication, String vaccine, String keeper) {
        super(type, name, dob, doa, gender, offspring, medication, vaccine, keeper);
    }

    public Reptile() {
    }
    
    public String type(){
            return "I'm a Reptile";
 
    
    }
    
}
