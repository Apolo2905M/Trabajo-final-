package pregunta3;

public class Mascota extends Animal {

    private String aliasMascota;
    private Dueño dueño;

    public Mascota(String nombreDeAnimal, double peso, String raza, String aliasMascota, Dueño dueño) {
        super(nombreDeAnimal, peso, raza);
        this.aliasMascota = aliasMascota;
        this.dueño = dueño;
    }

    public Mascota() {
    }

    public String getAliasMascota() {
        return aliasMascota;
    }

    public void setAliasMascota(String aliasMascota) {
        this.aliasMascota = aliasMascota;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public void method() {
        System.out.println("Método implementado en Mascota.");
    }
}
