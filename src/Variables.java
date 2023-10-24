public class Variables {
    public static void main(String[] args) {
        // Asignar Variables
        String frases = "Esta es una frase";
        int numeros = 10;

        System.out.println(frases);
        System.out.println(numeros);

        // Modificar y Actualizar Variables
        int salario = 1000;
        int bono = 200;
        int total_salario = salario + bono;

        System.out.println(total_salario);

        // Concatenar datos y variables
        System.out.println("Salario Total = " + total_salario);

        // Nombrar Variables (Buenas Practicas)
        String nombreValido;
        String $otroNombreValido;
        String _otroNombreValido;

        // Nombrar Constantes
        final int POSITION = -5;
        final int MAX_WIDTH = 9999;
    }
}
