/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weatherexam;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author pnocedalopez
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            //Primero nos hacemos con el documento HTML
            Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
            //buscamos y metemos en "temp" el dato de la temperatura 
            Elements temp = doc.select("div.today_nowcard-temp");
            //buscamos y metemos en "frase" la frase que describe el tiempo
            Elements frase = doc.select("div.today_nowcard-phrase");
            //Finalmente imprimimos los datos 
            //Los .text() son necesarios para que no se impriman etiquetas innecesarias y solo se tenga en 
            //cuenta el contenido.
            System.out.println("Hoy está " + frase.text() + " y hace " + temp.text() + ". Datos extraídos de Vigo, España Pronóstico del tiempo y condiciones meteorológicas - The Weather Channel | Weather.com");
        } catch (Exception exception) {
            System.exit(0);
        }

    }
}
