public class Funciones {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 7;
        int resSuma = sumaNumeros(num1, num2);
        int resRes = restaNumeros(num1, num2);
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + resSuma);
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + resRes);

        System.out.println("Pesos a Dolares = " + convertToDolar(200, "MXN"));
        System.out.println("Pesos a Dolares = " + convertToDolar(1000, "COP"));
    }

    // Function int
    public static int sumaNumeros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    public static int restaNumeros(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }

    // Function with various parameters
    public static double convertToDolar(double quantity, String currency){
        // MXN COP
        switch (currency){
            case "MXN":
            quantity = quantity * 0.052;
            break;
            case "COP":
            quantity = quantity * 0.00031;
            break;
        }
        return quantity;
    }
}
