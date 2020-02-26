package hw09;

import com.sun.org.apache.bcel.internal.generic.FADD;

import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> families;

    @Override
    public List<Family> getAllFamiliyes() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return null;
    }

    @Override
    public void deleteFamily(Family family) {

    }

    @Override
    public void saveFamily(Family family) {

    }
}
