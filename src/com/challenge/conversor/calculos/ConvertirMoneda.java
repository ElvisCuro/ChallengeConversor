package com.challenge.conversor.calculos;

import com.challenge.conversor.modelos.Moneda;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase,
                                 String monedaTarget,
                                 ConsultaMoneda consulta,
                                 Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscaMoneda(monedaBase,monedaTarget);
        System.out.println("Ingrese la cantidad que desea convertir");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println("La cantidad de: " + cantidad + " " + monedaBase + "\n"+
                "Equivale a: " + cantidadConvertida + " " + monedaTarget );
    }
}
