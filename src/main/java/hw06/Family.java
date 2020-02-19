package hw06;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;
    public int coutFamily;


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
        child--;
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this.getClass().getName());
    }

    public int coutFamily(){return count;}
}
