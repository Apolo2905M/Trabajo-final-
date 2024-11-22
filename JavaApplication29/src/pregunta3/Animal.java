package pregunta3;

public abstract class Animal implements IAnimal {

    protected String nombreDeAnimal;
    protected double peso;
    protected String raza;

    public Animal(String nombreDeAnimal, double peso, String raza) {
        this.nombreDeAnimal = nombreDeAnimal;
        this.peso = peso;
        this.raza = raza;
    }

    public Animal() {
    }

    public abstract void method();

    @Override
    public void respirar() {
        System.out.println(nombreDeAnimal + " está respirando.");
    }

    @Override
    public void comer() {
        System.out.println(nombreDeAnimal + " está comiendo.");
    }

    @Override
    public void jugar() {
        System.out.println(nombreDeAnimal + " está jugando.");
    }
}
