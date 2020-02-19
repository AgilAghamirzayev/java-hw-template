package hw07;

public class Family {
    Woman mother;
    Man father;
    private Human[] children = new Human[10];
    private Pet pet;
    private int count = 0;
    private static int temp = 0;


    Family(Man father, Woman mother){
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    void setPet(Pet pet){this.pet=pet;}

    public void addChild(Man child){
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this.getClass().getName());
    }

}
