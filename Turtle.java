class Turtle extends Animal {
    public Turtle(String name, int age) {
        super(name, age);
    }

    public void move() {
        System.out.println("The turtle " + name + "is moving slowly");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating slowly");
    }
}
