package hw09.dao;
import java.util.List;
import java.util.Optional;

public interface DAO<T>{

     List<T> getAllFamilies();
     Optional<T> getFamilyByIndex(int index);
     boolean deleteFamily(T family);
     boolean deleteFamily(int index);
     void saveFamily(T family);

}
