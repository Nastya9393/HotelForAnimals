package Animals;

public class Elephant extends Animals {

    public Elephant(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void say() {
        System.out.println("Труууу");
    }

    @Override
    public void play() {
        System.out.println("Я люблю играть с водой");

    }

}



