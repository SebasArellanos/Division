import java.util.Scanner;

class MainDivison {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        double y, x;

        System.out.println("ingresa un numero entero");

        x = op.nextDouble();

        System.out.println("ingresa otro numero entero");

        y = op.nextDouble();

        Division evaluar = new Division();
        evaluar.setX(x);
        evaluar.setY(y);
        System.out.println("el resultado es: " + evaluar.mostrarResultado());
    }
}