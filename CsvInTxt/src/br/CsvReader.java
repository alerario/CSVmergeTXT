/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

/**
 *
 * @author alexandrelerario
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    public java.util.ArrayList<String[]> Reader(String csvFile, String separator) {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = separator;
        java.util.ArrayList lista = new java.util.ArrayList();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] linha = line.split(cvsSplitBy);
                lista.add(linha);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lista;
    }

    public void print(String csvFile, String separator) {
        java.util.ArrayList<String[]> lista = this.Reader(csvFile, separator);
        for (String[] strings : lista) {
            int tam = strings.length;
            System.out.println("");
            System.out.println("======");
            for (int i = 0; i < tam; i++) {
                System.out.print(strings[i] + " | ");
            }
        }
    }
}
