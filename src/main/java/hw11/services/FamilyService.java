package hw11.services;

import hw11.app.*;
import hw11.dao.FamilyDao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FamilyService {

    FamilyDao familyDao = new FamilyDao();


    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyDao.getAllFamilies().forEach(System.out::println);
    }

    public void getFamiliesBiggerThan(int size){
             familyDao.getAllFamilies().stream().filter(i-> Family.count>size).forEach(System.out::println);
    }

    public void getFamiliesLessThan(int size){
       familyDao.getAllFamilies().stream().filter(i-> Family.count<size).forEach(System.out::println);
    }

    public void countFamiliesWithMemberNumber(){
        familyDao.getAllFamilies().stream().filter(i->familyDao.getAllFamilies().size()== Family.count).forEach(System.out::println);
    }

    public void createNewFamily(Human father, Human mother){
        familyDao.getAllFamilies().add(new Family( father, mother));
    }

    public void deleteFamilyByIndex(int index){
        familyDao.getAllFamilies().remove(index);
    }

    public Family bornChild(Family family, String gender) throws ParseException {
        System.out.println(family.toString());
        if (gender.equals("masculine")){
            Human me =  new Man("Aqil", "Aghamirzayev","01/07/1999");
            family.addChild(me);
        } else if (gender.equals("feminine")){
            Human me =  new Woman("Aysu", "Aghamirzayeva", "08/08/2003");
            family.addChild(me);
        }
        return family;
    }

    public Family adoptChild(Family family, Human human){
        family.addChild(human);
        return family;
    }

    public List<Family> deleteAllChildrenOlderThen(int age){
        for (int i = 0; i <familyDao.getAllFamilies().size(); i++) {
                familyDao.getAllFamilies().get(i).children.stream().filter(k-> k.birthDate < age);
        }
        return familyDao.getAllFamilies();
    }


    public int count(){
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int id){
        return familyDao.getAllFamilies().get(id);
    }

    public ArrayList<Pet> getPets(int id){
        return familyDao.getAllFamilies().get(id).getPets();
    }

    public void addPet(int index, Pet pet){
        familyDao.getAllFamilies().get(index).getPets().add(pet);
    }


}
