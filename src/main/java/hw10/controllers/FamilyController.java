package hw10.controllers;

import hw10.app.Family;
import hw10.app.Human;
import hw10.app.Pet;
import hw10.services.FamilyService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FamilyController {

    private final FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int size) {
        familyService.getFamiliesBiggerThan(size);
    }

    public void getFamiliesLessThan(int size) {
        familyService.getFamiliesLessThan(size);
    }

    public void countFamiliesWithMemberNumber() {
        familyService.countFamiliesWithMemberNumber();
    }

    public void createNewFamily(Human father, Human mother) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }


    public void bornChild(Family family, String gender) throws ParseException {
        familyService.bornChild(family, gender);
    }

    public void adoptChild(Family family, Human human) {
        familyService.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }


    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }


    public ArrayList<Pet> getPets(int id) {
        return familyService.getPets(id);
    }


    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
}
