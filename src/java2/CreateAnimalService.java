package java2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class CreateAnimalService {
    private static final Random random = new Random();


    public void createDefaultAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            AbstractAnimal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано животное: " + animal.getName());
            count++;
        }
    }


    public void createNAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            AbstractAnimal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано животное: " + animal.getName());
        }
    }


    public void createNAnimalsDoWhile(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            AbstractAnimal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано животное: " + animal.getName());
            count++;
        } while (count < n);
    }


    private AbstractAnimal createRandomAnimal() {
        String name = "Animal" + random.nextInt(1000);
        double cost = random.nextDouble() * 100;
        String character = random.nextBoolean() ? "Friendly" : "Aggressive";
        LocalDate birthDate = LocalDate.of(random.nextInt(2020 - 2000) + 2000, random.nextInt(12) + 1, random.nextInt(28) + 1);
        return random.nextBoolean() ? new Predator(name, cost, character, birthDate) : new Pet(name, cost, character, birthDate);
    }
}
