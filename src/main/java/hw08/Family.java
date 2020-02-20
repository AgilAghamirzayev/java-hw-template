package hw08;

import java.util.ArrayList;

public class Family {
    Woman mother;
    Man father;
    ArrayList<Pet> pets = new ArrayList<Pet>();
    private int count = 0;
    ArrayList<Man> children = new ArrayList<Man>();


    Family(Man father, Woman mother){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    void setPet(Pet pet){pets.add(pet);}

    public void addChild(Man child){
        children.add(child);
    }

    void deleteChild(int child){
        children.remove(child);
    }

    public String toString(){
        return "Family has" + this.count + " persons:"
                + "\nfather: " + this.father.toString()
                + "\nmother: " + this.mother.toString()
                + "\nchildren: " + this.showChild()
                + "\npet: " + pets.toString();
    }

    private String  showChild(){
        return children.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this.getClass().getName());
    }

}
