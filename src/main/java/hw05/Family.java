package hw05;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children = new Human[4];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;


    Family(Human mother, Human father){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human child){
        count++;
        children[temp] = child;
        temp++;
    }

    void deleteChild(int child){
        if (temp + 1 - child >= 0) System.arraycopy(children, child+1, children, child, temp+1-child);
        temp--;
        count--;
    }

    public String toString(){
        return "Family has" + this.count + " persons:"
                + "\nfather: " + this.father.toString()
                + "\nmother: " + this.mother.toString()
                + "\nchildren: " + this.showChild()
                + "\npet: " + pet.toString();
    }

    private StringBuilder showChild(){
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

}
