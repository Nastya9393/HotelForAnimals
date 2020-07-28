package Animals;

public class Panda extends Animals {

    public Panda(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Panda() {
        super();
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
