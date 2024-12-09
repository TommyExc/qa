package java2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();

        System.out.println("Создание 10 уникальных животных:");
        createAnimalService.createDefaultAnimals();

        System.out.println("\nСоздание 5 уникальных животных:");
        createAnimalService.createNAnimals(5);

        System.out.println("\nСоздание 3 уникальных животных с использованием do-while:");
        createAnimalService.createNAnimalsDoWhile(3);

        AbstractAnimal[] animals = {
                new Predator("Lion", 150.0, "Fierce", LocalDate.of(2016, 5, 15)),
                new Pet("Cat", 50.0, "Playful", LocalDate.of(2020, 2, 29)),
                new Predator("Tiger", 120.0, "Aggressive", LocalDate.of(2018, 7, 10)),
                new Pet("Dog", 80.0, "Loyal", LocalDate.of(2016, 12, 25)),
                new Predator("Cheetah", 200.0, "Fast", LocalDate.of(2019, 1, 1))
        };

        SearchService searchService = new SearchServiceImpl();

        String[] leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("\nЖивотные, родившиеся в високосный год:");
        for (String name : leapYearNames) {
            System.out.println(name);
        }
        
        int years = 3;
        AbstractAnimal[] olderAnimals = searchService.findOlderAnimal(animals, years);
        System.out.println("\nЖивотные старше " + years + " лет:");
        for (AbstractAnimal animal : olderAnimals) {
            System.out.println(animal.getName());
        }

        // Поиск дубликатов
        System.out.println("\nПоиск дубликатов животных:");
        searchService.findDuplicate(animals);
    }
}
