package hw09.controllers;

import hw09.app.Family;
import hw09.app.Human;
import hw09.app.Pet;
import hw09.services.FamilyService;

import java.util.ArrayList;
import java.util.List;

public class FamilyController extends FamilyService {

    private final FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }


    @Override
    public List<Family> getAllFamilies() {
        return super.getAllFamilies();
    }

    @Override
    public void displayAllFamilies() {
        super.displayAllFamilies();
    }

    @Override
    public void getFamiliesBiggerThan(int size) {
        super.getFamiliesBiggerThan(size);
    }

    @Override
    public void getFamiliesLessThan(int size) {
        super.getFamiliesLessThan(size);
    }

    @Override
    public void countFamiliesWithMemberNumber() {
        super.countFamiliesWithMemberNumber();
    }

    @Override
    public void createNewFamily(Human father, Human mother) {
        super.createNewFamily(father, mother);
    }

    @Override
    public void deleteFamilyByIndex(int index) {
        super.deleteFamilyByIndex(index);
    }

    @Override
    public Family bornChild(Family family, String gender) {
        return super.bornChild(family, gender);
    }

    @Override
    public Family adoptChild(Family family, Human human) {
        return super.adoptChild(family, human);
    }

    @Override
    public List<Family> deleteAllChildrenOlderThen(int age) {
        return super.deleteAllChildrenOlderThen(age);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public Family getFamilyById(int id) {
        return super.getFamilyById(id);
    }

    @Override
    public ArrayList<Pet> getPets(int id) {
        return super.getPets(id);
    }

    @Override
    public void addPet(int index, Pet pet) {
        super.addPet(index, pet);
    }
}
