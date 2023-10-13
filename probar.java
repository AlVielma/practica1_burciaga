import java.util.Scanner;

public class probar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        // Empezamos con un do while para que se haga el sistema de menu en consola
        do {
            System.out.println("Bienvenido a nuestra expresión regular:");
            System.out.println("1. Ingresar la cadena y verificar");
            System.out.println("2. Ver créditos");
            System.out.println("3. Salir");
            System.out.print("Ingresa el número de opción: ");
            
            // declaramos nuestro escaner por que si no, no podras escribir
            opcion = scanner.nextInt();

            scanner.nextLine(); // Limpia el buffer del teclado

            switch (opcion) {
                //si el usuaqio selecciona 1 hace la expresion regular
                case 1:
                    System.out.print("Ingresa una cadena: ");
                    String cadena = scanner.nextLine();
                    //mandamos la cadena a nuestra clase
                    ExpresionRegular reconocedor = new ExpresionRegular(cadena);
                    //mediante las condiciones que tenemos en las funciones, dira si es verdadera o no
                    if (reconocedor.cumpleCondiciones()) {
                        System.out.println("La cadena SI cumple con las condiciones.");
                    } else {
                        System.out.println("La cadena NO cumple con las condiciones.");
                    }
                    break;

                case 2:
                    System.out.println("Créditos: Este programa fue desarrollado por:");
                    System.out.println("Francisco Javier Vielma Padron 22170029");
                    System.out.println("Jorge Adrian Lira Lopez 21170132");
                    break;
                case 3:
                    System.out.println("Gracias por comprobrar nuestra expresión regular, cualquier comentario es recibido :)");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}