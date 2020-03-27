package hw13.dao;
import hw13.human.Family;

import java.io.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class FamilyDao implements DAO<Family>{

    private  List<Family> families = new LinkedList<>();

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
    public void loadData() throws IOException {
        File file = new File("Family.txt");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            if(file.length() == 0) return;
            families = (List<Family>) ois.readObject();
        }catch (FileNotFoundException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
