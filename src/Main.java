import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetList petList = new PetList();
        petList.startPets();
        int choice = 0;
        do {
            System.out.println("*** ДЕЙСТВИЯ С ЖИВОТНЫМИ ***");
            System.out.println("Выберите действие: ");
            System.out.println("1.Добавить животное");
            System.out.println("2.Удалить животное");
            System.out.println("3.Показать список животных");
            System.out.println("4.Найти животное по имени");
            System.out.println("5.Выход");
            System.out.println("Введите номер действия: ");
            choice = getChoice(choice, sc, petList);
        } while (choice != 5);
    }

    private static int getChoice(int choice, Scanner sc, PetList petList) {
        try {
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Для добавления животного нужно указать имя, тип, возраст, рост, вес, цвет.");
                    petList.add(Pet.createPet());
                }
                case 2 -> {
                    System.out.println("Введите имя животного, которое хотите удалить: ");
                    petList.removePet(sc.nextLine());
                }

                case 3 -> {
                    System.out.println(petList);
                }
                case 4 -> {
                    petList.poiskPoImeni(sc, petList);
                }
                case 5 -> System.out.println("Выход из программы. До свидания!");
                default -> {
                    System.out.println("Неверный номер действия");
                    System.out.println("----------------------------");
                }
            }
        } catch (Exception e) {
            System.out.println("Неверный формат ввода!");
            System.out.println("----------------------------");

        }
        return choice;
    }


}
