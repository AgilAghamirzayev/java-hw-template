package hw09;


public class FamilyService  extends CollectionFamilyDao{


    public static void main(String[] args) {

        FamilyDao familyDao = new FamilyService();
        familyDao.getAllFamiliyes();


    }
}
