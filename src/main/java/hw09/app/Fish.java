package hw09.app;

public class Fish extends Pet implements Foulable {
    Fish(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.FISH);
    }

    @Override
    protected void respond() {
        System.out.println("I amk a fish and it is my respond");
    }

    @Override
    public void foul() {

    }
}
