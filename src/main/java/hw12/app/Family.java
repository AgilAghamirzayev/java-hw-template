package hw12.app;

import java.util.ArrayList;

public class Family{
    Human mother;
    Human father;
    ArrayList<Pet> pets = new ArrayList<>();
    public ArrayList<Human> children = new ArrayList<>();
    public static int count = 0;

    public Family(Human father, Human mother){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    public Family() {

    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPet(Pet pet){pets.add(pet);}

    public void addChild(Human child){
        children.add(child);
        count++;
    }

    public void deleteChild(int child){
        children.remove(child);
        count--;
    }

    public String prettyFormat(){
        return "family: " +
                "\n         mother: " + mother +
                "\n         father: " + father +
                "\n         children: " + showChild() +
                "\n         pets: " + pets +
                "\n";
    }

    @Override
    public String toString() {
        return prettyFormat();
    }

    public String  showChild(){
        StringBuilder sb = new StringBuilder();
        children.forEach(s->sb.append("\n                  "+s.toString()));
        return sb.toString();
    }

}
