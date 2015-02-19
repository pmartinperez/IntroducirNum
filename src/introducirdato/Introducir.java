
package introducirdato;

import javax.swing.JOptionPane;


public class Introducir {
    //metodo para introducir numero por teclado
    public int introducirDato(){
        String respuesta = JOptionPane.showInputDialog("Introducir num");
        int numero = Integer.parseInt(respuesta);
        String respuesta2 = JOptionPane.showInputDialog("Introducir num");
        int numero2 = Integer.parseInt(respuesta2);
        
        return numero+numero2;
    }
    
}
