package hw05;
public class Family {

    private Human mother;
    private Human father;
    public  Human[] children = new Human[5];
    private Pet pet;
    private int count;
    private  int temp = 0;


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
            if (i == index - 1){ continue;}
            children[a]=children[i];
            a++;
        }
        System.out.println(temp);
        temp--;
        count--;
        System.out.println(temp);
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
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + showChild() +
                ", pet=" + pet +
                ", count=" + count +
                '}';
    }
}
