import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1. Programa Java que lea dos números enteros por teclado y los muestre

        int number1, number2;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        number1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce otro número entero");
        number2 = sc2.nextInt();

        System.out.println("Los números ingresados son los siguientes: " + number1 + " y " + number2);


        //EJERCICIO 2. Programa Java que lea un nombre y muestre por pantalla: “Buenos
        //dias nombre_introducido”
        //
        String name;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        name = sc3.nextLine();
        System.out.println("Buenos días " + name);

        //EJERCICIO 3. Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por
        //pantalla el doble y el triple de ese número.

        int n;
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        n = sc4.nextInt();
        System.out.println("El doble del número que ingresaste es: " + n * 2);
        System.out.println("El triple del número que ingresaste es: " + n * 3);


        //EJERCICIO 4:Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        //La fórmula correspondiente para pasar de grados centígrados a fahrenheit es: F = 32 + ( 9 * C / 5)

        double celsius, fahrenheit;
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual en grados celsius: ");
        celsius = sc5.nextDouble();
        fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);


        //EJERCICIO 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra
        //por pantalla la longitud y el área de la circunferencia.
        //Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
        double radio, longiCircun, areaCircun;
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia");
        radio = sc6.nextDouble();
        longiCircun = 2 * Math.PI * radio;
        areaCircun = Math.PI * Math.pow(radio, 2);
        System.out.println("El resultado de la Longitud de la circunferencia es: " + longiCircun);
        System.out.println("El resultado de el Area de la circunferencia es:" + areaCircun);


        //EJERCICIO 6.-  HACER un programa que imprima todos los números enteros dedes el entero 'a' hasta el entero 'b'

        int A, B;

        Scanner sc7 = new Scanner(System.in);
        System.out.println("Ingresa un número Entero, será el número inicial. Debe ser menor a 100000");
        A = sc7.nextInt();


        Scanner sc8 = new Scanner(System.in);
        System.out.println("Ingresa otro número Entero final, mayor al anterior. Debe ser menor a 100000 ");
        B = sc8.nextInt();

        if ((A < 0) || (B > 100000)) {
            System.out.println("Ingresa un número mayor a 0 y menor que 100000");
        } else {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        }
    }
}