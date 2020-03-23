package hw10.app;

public class RoboCat extends Pet implements Foulable {
    public RoboCat(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.ROBOCAT);
    }

    @Override
    public void foul() {
        System.out.println("I am a RoboCat and it is my foul");
    }

    @Override
    protected void respond() {
        System.out.println("I am a robo cat xe-xe-xe-xe and it is my respond");
    }
}
