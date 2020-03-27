package hw13.dao;
import java.util.List;

public interface DAO<T>{

     List<T> getAllFamilies();
     T getFamilyByIndex(int index);
     boolean deleteFamily(T family);
     boolean deleteFamily(int index);
     void saveFamily(T family);
     void loadData();

}
