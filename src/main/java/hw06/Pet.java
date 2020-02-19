package hw06;
public class Pet {
    private String nickname;
    private Species species;
    private int age;
    private int trickLevel;
    private static String[] habits;


    Pet(Species species,String nickname,int age,  int trickLevel, String[] habit){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        habits = habit.clone();
    }

    void setSpecies(String dog){}
    String getNickname(){return nickname;}
    void setNickname(String nickname){this.nickname = nickname;}
    void setAge(int age){this.age =age;}
    void setTrickLevel(int trickLevel){this.trickLevel = trickLevel; }

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
}
