package hw09.app;
import java.util.ArrayList;
public class Family{
    Human mother;
    Human father;
    ArrayList<Pet> pets = new ArrayList<Pet>();
    public static int count = 0;
    public ArrayList<Human> children = new ArrayList<>();

    public Family(Human father, Human mother){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    public Family() {

    }
//
//    public Family() {
//
//    }

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

    @Override
    public String toString() {
        return "Family{" +
                "mother: " + mother +
                ", father: " + father +
                ", pets: " + pets +
                ", children: " + children +
                "}\n";
    }

    private String  showChild(){
        return children.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this.getClass().getName());
    }

}
