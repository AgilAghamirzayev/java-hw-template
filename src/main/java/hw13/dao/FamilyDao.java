package hw13.dao;
import hw13.human.*;

import java.io.*;
import java.util.*;

public class FamilyDao implements DAO<Family>, Serializable{
    private static final long serialVersionUID = 1L;

    private static List<Family> families = new LinkedList<>();

    @Override
    public Collection<Family> getAllFamilies() {
        return loadData();
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

    @SuppressWarnings("unchecked")
    @Override
    public Collection<Family> loadData() {
        File file = new File("Family.txt");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            if(file.length() == 0) return null;
            return (List<Family>) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return new LinkedList<>();
        }
    }

}
