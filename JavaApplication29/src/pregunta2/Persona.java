package pregunta2;

import java.time.LocalDate;
import pregunta2.SignoZodiacal;
import pregunta2.ZodiacoChino;

public class Persona {

    private int dia;
    private int mes;
    private int anio;
    private LocalDate fechaNacimiento;

    public Persona(int dia, int mes, int anio) {
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();

        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()
                || (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()
                && fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
            edad--;
        }

        return edad;
    }

    public String obtenerSignoZodiacal() {
        return new SignoZodiacal().calcularSignoZodiacal(fechaNacimiento);
    }

    public ZodiacoChino obtenerZodiacoChino() {
        return new ZodiacoChino().obtenerAnimal(fechaNacimiento.getYear());
    }
    
}
