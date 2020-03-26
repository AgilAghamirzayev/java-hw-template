package hw12.pet;

import java.util.List;
import java.util.Random;

public class RoboCat extends Pet implements Foulable {

    private Random random = new Random();
    public RoboCat(String nickname, int age, int trickLevel, List<String> habits) {
        super( nickname, age, trickLevel, habits);
        this.setSpecies(Species.ROBOCAT);
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
