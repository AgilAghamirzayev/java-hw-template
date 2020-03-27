package hw13.controllers;

import hw13.human.Family;
import hw13.human.Human;
import hw13.pet.Pet;
import hw13.services.FamilyService;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController implements Serializable{
    private static final long serialVersionUID = 1L;


    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
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

    public int countFamiliesWithMemberNumber(int number) {
        return familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human father, Human mother) {
        familyService.createNewFamily(father, mother);
        familyService.saveData();
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
        familyService.saveData();
    }


    public void bornChild(Family family, String boyName, String girlName) {
        familyService.bornChild(family, boyName, girlName);
        familyService.saveData();
    }

    public Family adoptChild(Family family, Human human) {
        return familyService.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
        familyService.saveData();
    }


    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }


    public Set<Pet> getPets(int id) {
        return familyService.getPets(id);
    }


    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
        familyService.saveData();
    }

}
