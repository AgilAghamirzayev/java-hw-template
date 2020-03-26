package hw11.human;

import hw11.pet.Pet;

import java.util.*;

public class Family{

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
//        for (Human child: children) {
//            childInfo.append(String.format("%s\n", child.toString()));
//        }
        children.forEach(child->childInfo.append(String.format("%s\n", child.toString())));

        return String.format("Family{ father =%s, mother =%s, children =%s",
                father.getFullName(),
                mother.getFullName(),
                childInfo.toString().trim());
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
