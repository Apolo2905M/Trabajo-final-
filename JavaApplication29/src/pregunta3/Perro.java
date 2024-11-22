package pregunta3;

public class Perro extends Mascota {

    public Perro(String nombreDeAnimal, double peso, String aliasMascota, Dueño dueño) {
        super(nombreDeAnimal, peso, "Canino", aliasMascota, dueño);
    }

    @Override
    public void method() {
        System.out.println("Método específico para Perro.");
    }
}
