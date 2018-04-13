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
        //Primero nos hacemos con el documento
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
         Elements temp = doc.select("div.today_nowcard-temp");
         System.out.println("Temperatura: "+temp.text());
         Elements frase = doc.select("div.today_nowcard-phrase");
         System.out.println("Comentario: "+frase.text());
    }
    
}
