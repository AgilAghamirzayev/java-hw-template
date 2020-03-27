package hw13.pet;

import java.util.List;
import java.util.Random;

public class DomesticCat extends Pet implements Foulable {

    private Random random = new Random();
    public DomesticCat(String nickname, int age, int trickLevel, List<String> habits) {
        super( nickname, age, trickLevel, habits);
        this.setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat(Species species, String  nickname) {
        super(nickname);
        this.setSpecies(species);
    }

    public DomesticCat() {
    }

    @Override
    public void foul() {
        System.out.println( String.format("I am a DomesticCat, %d", random.nextInt(254)));
    }

    @Override
    public void respond() {
        System.out.println(String.format("I am, %s. Who are you?", this.getNickname()));
    }
}
