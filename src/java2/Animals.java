package java2;
import java.time.LocalDate;
import java.util.Objects;


interface Animal {
    String getBreed();
    String getName();
    double getCost();
    String getCharacter();
    LocalDate getBirthDate();
}


abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер
    protected LocalDate birthDate; // день рождения

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractAnimal)) return false;
        AbstractAnimal that = (AbstractAnimal) obj;
        return breed.equals(that.breed) && name.equals(that.name) && cost.equals(that.cost) && character.equals(that.character) && birthDate.equals(that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, cost, character, birthDate);
    }
}


class Predator extends AbstractAnimal {
    public Predator(String name, double cost, String character, LocalDate birthDate) {
        super("Predator", name, cost, character, birthDate);
    }
}


class Pet extends AbstractAnimal {
    public Pet(String name, double cost, String character, LocalDate birthDate) {
        super("Pet", name, cost, character, birthDate);
    }
}
