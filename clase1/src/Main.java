class Cat {
    private int age;
    private int color;

    // Constructor para inicializar un gato con edad y color
    public Cat(int age, int color) {
        this.age = age;
        this.color = color;
    }

    // Getter para obtener la edad
    public int getAge() {
        return age;
    }

    // Setter para establecer la edad
    public void setAge(int age) {
        this.age = age;
    }

    // Getter para obtener el color
    public int getColor() {
        return color;
    }

    // Setter para establecer el color
    public void setColor(int color) {
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo gato
        Cat miMichi = new Cat(6, 1);

        // Imprimir la edad del gato
        System.out.println("Edad de miMichi: " + miMichi.getAge());

        // Cambiar la edad del gato
        miMichi.setAge(7);

        // Imprimir la nueva edad del gato
        System.out.println("Nueva edad de miMichi: " + miMichi.getAge());
    }
}
