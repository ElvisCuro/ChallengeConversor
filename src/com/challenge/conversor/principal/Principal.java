package com.challenge.conversor.principal;

import com.challenge.conversor.calculos.ConsultaMoneda;
import com.challenge.conversor.calculos.ConvertirMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        com.challenge.conversor.calculos.ConsultaMoneda consulta = new com.challenge.conversor.calculos.ConsultaMoneda();
//        com.challenge.conversor.modelos.Moneda moneda = consulta.buscaMoneda("USD","PEN");
//        System.out.println(moneda);
//        System.out.println();}
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion;

        do {
            System.out.println("*************************************************");
            System.out.println("Sea bienvenido/a al Conversor de com.challenge.conversor.modelos.Moneda =]");
            System.out.println("*************************************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Dólar => Nuevo Sol peruano");
            System.out.println("8) Nuevo Sol peruano => Dólar");
            System.out.println("9) Salir");
            System.out.println("*************************************************");
            System.out.print("Elija una opción válida: ");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Conversión de Dólar a Peso argentino.");
                    ConvertirMoneda.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    System.out.println("Conversión de Peso argentino a Dólar.");
                    ConvertirMoneda.convertir("ARS","USD",consulta,lectura);
                    break;
                case 3:
                    System.out.println("Conversión de Dólar a Real brasileño.");
                    ConvertirMoneda.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    System.out.println("Conversión de Real brasileño a Dólar.");
                    ConvertirMoneda.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    System.out.println("Conversión de Dólar a Peso colombiano.");
                    ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    System.out.println("Conversión de Peso colombiano a Dólar.");
                    ConvertirMoneda.convertir("COP","BRL",consulta,lectura);
                    break;
                case 7:
                    System.out.println("Conversión de Dólar a Nuevo Sol peruano.");
                    ConvertirMoneda.convertir("USD","PEN",consulta,lectura);
                    break;
                case 8:
                    System.out.println("Conversión de Nuevo Sol peruano a Dólar.");
                    ConvertirMoneda.convertir("PEN","BRL",consulta,lectura);
                    break;
                case 9:
                    System.out.println("Saliendo del programa. ¡Gracias por usar el conversor!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 9);
    }
}
