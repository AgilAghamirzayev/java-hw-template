package hw13.human;

import hw13.pet.Pet;

import java.io.Serializable;
import java.util.*;

public class Family implements Serializable {
    private static final long serialVersionUID = 1L;

    private Human mother;
    private Human father;
    private Set<Pet> pet ;
    public List<Human> children ;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.pet = new LinkedHashSet<>();
        this.children = new ArrayList<>();
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Family setMother(Human mother) {
        this.mother = mother;
        return new Family(this.mother, this.father);
    }

    public Family setFather(Human father) {
        this.father = father;
        return new Family(this.mother, this.father);
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void addPet(Pet pet){
        this.pet.add(pet);
    }

    public void addChild(Human child){
        if (children.contains(child)) return;
        this.children.add(child);
        child.setFamily(this);
    }

    public boolean deleteChild(Human child){
        if (children.indexOf(child) == -1) return false;
        int index = children.indexOf(child);
        Human human = children.remove(index);
        return true;
    }

    public Human deleteChild(int index) throws IndexOutOfBoundsException{
        return children.remove(index);
    }

    public int countFamily(){
        return children.size() + 2;
    }


    public String toString(){
        StringBuilder childInfo = new StringBuilder();
        children.forEach(child -> {
            if (child instanceof Man) childInfo.append(String.format("\t\t\t\tboy: %s\n", child.toString()));
            if (child instanceof Woman)childInfo.append(String.format("\t\t\t\tgirl: %s\n",child.toString())); });
        return String.format("family:" +
                        "\n\t\tfather: %s" +
                        "\n\t\tmother: %s" +
                        "\n\t\tchildren:\n%s" +
                        "\t\tpets: %s\n\t\t"
                ,mother.toString()
                ,father.toString()
                ,childInfo
                ,pet.toString());
    }

    public String prettyFormat(){
        StringBuilder childInfo = new StringBuilder();
        children.forEach(child -> {
            if (child instanceof Man) childInfo.append(String.format("\t\t\t\tboy: %s\n", child.toString()));
            if (child instanceof Woman)childInfo.append(String.format("\t\t\t\tgirl: %s\n",child.toString())); });
        return String.format("family:" +
                        "\n\t\tfather: %s" +
                        "\n\t\tmother: %s" +
                        "\n\t\tchildren:\n%s" +
                        "\t\tpets: %s\n\t\t"
                    ,mother.toString()
                    ,father.toString()
                    ,childInfo
                    ,pet.toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(pet, family.pet) &&
                Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, pet, children);
    }
}
