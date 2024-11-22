package pregunta2;

import java.time.LocalDate;
import java.time.Month;

public class SignoZodiacal {

    public SignoZodiacal() {
    }
    
    public String calcularSignoZodiacal(LocalDate fechaNacimiento) {
        int dia = fechaNacimiento.getDayOfMonth();
        Month mes = fechaNacimiento.getMonth();

        if ((mes == Month.MARCH && dia >= 21) || (mes == Month.APRIL && dia <= 19)) {
            return "ARIES";
        } else if ((mes == Month.APRIL && dia >= 20) || (mes == Month.MAY && dia <= 20)) {
            return "TAURO";
        } else if ((mes == Month.MAY && dia >= 21) || (mes == Month.JUNE && dia <= 20)) {
            return "GÉMINIS";
        } else if ((mes == Month.JUNE && dia >= 21) || (mes == Month.JULY && dia <= 22)) {
            return "CÁNCER";
        } else if ((mes == Month.JULY && dia >= 23) || (mes == Month.AUGUST && dia <= 22)) {
            return "LEO";
        } else if ((mes == Month.AUGUST && dia >= 23) || (mes == Month.SEPTEMBER && dia <= 22)) {
            return "VIRGO";
        } else if ((mes == Month.SEPTEMBER && dia >= 23) || (mes == Month.OCTOBER && dia <= 22)) {
            return "LIBRA";
        } else if ((mes == Month.OCTOBER && dia >= 23) || (mes == Month.NOVEMBER && dia <= 21)) {
            return "ESCORPIÓN";
        } else if ((mes == Month.NOVEMBER && dia >= 22) || (mes == Month.DECEMBER && dia <= 21)) {
            return "SAGITARIO";
        } else if ((mes == Month.DECEMBER && dia >= 22) || (mes == Month.JANUARY && dia <= 19)) {
            return "CAPRICORNIO";
        } else if ((mes == Month.JANUARY && dia >= 20) || (mes == Month.FEBRUARY && dia <= 18)) {
            return "ACUARIO";
        } else {
            return "PISCIS";
        }
    }
}
