package hw11.app;

public class Dog extends Pet implements Foulable {
    public Dog(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3) {
        super(nickname, age, trickLevel, habit1, habit2, habit3);
        this.setSpecies(Species.DOG);
    }

    @Override
    public void foul() {
        System.out.println("I am a Dog and i did foul)");
    }

    @Override
    protected void respond() {
        System.out.println("I am a Dog and it is my respond");
    }
}
