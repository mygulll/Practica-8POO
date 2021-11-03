import java.util.ArrayList;

public class Ejercicios {
    public static void main(String[] args) {
        //Animal
        Animal animal = new Animal("Silvestre",999);
        animal.eat();
        animal.sleep();
        System.out.println();
        //Gato
        Cat gato = new Cat("Garfield","Persian ginger",12 );
         gato.eat();
         gato.sleep();
        System.out.println();
         //Perro
        Dog perro = new Dog("Pluto","Labrador",18 );
        perro.eat();
        perro.sleep();

        //Ejercicio 2
        Animal perrito = new Dog("Castle", "Pug", 2);
        perrito.eat();
        perrito.sleep();
        perrito.noise();
        //perrito.ladrar();
        //> java: cannot find symbol
        //  symbol:   method ladrar()
        //  location: variable perrito of type Animal

        //Ejercicio 3
        System.out.println("Ejercicio 3");
        Animal [] animals = new Animal[3];
        animals[0] = new Animal("An animal", 1);
        animals[1] = new Dog("Chispita","Labrador",12);
        animals[2] = new Cat("Miau", "Egipcio", 88);

        for (Animal a: animals) {
            a.eat();

            if(a instanceof Dog){
                ((Dog) a).ladrar();
            }
        }
        //Desafio
        System.out.println("Desafio");
        Zoo zoologico = new Zoo();
        zoologico.agregar();
        zoologico.agregar();
        zoologico.eliminar();
        Veterinarian vete = new Veterinarian("Arturo",1500 );
        vete.contarAnimales(zoologico.animales);
        zoologico.mostrar();

    }
}

