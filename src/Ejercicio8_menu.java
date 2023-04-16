//Cambio 1 hotfix
import java.util.Scanner;
//Menu que da a eligir que archivo del tema2 realizar
public class Ejercicio8_menu {
    public static void main(String[] args) throws Exception {
        //Abirmos la terminal para poder leer y mostrar datos 
        
        try (Scanner terminal = new Scanner(System.in)) {
            //Mostramos el menú
                System.out.println("    1. Se ejecuta Ejercicio1_OperacioneBasicas");
                System.out.println("    2. Ejercicio2_CambioDeSigno");
                System.out.println("    3. Se ejecuta Ejercicio3_MediasAritméticas");
                System.out.println("    4. Se ejecuta Ejercicio4_CalcularHipotenusaCatetos");
                System.out.println("    5. Se ejecuta Ejercicio5_Segundos");
                System.out.println("    6. Se ejecuta Ejercicio6_gradosAFrarenheit");
                System.out.println("    7. Se ejecuta Ejercicio7_IMC");
                System.out.println("    8. Se ejecuta Ejercicio8_OrdenNúmerosCreciente");
                System.out.println("    9. Se ejecuta el factorial del numero introducido");
                System.out.println("    10. Par o Impar");
                System.out.println("    11. Semanas, días y horas");
                System.out.println("    12. Años bisiestos");
                System.out.println("    13. Array inverso");




                System.out.print("Tu respuesta es: ");
            //creamos la variable que será la respuesta 
                int op = terminal.nextInt();
            //Creamos el menú con swicth

                switch(op)
                {
                    case 1:
                        //Pedimos y guadamos las variables por ese orden
                            System.out.print("Introuce un número");
                            int n1 = terminal.nextInt();
                
                            System.out.print("Introuce otro número");
                            int n2 = terminal.nextInt();

                        //Ahora sumamos, restamos, multiplición y la división con los datos indicados
                            int suma= n1+n2;
                            int resta=n1-n2;
                            int multiplicion=n1*n2;
                            int division=n1/n2;
                        // Ahora mostramos los resultados
                            System.out.println("La suma es: " + suma);
                            System.out.println("La resta es: " + resta);
                            System.out.println("La multiplicación es: " + multiplicion);
                            System.out.println("La división es: " + division);
                    break;

                    case 2:
                        //Pedimos y guadamos las variables por ese orden
                            System.out.print("Introduce un número: ");
                            int n1_ejer2 = terminal.nextInt();
                        //Ahora hacemos la operacion para que nos devuelva el contrario del valor introducido
                        //Mostramos el resultado
                            System.out.println("Este valor cambiado su signo es "+ Funciones.CambioDeSigno(n1_ejer2));
                    break;

                    case 3:
                    //  Pedimos y guardamos 3 números
                        System.out.println("Introduce 3 números");
                        int n1_ejer3= terminal.nextInt();
                        int n2_ejer3= terminal.nextInt();
                        int n3_ejer3= terminal.nextInt();
                    //Mostramos el resultado
                        System.out.println("El resultado de la media es "+Funciones.media3n(n1_ejer3, n2_ejer3, n3_ejer3));
                    break;

                    case 4:
                    //Pedimos y guadamos las variables por ese orden
                        System.out.println("Introduce el valor de dos catetos para calcular la hipotenusa");
                    //Aqui utilizamos el metodo math.pow para elevarlo al cuadrado
                        double c1=terminal.nextDouble(); 
                        double c2=terminal.nextDouble(); 
                    //Hacemos la operación para calcular la hipotenusa, usamos el metodo Math.sqrt para hacer la raiz cuadrada
                        
                        System.out.println(Funciones.hipotenusa(c1, c2));
                    break;

                    case 5:
                    //Guardamos la constante que será 60
                        final int sh = 60;
                    //Pedimos y guadamos las variables por ese orden
                        System.out.print("Introuduce los días: ");
                        int dias = terminal.nextInt();
                        
                        System.out.print("Introuduce los horas: ");
                        int horas = terminal.nextInt();

                        System.out.print("Introuduce los minutos: ");
                        int minutos = terminal.nextInt();

                        System.out.print("Introuduce los segundos: ");
                        int segundos = terminal.nextInt();
                        System.out.println("En segundos son "+ Funciones.pasarASegundos(dias, horas, minutos, sh, segundos));
                    break;
                    
                    case 6:
                    //Pedimos los grados centigrados y guardamos la información6
                        System.out.print("Introduce una cantidad de grados centigrados para pasarlo a farenheit: ");
                        double grados=terminal.nextDouble();
                        System.out.println(Funciones.gradosAFarenheit(grados) + " farenheit");
                    break;

                    case 7:
                    //1. Pedimos y guardamos variables
                        System.out.print("Ingresa el peso en Kg, si el número es decimal ponga comas: ");
                        double kg=terminal.nextDouble();
                        System.out.print("Ingresa la altura en m, si el número es decimal ponga comas: ");
                        double m=terminal.nextDouble();
                        Funciones.imc(kg, m);
                    break;


                    case 8:
                    //1º pedimos y guardamos los numeros
                        System.out.println("Introduce 3 números");
                        Double n1_ejer8 = terminal.nextDouble();
                        Double n2_ejer8 = terminal.nextDouble();
                        Double n3_ejer8 = terminal.nextDouble(); 
                        for(Double i : Funciones.ordenar(n1_ejer8, n2_ejer8, n3_ejer8)){System.out.print( i + ", ");}
                    break;

                    case 9:
                        System.out.println("Introduzca el numero para calcular");
                        int n= terminal.nextInt(); 
                        System.out.println(Funciones.fact(n));
                    break;
                        
                    case 10:
                    //1º pedimos un numero
                        System.out.print("Introduce un número: ");
                        int n1_ejer10 = terminal.nextInt();
                        System.out.println(Funciones.parImpar(n1_ejer10));
                    //2º lo dvidimos entre 2 y sacamos el resto
                    break;
                    
                    case 11:
                    //1º pedimos las horas
                        System.out.print("Introduce las horas: ");
                        int horas_ejer11 = terminal.nextInt();
                        Funciones.horasADiasSemanas(horas_ejer11);
                    break;
                    
                    case 12:
                    //Pedimos el año que queremos saber si es bisiesto
                        System.out.print("Introduce un año: ");
                        int añosBisiestos= terminal.nextInt();
                        Funciones.añosBisiestos(añosBisiestos);
                    break;

                    case 13:
                    //declaramos el array
                    int [] array= {5, 3, 7, 9, 6, 5};
                    //declaramos el bucle que recorrerá el array
                    Funciones.recorrerArray(array);
                    break;
                    default:
                        System.out.println("Error, introduzca otro valor");
                    break;
                }
        
            }
    }
}
