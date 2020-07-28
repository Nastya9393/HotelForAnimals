package Animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    static String type;
    static String name;
    static int age;
    static int weight;
    static String lion = "lion";
    static String panda = "panda";
    static String elephant = "elephant";


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите тип вашего животного");
        type = sc.nextLine();

        if (!type.equals(lion) && !type.equals(panda) && !type.equals(elephant)) {
            System.out.println("Таких животных нет в нашем отеле!");
            sc.close();

        } else {
            System.out.println("Укажите имя вашего животного");
            name = sc.nextLine();

            System.out.println("Укажите возраст вашего животного");
            age = sc.nextInt();

            System.out.println("Укажите вес вашего животного");
            weight = sc.nextInt();

            sc.close();
        }

    }
    // 123

        public static void Clinic () {
        ArrayList<Animals> animals = new ArrayList<>();
        if (type.equals(lion)) {
            animals.add(new Lion(name, age, weight));
        } else if (type.equals(panda)) {
            animals.add(new Panda(name, age, weight));
        } else if (type.equals(elephant)) {
            animals.add(new Elephant(name, age, weight));
        }
    }

}
