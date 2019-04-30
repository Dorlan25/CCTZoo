/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo.setuphelper;

import cctzoo.Keeper;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dorla
 */
public class Data2 {
    
     public static ArrayList<Keeper> ramdomiseData(int numberOfAnimals) {
        
      
       String[] keeperNames = new String[]{"Nanci Laurence","Siobhan Paquin","Morton Yochum","Loralee Broderson",
            "Albertha Askins","Donnell Herod","Lucien Hora","Dawna Perin","Felicidad Delfino",
            "Malik Streeter","Rafael Carrasquillo","Harland Pinon","Carey Rosales","Tiera Rousseau",
            "Alaina Troia","Karma Convers","Marylin Jenkinson","Maybell Cambell","Shelly Draves",
            "Lanette Shah","Nigel Cruzado","Mi Bigler","Carrol Edenfield","Amos Stayer","Lakita Lassen",
            "Scot Trujillo","Ma Waxman","Denese Landwehr","Alta Gilstrap","Ward Reaves","Chantell Banerjee",
            "Roxana Hernandez","Hillary Quirion","Claire Guajardo","Salena Sibert","Rosalinda Doherty",
            "Almeta Curtis","Joselyn Tudor","Antonia Kuster","Gaynell Bitting","Garry Skidmore",
            "Kimberley Lebrun","Alfredo Bordeau","Tova Thrailkill","Josephina Pleasants",
            "Vincenza Karp","Dalila Mattocks","Sudie Bouska","Wayne Torgrimson","Lan Slape"};
        

        ArrayList<Keeper> myKeepers = new ArrayList<>();
        Random rand = new Random();

        int randomIndex = 0;
        int timesMA = 0;
        
        for (int i = 0; i < numberOfAnimals; i++) {
            
            randomIndex  = rand.nextInt(1);
            
            switch (randomIndex) {
                case 0:
                    myKeepers.add(new Keeper(keeperNames[rand.nextInt(keeperNames.length)]));
                break;
            }
        }
        return myKeepers;
    }

    
}
