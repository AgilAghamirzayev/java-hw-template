package hw13.dao;

import hw13.exception.FamilyOverflowException;
import hw13.human.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FamilyDao implements DAO<Family>, Serializable {
    private static final long serialVersionUID = 1L;

    private static List<Family> families = new ArrayList<>();
    private File file = new File("Family.txt");

    @Override
    public List<Family> getAllFamilies() {
        try (ObjectInputStream ois = new ObjectInputStream( new BufferedInputStream(new FileInputStream(file)))) {
            return  (List<Family>) ois.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
            return new LinkedList<>();
        }
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (families.isEmpty()) return null;
        else return getAllFamilies().get(index);
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
    public void loadData(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
            oos.writeObject(families);
        } catch (FamilyOverflowException | IOException ignored){

        }
    }
}
