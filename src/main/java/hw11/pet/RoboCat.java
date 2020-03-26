package hw11.pet;

import java.util.Random;
import java.util.Set;

public class RoboCat extends Pet implements Foulable {

    private Random random = new Random();
    public RoboCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super( nickname, age, trickLevel, habits);
        this.setSpecies(species);
    }

    public RoboCat(Species species, String  nickname) {
        super(nickname);
        this.setSpecies(species);
    }

    public RoboCat() {
    }

    @Override
    public void foul() {
        System.out.println( String.format("I am a RobotCat, %d", random.nextInt(254)));
    }

    @Override
    public void respond() {
        System.out.println(String.format("I am, %s. Who are you?", this.getNickname()));
    }
}
