public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        {
            int numero;
            String cadena;
            //con el scaner cogeis un numero entero positivo y una cadena

            //ver el string es palindromo
            //[
            //ver si el numero es primo
            public class NumeroPrimo {
                public static void main(String[] args) {
                    int NUM = 0; // Cambia este número por el que desees verificar

                    boolean Primo = true; // Suponemos inicialmente que el número es primo

                    if (NUM <= 1) {
                        Primo = false; // Los números menores o iguales a 1 no son primos
                    } else {
                        for (int i = 2; i <= NUM; i++) {
                            if (NUM % i == 0) {
                                Primo = false; // Si es divisible por algún número distinto de 1 y sí mismo, no es primo
                                break; // Salimos del bucle
                            }
                        }
                    }

                    if (Primo) {
                        System.out.println(NUM + " es un número primo.");
                    } else {
                        System.out.println(NUM + " no es un número primo.");
                    }
                }
            }


            //ver cuantas mayusculas tiene la cadena

            //Si no es primo factorizarlo:

            //mostrar el tamaño de la cadena
        }
    }
}
