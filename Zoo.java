import java.util.ArrayList;

class Zoo {
    ArrayList<Animal> animales = new ArrayList<>();
    int ID;

    public void agregar() {
        System.out.println("Que deseas agregar. \n1)Dog\n2)Cat\n3)Turtle");
        int aux;
        aux = CapturaEntrada.capturarEntero("");
        switch (aux) {
            case 1:
                animales.add(new Dog(CapturaEntrada.capturarCadena("Nombre "), "Dalmata", 12));
                break;
            case 2:
                animales.add(new Cat(CapturaEntrada.capturarCadena("Nombre "), "Mestizo", 12));
                break;
            case 3:
                animales.add(new Turtle("Camilo estrella", 12));
                break;
        }
        ID++;
        System.out.println("ID del animal " + ID);
    }

    public void eliminar() {
        int IDs;
        IDs = CapturaEntrada.capturarEntero("Ingresa el ID del animal que desea eleminar ");
        animales.remove(IDs - 1);
        ID--;
    }

    public void mostrar() {
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i).getName());
            System.out.println(animales.get(i).getAge());
        }

    }

}
