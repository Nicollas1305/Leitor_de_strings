package Atividade02;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author carto
 */
public class Questão03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Vector<String> list = new Vector<String>();
            
        String palavra = null;
        
        while(!"fim".equals(palavra)){
            System.out.print("Digite algo: ");
            palavra = e.nextLine();
            list.add(palavra);             
        }
        Collections.sort(list);
        System.out.println(list);
    }  
}