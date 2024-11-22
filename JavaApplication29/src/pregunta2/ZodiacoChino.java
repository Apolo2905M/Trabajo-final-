package pregunta2;

public class ZodiacoChino {

    private String animal;
    private String imagen;

    // Constructor por defecto
    public ZodiacoChino() {
    }

    // Constructor parametrizado
    public ZodiacoChino(String animal, String imagen) {
        this.animal = animal;
        this.imagen = imagen;
    }

    // Getters
    public String getAnimal() {
        return animal;
    }

    public String getImagen() {
        return imagen;
    }

    // Método para obtener el animal y su imagen basados en el año
    public ZodiacoChino obtenerAnimal(int anio) {
        // Arreglo de los animales del zodiaco chino
        ZodiacoChino[] animales = {
            new ZodiacoChino("RATA", "src/resources/rata.jpg"),
            new ZodiacoChino("BUEY", "src/resources/buey.jpg"),
            new ZodiacoChino("TIGRE", "src/resources/tigre.jpg"),
            new ZodiacoChino("CONEJO", "src/resources/conejo.jpg"),
            new ZodiacoChino("DRAGÓN", "src/resources/dragon.jpg"),
            new ZodiacoChino("SERPIENTE", "src/resources/serpiente.jpg"),
            new ZodiacoChino("CABALLO", "src/resources/caballo.jpg"),
            new ZodiacoChino("CABRA", "src/resources/cabra.jpg"),
            new ZodiacoChino("MONO", "src/resources/mono.jpg"),
            new ZodiacoChino("GALLO", "src/resources/gallo.jpg"),
            new ZodiacoChino("PERRO", "src/resources/perro.jpg"),
            new ZodiacoChino("CERDO", "src/resources/cerdo.jpg")
        };

        // Cálculo del índice del animal en el ciclo del zodiaco
        int indice = (anio - 1924) % 12;
        if (indice < 0) {
            indice += 12; // Ajustar para años negativos
        }

        // Devolver el animal correspondiente
        return animales[indice];
    }

    // Método main para probar el código
    public static void main(String[] args) {
        ZodiacoChino zodiaco = new ZodiacoChino();
        int anio = 1996; // Cambiar este valor para probar otros años
        ZodiacoChino resultado = zodiaco.obtenerAnimal(anio);

        System.out.println("Año: " + anio);
        System.out.println("Animal: " + resultado.getAnimal());
        System.out.println("Imagen: " + resultado.getImagen());
    }
}
