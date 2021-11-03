class Dog extends Animal {
    public Dog(String name, String breed, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating Pedigree");
    }

    public void ladrar() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Woof ! woof! Woof!");
        }
        System.out.println("Woof ! woof! Woof!");
    }
}
