/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo.setuphelper;

import cctzoo.Animal;
import cctzoo.Avian;
import cctzoo.MammalAquaticAnimal;
import cctzoo.Reptile;
import cctzoo.ReptileAquaticAnimal;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dorla
 */
//This Class stores the data for Animals such as Name, Date of Birthday,
//Date of Arrival, Gender, Offspring, Medication, Vaccine and exhibit number.
public class Data {
    
    
    public static ArrayList<Animal> ramdomiseData(int numberOfAnimals) {
        
        String[] animalType1 = new String[]{"MammalAquatic"};
        String[] animalType2 = new String[]{"Avian"};
        String[] animalType3 = new String[]{"Reptile"};
        String[] animalType4 = new String[]{"ReptileAquatic"};
         
       
       
       
        //Name for Hybrid MammalAquatic Animals
        String[] namesMammalAquatic = new String[]{"Baird's beaked whale", "Arnoux's beaked whale", "Northern bottlenose whale", 
            "Southern bottlenose whale", "Tropical bottlenose whale","Sowerby's beaked whale", 
            "Andrews' beaked whale", "Hubbs' beaked whale", "Blainville's beaked whale",
            "Risso's dolphin","Fraser's dolphin", "Atlantic white-sided dolphin", 
            "White-beaked dolphin", "Peale's dolphin", "Hourglass dolphin", "Pacific white-sided dolphin", 
            "New Zealand fur seal", "Galápagos fur seal", "Antarctic fur seal","Juan Fernández fur seal", 
            "Brown fur seal","Guadalupe fur seal","Subantarctic fur seal", "Northern fur seal", 
            "Crabeater seal", "Southern elephant seal", "Northern elephant seal", "Mediterranean monk seal",
            "Caribbean monk seal", "Hawaiian monk seal", "Ross seal"};
		
		//Date of Birthday
        String[] dob = new String[]{"20/10/2010", "05/11/2008", "01/12/2002", "29/06/2004", "22/09/2008", "18/05/2010", "29/11/2003",
            "05/09/2004", "20/10/2000", "17/02/2002", "17/04/2007", "23/08/2009", "04/08/2007",
            "25/01/2005", "30/12/2006", "11/07/2002", "23/10/2009", "24/08/2001", "12/122/2003",
            "06/11/2006", "20/02/2010", "31/03/2008", "14/05/2000", "28/09/2006", "07/07/2007"};
		
		//Date of Arrival
        String[] doa = new String[]{"20/10/2015", "05/11/2016", "01/12/2017", "29/06/2018", "22/09/2015", "18/05/2016", "29/11/2017",
            "05/09/2018", "20/10/2016", "17/02/2017", "17/04/2018", "23/08/2016", "04/08/2017",
            "25/01/2018", "30/12/2016", "11/07/2017", "23/10/2018", "24/08/2015", "12/122/2016",
            "06/11/2017", "20/02/2018", "31/03/2015", "14/05/2016", "28/09/2017", "07/07/2017"};
		
		//Gender
        String[] gender = new String[]{"Male", "Female"};
		
		//Offspring
        String[] offspring = new String[]{"Yes", "No"};
		
		//Medication
        String[] medication = new String[]{"Actotaxime", "Aloggel", "Fexozepam", "Methozal", "Aclobyclor", "Endoprotin", "Fellac",
            "Pantolozin", "Calcinorphine", "Alphabide", "Flexesine", "Butaphilus", "Antaphine",
            "Paracetamol", "Amoxicilina", "Ampicilina", "Comzumab", "Parotora", "Aplennuma", 
            "Dasadox", "Paroracil", "Aliset", "Acantone", "Trirudin", "Tracbazine"};
		
		//Vaccine
        String[] vaccine = new String[]{"Yes", "No"};
        
		//Name for avian animals
        String[] namesAvian = new String[]{"Ruddy Turnstone", "Dunlin", "Red Knot", "Willet", "Snowy Plover", "Killdeer", "American Wigeon",
            "Cinnamon Teal", "Mallard", "Gadwall", "Redhead", "Canvasback", "Brant", "Canada Goose",
            "Black Scoter", "Ruff", "Pomarine Jaeger", "Sooty Tern", "Merlin", "Peregrine Falcon", 
            "Bald Eagle", "Missisippi Kite", "Crested Caracara", "Black Vulture", "Sora"};
		
		//Name for Reptile Animals
       String[] namesReptile = new String[]{"American Alligator", "Cuban Crocodile", "Dwarf Caiman", "Westerm Chuckwalla", "Leopard Gecko",
           "Green Iguana", "Spiny Lizard","Tree Monitor", "Bearded Dragon", "Armenian Viper", "Python",
           "Corn Snake", "Green Anaconda", "Jamaica Boa", "Rosy Boa", "Osage", "Timber", "Cottonmouth",
           "King Cobra", "Box Turtle", "Leopard Tortoise", "Aldabra Tortoise", "Turtle", "Black Milk Snake", "Rat Snake"};
	   
	   //Name for Hybrid ReptileAquatic Animals
       String[] namesReptileAquatic = new String[]{"American Alligator","Chinese Alligator","Cuban Crocodile","Dwarf Caiman",
           "Malayan Gharial","Banded Gila Monster","Black Tree Monitor","Blue Spiny Lizard",
           "Blue-tongued Skink","Chinese Crocodile Lizard","Bolkar Viper","Brazilian Rainbow Boa",
           "Caucasus Viper","Central American Bushmaster","Central Asian Cobra","Egyptian Tortoise",
           "Galapagos Tortoise","Leopard Tortoise","McCord's Box Turtle","Murray River Turtle",
           "Kemp's ridley", "Olive ridley","Green sea turtle","Hawksbill sea turtle","Shaw's sea snake"};
       
	   //Names for Keepers
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
        

        ArrayList<Animal> myAnimals = new ArrayList<>();
        Random rand = new Random();

        int randomIndex = 0;
        int timesMA = 0;
        
        for (int i = 0; i < numberOfAnimals; i++) {
            
            randomIndex  = rand.nextInt(4);
            
			//This picks a Random animal but it depends which option you choose. 0 is for Mammals, 1 is for Avians
			//2 is for Reptiles and 3 is for ReptileAquatics.
            switch (randomIndex) {
                case 0:
                    myAnimals.add(new MammalAquaticAnimal(animalType1[rand.nextInt(animalType1.length)],namesMammalAquatic[rand.nextInt(namesMammalAquatic.length)], dob[rand.nextInt(dob.length)], doa[rand.nextInt(doa.length)], gender[rand.nextInt(gender.length)], offspring[rand.nextInt(offspring.length)], medication[rand.nextInt(medication.length)],vaccine[rand.nextInt(vaccine.length)],keeperNames[rand.nextInt(keeperNames.length)]));
                case 1:
                    myAnimals.add(new Avian (animalType2[rand.nextInt(animalType2.length)], namesAvian[rand.nextInt(namesAvian.length)], dob[rand.nextInt(dob.length)], doa[rand.nextInt(doa.length)], gender[rand.nextInt(gender.length)], offspring[rand.nextInt(offspring.length)], medication[rand.nextInt(medication.length)], vaccine[rand.nextInt(vaccine.length)],keeperNames[rand.nextInt(keeperNames.length)]));
                case 2: 
                    myAnimals.add(new Reptile(animalType3[rand.nextInt(animalType3.length)],   namesReptile[rand.nextInt(namesReptile.length)], dob[rand.nextInt(dob.length)], doa[rand.nextInt(doa.length)], gender[rand.nextInt(gender.length)], offspring[rand.nextInt(offspring.length)], medication[rand.nextInt(medication.length)], vaccine[rand.nextInt(vaccine.length)],keeperNames[rand.nextInt(keeperNames.length)]));
                case 3:
                    myAnimals.add(new ReptileAquaticAnimal(animalType4[rand.nextInt(animalType4.length)],   namesReptileAquatic[rand.nextInt(namesReptileAquatic.length)], dob[rand.nextInt(dob.length)], doa[rand.nextInt(doa.length)], gender[rand.nextInt(gender.length)], offspring[rand.nextInt(offspring.length)], medication[rand.nextInt(medication.length)], vaccine[rand.nextInt(vaccine.length)],keeperNames[rand.nextInt(keeperNames.length)]));
             
            
            }

        }
        return myAnimals;
    }

}
