
package introducirdato;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Introducir {
    //metodo para introducir numero por teclado
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
    


