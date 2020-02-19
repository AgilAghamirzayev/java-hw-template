package hw07;

public abstract class Pet {
    private String nickname;
    private Species species;
    private int age;
    private int trickLevel;
    private static String[] habits;



    public void setSpecies(Species species){this.species=species;}

    Pet(String nickname, int age, int trickLevel, String habit1, String habit2, String habit3){
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        habits = new String[]{habit1, habit2, habit3};
    }


    Pet (Species species){species = Species.UNKNOWN;}



    public String toString(){
        return String.format("%s{nickname=%s, age=%d, trickLevel=%d, habits=%s", species, nickname, age, trickLevel, this.getHabits());
    }
    private String getHabits(){
        StringBuilder sb = new StringBuilder();
        for (String habit: habits) {
            sb.append(" "+habit);
        }
        return sb.toString();
    }

    public boolean equals(Object that){
        if (this == that) return true;
        if (hashCode(this) != hashCode(that)) return false;
        if (!(that instanceof Pet)) return false;
        return this.nickname.equals(((Pet) that).nickname)
                && this.age == ((Pet) that).age
                && this.species.equals(((Pet) that).species);
    }

    private int hashCode(Object pet){return hashCode();}

    @Override
    protected void finalize() {
        System.out.println("Object " + this.getClass().getName());
    }


    void eat(){
        System.out.println("I am eating");
    }

    abstract void respond();

}
