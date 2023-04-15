import java.util.Arrays;

public class Funciones {
//!Esta función ejecuta las 4 operaciones básicas, caso1
    /**
     * La función `suma` toma dos enteros como entrada y devuelve la suma de los dos enteros
     * 
     * @param n1 El primer número que se va a sumar.
     * @param n2 El segundo número que se sumará.
     * @return La suma de los dos números.
     */
    public static int suma(int n1, int n2){
        int suma= n1+n2;
        return suma;
    }
    /*
    * La función `resta` toma dos números enteros, `n1` y `n2`, y devuelve la diferencia entre ellos
    * 
    * @param n1 El primer número a restar.
    * @param n2 El segundo número a restar del primero.
    * @return El resultado de la operación.
    */
/**
     * La función `resta` toma dos números enteros, `n1` y `n2`, y devuelve la diferencia entre ellos
     * 
     * @param n1 El primer número a restar.
     * @param n2 El segundo número a restar del primero.
     * @return El resultado de la operación.
     */
    public static int resta(int n1, int n2){
        int resta= n1+n2;
        return resta;
    }
    /**
     * Multiplica dos números.
     * 
     * @param n1 El primer número a multiplicar.
     * @param n2 El segundo número a multiplicar.
     * @return El resultado de la multiplicación de los dos números.
     */
    public static int multiplicacion(int n1, int n2){
        int multiplicacion= n1+n2;
        return multiplicacion;
    }
   /**
    * Esta función toma dos enteros como parámetros y devuelve la suma de los dos enteros
    * 
    * @param n1 el primer numero
    * @param n2 El segundo número a dividir.
    * @return La división de los dos números.
    */
    public static int division(int n1, int n2){
        int division= n1+n2;
        return division;
    }
//!Esta función realiza el un cambio de singo, caso 2
    /**
     * La función toma un entero como argumento y devuelve el entero multiplicado por -1
     * 
     * @param n1_ejer2 El número que se multiplicará por -1.
     * @return El resultado de la operación.
     */
    public static int CambioDeSigno(int n1_ejer2){
        int resultado=n1_ejer2 * -1;
        return resultado;
    }

//!Esta función calcula la media de 3 números, CASO3
    /**
     * Esta función toma tres números enteros como parámetros y devuelve el promedio de los tres
     * números
     * 
     * @param n1_ejer3 Primer número
     * @param n2_ejer3 es el segundo numero
     * @param n3_ejer3 es el tercer número que ingresa el usuario.
     * @return El promedio de los tres números.
     */
    public static int media3n(int n1_ejer3, int n2_ejer3, int n3_ejer3){
        int resultado_ejer3=(n1_ejer3+n2_ejer3+n3_ejer3)/3;
        return resultado_ejer3;        
    }
//!Esta función devuelve la hipotenusa dando como parametros 2 catetos,CASO4
    /**
     * > Esta función toma dos números como entrada y devuelve la raíz cuadrada de la suma de los cuadrados
     * de los dos números
     * 
     * @param c1 primer cateto
     * @param c2 la longitud del segundo lado del triangulo
     * @return El resultado de la operación
     */
    public static double hipotenusa(double c1, double c2){        
        double cc1=Math.pow(c1, 2); 
        double cc2=Math.pow(c2, 2); 
    //Hacemos la operación para calcular la hipotenusa, usamos el metodo Math.sqrt para hacer la raiz cuadrada
        double resultado_ejer4= Math.sqrt(cc1+cc2) ;
        return resultado_ejer4;
    }

//!Esta función pásara de segundos a las siguientes cantidades: días, horas y minutos, CASO5
    /**
     * Toma cuatro enteros como entrada y devuelve un entero
     * 
     * @param dias días
     * @param horas horas
     * @param minutos minutos
     * @param sh segundos en una hora
     * @param segundos segundos
     * @return El resultado de la operación.
     */
    public static int pasarASegundos(int dias, int horas, int minutos, int sh, int segundos){
    //Hacemos las conversiones
        int diasASegundos=dias*sh*sh*24;
        int horasASegundos=horas*sh*sh;
        int minutosASegundos=minutos*sh;

        //Mostramos el resultado
        int resultado_ejer5 = diasASegundos+ horasASegundos + minutosASegundos+ segundos;
        return resultado_ejer5;
        }

//!Esta función pasará de se grados centigrados a Farenheit, CASO6
    /**
     * Esta función toma una temperatura en grados Celsius y devuelve la temperatura equivalente en
     * grados Fahrenheit
     * 
     * @param grados La temperatura en grados Celsius.
     * @return El valor de la variable Fahrenheit.
     */
    public static double gradosAFarenheit(double grados){
    //Hacemos la opracion para pasarlo a grados centigrados:  F = 32 + (9 * C / 5).   
    double Fahrenheit = 32+(9*grados/5);
    return Fahrenheit;
    }
//!Esta función calculará el imc nos dirá nuestro estado de salud, CASO7 
    /**
     * Toma dos números como entrada, calcula el IMC e imprime un mensaje basado en el IMC
     * 
     * @param kg peso en kilogramos
     * @param m altura en metros
     * @return Nada
     */
    public static String imc(double kg, double m){
        //Calculamos el IMC
        double imc=kg/(m*m);
        String x=null;
        //Dependiendo del resultado mostramos los siguientes resultados
            if (imc<18.5){
                System.out.println("Bajo peso");
            }
            if(imc >= 18.5 && imc <24.9){
                System.out.println("Normapeso");
            }

            if(imc >= 24.9 && imc <26.9){
                System.out.println("Sobrepeso grado 1");
            }

            if(imc >= 26.9 && imc <29.9){
                System.out.println("Sobrepeso grado 2");
            }

            if(imc >= 29.9 && imc < 34.9){
                System.out.println("Obesidad grado 1");
            }

            if(imc >= 34.9 && imc <39.9){
                System.out.println("Obesidad grado 2");
            }

            if(imc >= 39.9 && imc <49.9){
                System.out.println("Obesidad grado 3(Mórbida)");
            }

            if(imc > 50){
                System.out.println("Obesidad grado 4(Extrema)");
            }
           return x;
    }
//!Esta función se encargará de organizar 3 números dados, CASO8
    /**
     * Toma tres números como entrada, los ordena en orden ascendente y los devuelve como una matriz
     * 
     * @param n1_ejer8 el primer numero
     * @param n2_ejer8 es el segundo numero
     * @param n3_ejer8 Doble
     * @return El método devuelve una matriz de dobles.
     */
    public static Double[] ordenar(Double n1_ejer8, Double n2_ejer8, Double n3_ejer8){
        Double [] nOrdenados = {n1_ejer8, n2_ejer8, n3_ejer8};
        //ordenamos los números con el método sort de la clase array
        Arrays.sort(nOrdenados);
        return nOrdenados;
    }

//!Este función realiza el factorial del número indicado, CASO9
   /**
    * La función toma un entero como argumento y devuelve el factorial de ese entero
    * 
    * @param n El número para calcular el factorial de.
    * @return El factorial del número ingresado.
    */
    public static int fact(int n){
        int factorial=1;
        for(int i=1; i<=n; ++i){
            factorial= factorial*i;
            }
        System.out.print("El factorial es ");
        return factorial;
    }
//!Esta función averiguará si un número es par o impar,CASO10
    /**
     * Toma un número entero como argumento y devuelve una cadena que dice si el número entero es par o
     * impar.
     * 
     * @param n1_ejer10 El número que ingresa el usuario.
     * @return El método está devolviendo el valor de la variable x.
     */
    public static String parImpar(int n1_ejer10){
        int resto = n1_ejer10 % 2;
        String x;
        if (resto == 0){
            System.out.println(x = "El número " + n1_ejer10 + " es par");
        }else{
            System.out.println(x ="El número " + n1_ejer10 + " es impar");
        }
        return x;
    }
//!Esta función calculará cuantos días, semanas y horas son unas horas introducidas, CASO11
/**
 * Toma un número entero como entrada, lo divide por 168 y luego divide el resto por 24
 * 
 * @param horas_ejer11 el numero de horas
 * @return El método está devolviendo el valor de la variable x.
 */
    public static String horasADiasSemanas(int horas_ejer11){
        //2º Calculamos los restos para saber cuantos dias y horas nos quedan
        //2.1 Calculamos las semanas dividiendo el numero de horas de entrada entre el numero de horas que tiene una semana
        int semanas= horas_ejer11 / 168;
        //2.2 El resto de esa cuenta nos dará el número de horas y lo dividiremos entre 24 para calcular el número de días
        int dias_ejer11=(horas_ejer11 % 168)/24;
        //2.3 El resto de los días lo cogeremos y lo llamaremos horas
        int horas2_ejer11=(horas_ejer11 % 168)%24;
        //Mostramos los resultados
        String x;
        System.out.println(x="Son " + semanas + " semanas");
        System.out.println(x="Son " + dias_ejer11 + " días");
        System.out.println(x="Son " + horas2_ejer11 + " horas");
        //System.out.println("Son " + horas2 + " horas");
        return x;
    }

//!Esta función tiene que decidir si el año introducido es bisiesto o no, CASO12
    /**
     * *|CURSOR_MARCADOR|*
     * 
     * @param añosBisiestos El año que desea comprobar si es un año bisiesto o no.
     * @return El método está devolviendo una cadena.
     */
    public static String añosBisiestos(int añosBisiestos){
        //Si los años divididos entre 4 el resto es 0 o el año dividido entre 100 el resto distonto a 0 
        String x;
        if (añosBisiestos % 4 == 0 && añosBisiestos % 100 != 0 || añosBisiestos % 100 == 0 && añosBisiestos % 400 == 0){
        System.out.println(x="El año " + añosBisiestos + " es bisiesto");
        }else{
        System.out.println(x="El año " + añosBisiestos + " no es bisiesto");
        }
        return x;
    }
//!Esta funcion recorrerá una array indicada
/**
 * Toma una matriz de enteros como argumento y devuelve una cadena de elementos de la matriz separados
 * por comas.
 * 
 * @param array La matriz que se va a imprimir.
 * @return La matriz está siendo devuelta.
 */
    public static String recorrerArray(int [] array){
        //Declaramos el bucle que recorrerá el array
        String x="";
        for(int i=0; i < array.length ;i++){System.out.print(x= array[i] + ",  ");};
        return x;
    }
} 

    