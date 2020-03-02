package hw07;

import java.util.Arrays;

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


    private StringBuilder showChild(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp ; i++) {
            sb.append(children[i].toString());
        }
        return sb;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                ", count=" + count +
                '}';
    }


}
