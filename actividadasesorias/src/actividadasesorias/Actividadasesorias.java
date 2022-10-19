
package actividadasesorias;
import javax.swing.JOptionPane;
public class Actividadasesorias {
    public static void main(String[] args) {
        
        double  p2=0,prom=0;
         int cont1=0;
          int cont2=0;
           int cont3=0;
        String validar,nombre ;
        String letravalidar;
        boolean respuesta,respuesta2;
        
        int i=1;
        
        
        //la cuerpa 68 mi patrona , con ella nada me faltara
       while( i<=10 ) {
            
            
            do {
                validar = JOptionPane.showInputDialog(null, "deme los numeros ");
                respuesta = Validar(validar);

            } while (respuesta == true);
              int n = Integer.parseInt(validar);
              
              
              if(n<0){
                 
                  cont1 ++;
              }
              else if(n>0){
                 
                  cont2 ++;
              }
              else if (n==0){
                 
                  cont3 ++;
              }
              
              
               
              
              
              
               i++;
        
        }
              JOptionPane.showMessageDialog(null, "los numeros negativos son  " + cont1);
               JOptionPane.showMessageDialog(null, "los numeros positivos son  " + cont2);
                JOptionPane.showMessageDialog(null, "los numeros neutros son  " + cont3);
              
    
    }
    public static boolean Validar(String valor) {
        boolean respuesta;
        if (valor.matches("[0-9]*") || valor.matches("-[0-9]*") ) {
            respuesta = false;
        } else {
            JOptionPane.showMessageDialog(null, "ingrese un numero valido");
            respuesta = true;
        }
        return respuesta;
        
        
        
        
    }
    
}
