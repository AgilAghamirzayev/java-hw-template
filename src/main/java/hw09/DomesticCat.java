package hw09;

public class DomesticCat extends Pet implements Foulable {
    DomesticCat(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void foul() {
        System.out.println("I am a DomesticCat and it is my foul");
    }

    @Override
    void respond() {
        System.out.println("I am a DomesticCat and it is my respond");
    }
}
