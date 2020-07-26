package Animals;

public class Lion extends Animals {

    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
        public void say() {
        System.out.println("Pppppppp");
    }
        @Override
        public void play() {
            System.out.println("Люблю играть с костью");

      }
}