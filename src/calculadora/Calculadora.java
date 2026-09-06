
package calculadora;

import java.awt.EventQueue;


public class Calculadora {


    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                try{
                    Interfaz interfaz = new Interfaz();
                    interfaz.setVisible(true);
                    interfaz.setLocationRelativeTo(null);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
                
        );
        
    }
    
    
    
}
