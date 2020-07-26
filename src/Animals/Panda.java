package Animals;

public class Panda extends Animals {

    public Panda(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void say() {
        System.out.println("Уаауаа");
    }

    @Override
    public void play() {
        System.out.println("Я люблю играть с мячиком");

    }
}
