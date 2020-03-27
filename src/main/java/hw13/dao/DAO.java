package hw13.dao;
import java.io.IOException;
import java.util.Collection;

public interface DAO<T>{

     Collection<T> getAllFamilies();
     T getFamilyByIndex(int index);
     boolean deleteFamily(T family);
     boolean deleteFamily(int index);
     void saveFamily(T family);
     void saveData();
     void loadData() throws IOException;

}
