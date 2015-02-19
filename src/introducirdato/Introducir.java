
package introducirdato;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Clase con un metodo para introducir numero
 * @author Patricia
 * @version 1.0
 */


public class Introducir {
    /**
     * Metodo para introducir numero
     * @param num si num=0 introduces por teclado, si num=1 por pantalla
     * @return devuelve el numero introducido
     */
    public int introducirDato(int num){
        Scanner dato=new Scanner(System.in);
        int op=0;
               
        switch(num){
            case 0: op=dato.nextInt();
                System.out.println(op);
                break;
            case 1: op=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                JOptionPane.showMessageDialog(null, op);
                break;
            default: op=0;
                break;
                       
        }
        return op;
    }
    }
    


