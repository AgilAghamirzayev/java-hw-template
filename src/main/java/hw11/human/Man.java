package hw11.human;

import hw11.pet.Pet;

import java.util.ArrayList;
import java.util.Map;

public class Man extends Human {

    public Man(String name, String surname, long  year, Family family){
        super(name, surname, year, family);
    }

    public Man(String name, String surname, long  year){
        super(name, surname, year);
    }

    public Man(String name, String surname, long year, Pet pet, Family family, Map<String, ArrayList<String>> schedule){
        super(name, surname, year, pet, family, schedule);
    }

    public Man(String name, String surname, String birthday, int iq){
        super(name, surname, birthday, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("GreetPet method from Man Class");
    }

    public void repairCar() {
        System.out.println("Father repair the car");
    }
}
