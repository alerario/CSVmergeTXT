/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alexandrelerario
 */
public class Replacer {
    public String Replace(String txtFile, String csvFile, String separator){
        String vfinal=null;
        //int trocas=0;
        String txtInicial=new br.TxtReader().Reader(txtFile);
        vfinal=txtInicial;
        java.util.ArrayList<String[]> kw = new br.CsvReader().Reader(csvFile, separator);
      
        for (String[] strings : kw) {
            
            //vfinal.replaceAll(strings[0], "zz "+ strings[1]);
            System.out.println("Subst: " + strings[0]);
            CharSequence c1, c2;
            c1 = strings[0];
            c2 = strings[1];
            vfinal = vfinal.replace(c1, c2);
            
                      
            //trocas++;
        }
        return vfinal;
    }
}
