package hw11.app;

public class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void foul() {
        System.out.println("I am a DomesticCat and it is my foul");
    }

    @Override
    protected void respond() {
        System.out.println("I am a DomesticCat and it is my respond");
    }
}
