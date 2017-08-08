/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alexandrelerario
 */
public class TxtReader {

    public String Reader(String txtFile) {
        System.out.printf("\nConteúdo do arquivo texto:\n");
        String linha = null;
        String arqtxt = "";
        try {
            FileReader arq = new FileReader(txtFile);
            BufferedReader lerArq = new BufferedReader(arq);
            linha = lerArq.readLine();
            while (linha != null) {
                arqtxt = arqtxt+ "\n" + linha;
                linha = lerArq.readLine();
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        return arqtxt;
    }

    public void Save(String fileName, String text) {
        try {

            File file = new File(fileName);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(text);
            writer.flush();
            writer.close();
            System.out.println("Arquivo gravado em: " + fileName);

        } catch (Exception e) {
            System.out.println("erro de gravacao:" + e.getMessage());
        }
    }
}
