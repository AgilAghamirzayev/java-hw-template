package hw09;

import java.util.List;

public interface FamilyDao{

    public List<Family> getAllFamiliyes();
    public Family getFamilyByIndex(int index);
    public void deleteFamily(Family family);
    public void saveFamily(Family family);


}
