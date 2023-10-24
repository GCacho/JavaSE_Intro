public class Operadores {
    public static void main(String[] args) {
        int num = 0;
        // Incremento
        num++;
        // Decremento
        num--;
        // Math Operations
        var x = 2.1;
        var y = 3;
        // Redondear hacia arriba.
        System.out.println(Math.ceil(x));
        // Redondear hacia abajo.
        System.out.println(Math.floor(x));
        // Numero elevado a otro
        System.out.println(Math.pow(x,y));
        // Num mayor
        System.out.println(Math.max(x,y));
        // Obtener Raiz Cuadrada
        System.out.println(Math.sqrt(y));
        // Area de circulo
        // pi * r2
        System.out.println(Math.PI* Math.pow(y,2));
        // Volumen de esfera
        // (4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
