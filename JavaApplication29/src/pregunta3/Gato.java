package pregunta3;

public class Gato extends Mascota {

    public Gato(String nombreDeAnimal, double peso, String aliasMascota, Dueño dueño) {
        super(nombreDeAnimal, peso, "Felino", aliasMascota, dueño);
    }

    @Override
    public void method() {
        System.out.println("Método específico para Gato.");
    }
}
