import java.util.ArrayList;

class Veterinarian {
    String name;
    double salary;

    public Veterinarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate(Animal animal) {
        animal.setVaccinated(true);
        System.out.println(animal.getName() + " was vaccinated");
    }

    public void contarAnimales(ArrayList<Animal> animals) {
        System.out.println(animals.size() + " Animales en el zoo");
    }
}
