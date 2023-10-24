public class Condicionales {
    // ( == , != , < , > , =< , => , && , || , ! )
    public static void main(String[] args) {
        int edad = 18;
        String respuesta;

        // Condicional IF
        if (edad < 18){
            respuesta = "Eres Menor de Edad";
        } else {
            respuesta = "Eres Mayor de Edad";
        }
        System.out.println("Tienes " + edad + " años de edad " + respuesta);

        // Condicional Corta
        int a = 8;
        int b = 5;
        System.out.println("A es igual a B : " + (a == b)); //False
        System.out.println("A es igual a B : " + (a != b)); //True

        // Condicional Anidada
        if (edad < 18){
            respuesta = "Eres Menor de Edad";
        } else if (edad == 18){
            respuesta = "Acabas de hacerte mayor de edad";
        } else {
            respuesta = "Eres Mayor de edad";
        }
        System.out.println("Tienes " + edad + " años de edad " + respuesta);

        // Switch
        int numToString = 5;
        switch (numToString){
            case 1:
                System.out.println("Numero Uno");
                break;
            case 2:
                System.out.println("Numero Dos");
                break;
            case 3:
                System.out.println("Numero Tres");
                break;
            default:
                System.out.println("No lo tengo el dato en la BD");
                break;
        }
    }
}
