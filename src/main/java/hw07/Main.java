package hw07;

public class Main {
    public static void main(String[] args) {

        System.out.println(DayOfWeek.MONDAY.name());

        Pet dog = new Dog("DOGG", 3, 75, "eat", "sleep", "play");
        Pet cat = new RoboCat("ROBOT", 1, 111, "On", "Off", "Saying 0 and 1 instead of 'meow'");
        Pet catDomestic = new DomesticCat("CAT", 5, 70, "eat", "sleep", "play");
        Pet fish = new Fish("FISH", 1, 10, "swim", "eat", "sleep");
        Man father = new Man("Shakir", "Aghamirzayev", 1965, 118, "Monday", "Going to work");
        Woman mother = new Woman("Afat", "Aghamirzayeva", 1967, 117, "Tuesday", "Have a rest");
        Family family = new Family(father, mother);
        Man me =  new Man("Aqil", "Aghamirzayev", 1999, 100, "Wednesday", "Go to course\n");
        family.addChild(me);
        System.out.println();
        Man child = new Man("a", "a", 2020, 150, "Friday", "Have a rest");
        family.addChild(child);
        family.setPet(catDomestic);
        System.out.println(family.toString());
        family.mother.makeUp();
        family.father.repairCar();
    }
}
