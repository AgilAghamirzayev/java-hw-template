package hw06;
public class Family {

    private Human mother;
    private Human father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    int temp = 0;
    public int coutFamily;



    Family(Human mother, Human father){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human child){
        count++;
        children[temp++] = child;
    }

    void deleteChild(int index){
        int a=0;
        for (int i = 0; i < temp ; i++) {
            if (i == index - 1) continue;
            children[a]=children[i];
            a++;
        }
        temp--;
        count--;
    }

    void deleteChild(Human human){
        int a = 0;
        for (int i = 0; i < temp ; i++) {
            if (children[i]==human) continue;
            children[a]=children[i];
            a++;
        }
        temp--;
        count--;
    }



    public StringBuilder showChild(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp ; i++) {
            sb.append(children[i].toString());
        }
        return sb;
    }

    void eat(){
        System.out.println("I am eating");
    }

    void respond(){
        System.out.printf("Hello, owner. I am %s. I miss you!\n", pet.getNickname());
    }

    void foul(){
        System.out.println("I need to cover it up\n");
    }

    public void addPet(Pet pet){
        this.pet = pet;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this.getClass().getName());
    }

    public int coutFamily(){return count;}

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + showChild() +
                ", pet=" + pet +
                ", coutFamily=" + coutFamily +
                '}';
    }



}
