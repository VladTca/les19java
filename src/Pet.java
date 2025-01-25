import java.util.Scanner;

public class Pet {
    private String name;
    private String type;
    private int age;
    private double height;
    private double weight;
    private String color;


    public Pet(String name, String type, int age, double height, double weight, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public Pet(String name, String type, int age, double height, double weight) {
        this(name, type, age, height, weight, "Цвет не указан");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static Pet createPet() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя животного: ");
                String name = scanner.nextLine();
                System.out.println("Введите тип животного: ");
                String type = scanner.nextLine();
                System.out.println("Введите возраст животного: ");
                int age = scanner.nextInt();
                System.out.println("Введите рост животного: ");
                double height = scanner.nextDouble();
                System.out.println("Введите вес животного: ");
                double weight = scanner.nextDouble();
                System.out.println("Будете указывать цвет животного?");
                System.out.println("1. Да");
                System.out.println("2. Нет");
                if (scanner.nextInt() == 1) {
                    System.out.println("Введите цвет животного: ");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    return new Pet(name, type, age, height, weight, color);
                } else {
                    return new Pet(name, type, age, height, weight);
                }
            } catch (Exception e) {
                System.out.println("Неверный ввод,попробуйте ещё раз.");
            }
        } while (true);
    }

    @Override
    public String toString() {
        return "Имя :" + name + ", тип :" + type +
                ", возраст :" + age + ", рост :" + height +
                ", вес :" + weight + ", цвет :" + color ;
    }


}
