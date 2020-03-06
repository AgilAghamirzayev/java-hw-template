package hw09.dao;
import hw09.app.Family;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CollectionFamilyDao implements FamilyDao<Family> {

    List<Family> families = new LinkedList<>();


    public CollectionFamilyDao() {
        families.add(new Family());
    }

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Optional<Family> getFamilyByIndex(int index) {
        return Optional.ofNullable(families.get(index));
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
        families.add(family);
    }
}
