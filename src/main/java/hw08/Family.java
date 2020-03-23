package hw08;

import java.util.ArrayList;

public class Family {

    Woman mother;
    Man father;
    ArrayList<Pet> pets = new ArrayList<>();
    private int count;
    ArrayList<Human> children = new ArrayList<>();


    Family(Man father, Woman mother){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    void setPet(Pet pet){pets.add(pet);}

    public void addChild(Human child){
        children.add(child);
        count++;
    }

    void deleteChild(int child){
        children.remove(child);
        count--;
    }

    public String toString(){
        return "Family has " + this.count + " persons:"
                + "\nfather: " + this.father.toString()
                + "\nmother: " + this.mother.toString()
                + "\nchildren: " + this.showChild()
                + "\npet: " + pets.toString();
    }

    private String  showChild(){
        return children.toString();
    }

}
