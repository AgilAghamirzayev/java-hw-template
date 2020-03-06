package hw09.services;

import hw09.app.Dog;
import hw09.app.Human;
import hw09.app.Pet;
import hw09.dao.CollectionFamilyDao;
import hw09.app.Family;

import java.util.ArrayList;
import java.util.List;

public class FamilyService  extends CollectionFamilyDao {


    @Override
    public List<Family> getAllFamilies() {
        return super.getAllFamilies();
    }

    public void displayAllFamilies(){
        System.out.println(getAllFamilies());
    }

    public void getFamiliesBiggerThan(int size){
             getAllFamilies().stream().filter(i->Family.count>size).forEach(System.out::println);
    }

    public void getFamiliesLessThan(int size){
       getAllFamilies().stream().filter(i->Family.count<size).forEach(System.out::println);
    }

    public void countFamiliesWithMemberNumber(){
        getAllFamilies().stream().filter(i->getAllFamilies().size()==Family.count).forEach(System.out::println);
    }

    public void createNewFamily(Human father, Human mother){
        getAllFamilies().add(new Family( father, mother));
    }

    public void deleteFamilyByIndex(int index){
        getAllFamilies().remove(index);
    }

    public Family bornChild(Family family, String gender){
        System.out.println(family.toString());
        if (gender.equals("masculine")){
            Human me =  new Human("Aqil", "Aghamirzayev",1999);
            family.addChild(me);
        } else if (gender.equals("feminine")){
            Human me =  new Human("Aysu", "Aghamirzayeva", 2003);
            family.addChild(me);
        }
        return family;
    }

    public Family adoptChild(Family family, Human human){
        family.addChild(human);
        return family;
    }

    public List<Family> deleteAllChildrenOlderThen(int age){
        for (int i = 0; i <getAllFamilies().size(); i++) {
                getAllFamilies().get(i).children.stream().filter(k->Human.getAge()<age);
        }
        return getAllFamilies();
    }


    public int count(){
        return getAllFamilies().size();
    }

    public Family getFamilyById(int id){
        return getAllFamilies().get(id);
    }

    public ArrayList<Pet> getPets(int id){
        return getAllFamilies().get(id).getPets();
    }

    public void addPet(int index, Pet pet){
        getAllFamilies().get(index).getPets().add(pet);
    }


}
