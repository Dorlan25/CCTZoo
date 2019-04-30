/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import java.util.ArrayList;

/**
 *
 * @author dorla
 */
public class Keeper {
    
	//ArrayList to store all the keeper names
    private ArrayList<Keeper> myKeeper = new ArrayList<Keeper>();
    
    
    private String keeperName;
    
    public Keeper(){
    }
    
    public Keeper(String keeperName){
        this.keeperName = keeperName;
    }

    public String getKeeperName() {
        return keeperName;
    }

    public void setKeeperName(String keeperName) {
        this.keeperName = keeperName;
    }

    @Override
    public String toString() {
        return   keeperName ;
    }
    
    
    
    
    
   
    
    
}
