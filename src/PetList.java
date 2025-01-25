import java.util.*;

public class PetList {
    private Pet[] pets;
    private int count;
    private static final String RAZDELITEL = "----------------------------";

    public PetList() {
        pets = new Pet[5];
        count = 0;
    }

    public void add(Pet pet) {
        if (count == pets.length) {
            resize();
        }
        pets[count++] = pet;
    }

    public void resize() {
        pets = Arrays.copyOf(pets, pets.length * 2);
    }

    public void startPets() {

        add(new Pet("Tuzik", "dog", 40, 40, 40, "white"));
        add(new Pet("Loshad", "horse", 10, 10, 10, "yellow"));
        add(new Pet("Muchtar", "dog", 20, 20, 20, "white"));
        add(new Pet("Barsik", "cat", 30, 30, 30, "black"));

    }

    public void removePet(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < count; i++) {
            if (pets[i].getName().equalsIgnoreCase(name)) {
                pets[i] = pets[count - 1];
                count--;
                System.out.println();
                System.out.printf("Животное %s было удалено!", name);
                System.out.println();
                System.out.println(RAZDELITEL);
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            System.out.printf("Животное %s не было найдено!", name);
            System.out.println();
            System.out.println(RAZDELITEL);
        }
    }

    public Optional<List<Pet>> findPetsByName(String name) {
        List<Pet> foundPets = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (pets[i].getName().equalsIgnoreCase(name)) {
                foundPets.add(pets[i]);
            }
        }
        return foundPets.isEmpty() ? Optional.empty() : Optional.of(foundPets);
    }

    public void poiskPoImeni(Scanner sc, PetList petList) {
        System.out.println("Введите имя животного, которое хотите найти: ");
        Optional<List<Pet>> petsFound = petList.findPetsByName(sc.nextLine());
        if (petsFound.isPresent()) {
            for (Pet pet : petsFound.get()) {
                System.out.println(pet);
            }
            System.out.println(RAZDELITEL);
        } else {
            System.out.println("Животное не было найдено!");
            System.out.println(RAZDELITEL);
        }
    }

    void printPets() {
        for (int i = 0; i < count; i++) {
            if (pets[i] != null) {
                System.out.print(pets[i]);
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("Животные: ");

        System.out.println(RAZDELITEL);
        System.out.println("Количество животных:" + count);
        System.out.println(RAZDELITEL);
        System.out.println("Всего мест в зоопарке:" + pets.length);
        if (count == pets.length) {
            System.out.println("При следующем добавление животного нам придется увеличить зоопарк!");
        }
        System.out.println(RAZDELITEL);

        printPets();
        return RAZDELITEL;
    }
}
