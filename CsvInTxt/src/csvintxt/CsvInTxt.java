/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvintxt;

/**
 *
 * @author alexandrelerario
 */
public class CsvInTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  System.out.println("CSV file name:");
       // String csvfile = new java.util.Scanner(System.in).nextLine();
      //  new br.CsvReader().print("/Users/alexandrelerario/Desktop/a/CSVmergeTXT/CsvInTxt/src/relac.csv", ";");
        //System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
       //System.out.println(new br.TxtReader().Reader("/Users/alexandrelerario/Desktop/a/CSVmergeTXT/CsvInTxt/src/texTrad.tex"));
        
        String troca = new br.Replacer().Replace("/Users/alexandrelerario/Desktop/a/CSVmergeTXT/CsvInTxt/src/texTrad.tex", "/Users/alexandrelerario/Desktop/a/CSVmergeTXT/CsvInTxt/src/relac.csv", ";");
       // System.out.println(troca);
       new br.TxtReader().Save("/Users/alexandrelerario/Desktop/a/CSVmergeTXT/CsvInTxt/src/pronto.tex", troca);
        
    }
    
}
