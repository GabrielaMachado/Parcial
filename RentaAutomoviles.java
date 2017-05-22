
package rentaautomoviles;

import javax.swing.JOptionPane;


public class RentaAutomoviles {

    
    public static void main(String[] args) {
        Cliente cliente;
        Vehiculo vehiculo;
        
        String placa, marca, color, nombre, cedula, telefono, direccion;
        int kmIniciales, kmFinales, kmTotal, valorTotal;
        char continuar;
        
        nombre= JOptionPane.showInputDialog("Porfavor, ingrese su nombre");
        
        cedula= JOptionPane.showInputDialog("Porfavor, ingrese su cedula");
        
        telefono= JOptionPane.showInputDialog("Porfavor, ingrese su telefono");
        
        direccion= JOptionPane.showInputDialog("Porfavor, ingrese su direccion");
        cliente = new Cliente (nombre, cedula, telefono, direccion); 
        
        do{
        placa= JOptionPane.showInputDialog("Porfavor, ingrese la placa");
        marca= JOptionPane.showInputDialog("Porfavor, ingrese la marca");
        color= JOptionPane.showInputDialog("Porfavor, ingrese el color");
        kmIniciales=Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese los kilometros iniciales"));
        kmFinales=Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese los kilometros finales"));
        
        
        continuar= JOptionPane.showInputDialog("¿Desea registrar otro vehiculo? /n(Si 1 /n No 2)").charAt(0);
       }while(continuar== '1');
        
        kmTotal=valorPagar(kmFinales, kmIniciales);
        valorTotal= kmTotal*2000;
        JOptionPane.showMessageDialog(null, "El valor total a pagar es:"+valorTotal);
        
                
                
                
    }

    public static int valorPagar(int kmFinales, int kmIniciales) {
        int kmTotal;
        kmTotal=kmFinales-kmIniciales;
        return kmTotal;
        
        
    }
    
}
