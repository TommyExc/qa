package java2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


interface SearchService {
    String[] findLeapYearNames(AbstractAnimal[] animals);
    AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int years);
    void findDuplicate(AbstractAnimal[] animals);
}


class SearchServiceImpl implements SearchService {

    @Override
    public String[] findLeapYearNames(AbstractAnimal[] animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (isLeapYear(animal.getBirthDate().getYear())) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames.toArray(new String[0]);
    }

    @Override
    public AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int years) {
        List<AbstractAnimal> olderAnimals = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (AbstractAnimal animal : animals) {
            if (currentDate.getYear() - animal.getBirthDate().getYear() > years) {
                olderAnimals.add(animal);
            }
        }
        return olderAnimals.toArray(new AbstractAnimal[0]);
    }

    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        List<AbstractAnimal> duplicates = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j]) && !duplicates.contains(animals[i])) {
                    duplicates.add(animals[i]);
                }
            }
        }
        for (AbstractAnimal duplicate : duplicates) {
            System.out.println("Дубликат найден: " + duplicate.getName());
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

