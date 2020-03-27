package hw13.dao;
import hw13.human.*;
import hw13.pet.Dog;
import hw13.pet.Fish;
import hw13.pet.Pet;
import hw13.pet.RoboCat;

import java.io.*;
import java.util.*;

public class FamilyDao implements DAO<Family>, Serializable{
    private static final long serialVersionUID = 1L;

    private static List<Family> families = new LinkedList<>();

    @Override
    public Collection<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (families.isEmpty()) return null;
        else return families.get(index);
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public boolean deleteFamily(int index) {
        return families.remove(families.get(index));
    }

    @Override
    public void saveFamily(Family family) {
        if (!families.contains(family)) families.add(family);
    }

    @Override
    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Family.txt"))){
            oos.writeObject(families);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Collection<Family> loadData() {
        File file = new File("Family.txt");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            if(file.length() == 0) return null;
            return (List<Family>) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return (List<Family>) new Family(null,null);
        }
    }

//    public static void main(String[] args) throws IOException {
//
//        FamilyDao dao = new FamilyDao();
//        Pet fish = new Fish("Memo",2,109, Arrays.asList("swim","clean","jump"));
//        Pet dog = new Dog("PiBody",1,100, Arrays.asList("swim","run","jump"));
//        Pet robocat = new RoboCat("Tom",3,92, Arrays.asList("swim","clean","jump"));
//
//        Human father1 = new Man("Ali", "Aiyev", LocalDate.of(1960, 10, 18).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
//            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
//            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
//        }});
//        Human mother1 = new Man("Aysu", "Aliyeva", LocalDate.of(1963, 9, 12).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
//            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
//            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
//        }});
//
//        Human father2 = new Man("Akif", "Valiyev", LocalDate.of(1989, 2, 11).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
//            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
//            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
//        }});
//        Human mother2 = new Man("Ayla", "Valiyeva", LocalDate.of(1992, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
//            put(DayOfWeek.FRIDAY.toString(), Arrays.asList("relax","go to movie"));
//            put(DayOfWeek.THURSDAY.toString(), Arrays.asList("sport","do smt"));
//        }});
//
//        Human child1 = new Man("Orxan", "Valiyev", LocalDate.of(2014, 2, 11).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
//            put(DayOfWeek.SUNDAY.toString(), Arrays.asList("relax","go to movie"));
//            put(DayOfWeek.WEDNESDAY.toString(), Arrays.asList("school","do smt"));
//        }});
//        Human child2 = new Woman("Aysu", "Valiyeva", LocalDate.of(2017, 8, 9).toEpochDay(),fish,null,new HashMap<String , List<String>>() {{
//            put(DayOfWeek.MONDAY.toString(), Arrays.asList("relax","go to movie"));
//            put(DayOfWeek.TUESDAY.toString(), Arrays.asList("school","do smt"));
//        }});
//
//        dao.saveFamily(new Family(mother1,father1));
//        dao.saveFamily(new Family(mother2,father2));
//        dao.saveData();
//    }
}
