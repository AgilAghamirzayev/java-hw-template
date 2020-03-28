package hw13.services;

import hw13.dao.FamilyDao;
import hw13.exception.FamilyOverflowException;
import hw13.human.Family;
import hw13.human.Human;
import hw13.human.Man;
import hw13.human.Woman;
import hw13.pet.Pet;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class FamilyService implements Serializable {
    private static final long serialVersionUID = 1L;

    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies(){
        return (List<Family>) familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyDao.getAllFamilies().forEach(family -> System.out.printf("%d. %s\n", getAllFamilies().indexOf(family)+1,family.prettyFormat()));
    }

    public void getFamiliesBiggerThan(int size){
             familyDao.getAllFamilies().stream().filter(family-> family.countFamily()>size).forEach(family -> System.out.printf("%s\n", family.prettyFormat()));
    }

    public void getFamiliesLessThan(int size){
       familyDao.getAllFamilies().stream().filter(family-> family.countFamily()<size).forEach(family -> System.out.printf("%s\n",family.prettyFormat()));

    }

    public int countFamiliesWithMemberNumber(int memberCount){
        List<Family> families = (List<Family>) familyDao.getAllFamilies();
        families = families.stream().filter(family -> family.countFamily() == memberCount).collect(Collectors.toList());
        System.out.printf("%d family with %d members.\n", families.size(), memberCount);
        return families.size();
    }

    public void createNewFamily(Human father, Human mother){
        familyDao.saveFamily(new Family( father, mother));
        familyDao.saveData();
    }

    public boolean deleteFamilyByIndex(int index){
        return familyDao.deleteFamily(familyDao.getFamilyByIndex(index));
    }

    public Family bornChild(Family family, String boyName, String girlName){
        if (!familyDao.getAllFamilies().contains(family)) familyDao.saveFamily(family);
        Random random = new Random();
        String surname = family.getFather().getSurname();
        LocalDate birthDate = LocalDate.now();
        Human child;
        if (random.nextBoolean()) child = new Man(boyName,surname, birthDate.toEpochDay(), family);
        else child = new Woman(girlName, surname, birthDate.toEpochDay(), family);
        try {
            family.addChild(child);
        } catch (FamilyOverflowException e){
             e.getMessage();
        }
        familyDao.saveData();
        return family;
    }

    public Family adoptChild(Family family, Human human){
        if (getAllFamilies().contains(family)) family.addChild(human);
        else {
            family.addChild(human);
            familyDao.saveFamily(family);
        }
        saveData();
        return family;
    }

    public void  deleteAllChildrenOlderThen(int age){
        LocalDate year = LocalDate.now();

        getAllFamilies().forEach(family -> {
            Iterator<Human> humanIterator = family.getChildren().iterator();
            ArrayList<Human> youngChildren = new ArrayList<>();
            while (humanIterator.hasNext()){
                Human human = humanIterator.next();
                if (Period.between(LocalDate.ofEpochDay(human.getYear()), year).getYears() < age)
                    youngChildren.add(human);
            }
            family.setChildren(youngChildren);
        });
    }


    public int count(){
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int id){
        return familyDao.getFamilyByIndex(id);
    }

    public Set<Pet> getPets(int id){
        return getFamilyById(id).getPet();
    }

    public void addPet(int index, Pet pet){
        getFamilyById(index).addPet(pet);
    }

    public void loadData(){
        familyDao.loadData();
    }

    public void saveData(){
        familyDao.saveData();
    }

}
