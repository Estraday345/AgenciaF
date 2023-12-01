package Sistema;

import Interfaz.AltaClientes;
import TDA.Cliente;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Altas {

 
   private ArrayList<Cliente> cliente = new ArrayList();

    public void altaCliente(JTextField idCliente, JTextField nombre, JTextField telefono, JTextField direccion) {
        Cliente obCliente = new Cliente();
        obCliente.setIdCliente(Integer.parseInt(idCliente.getText()));
        obCliente.setNombre(nombre.getText());
        obCliente.setTelefono(telefono.getText());
        obCliente.setDireccion(direccion.getText());
        cliente.add(obCliente);
        
    }
    
     public void mostrarS(DefaultTableModel tablaClientes) 
    {
        
        for (Cliente contador: cliente) 
        {
            Object[] fila = new Object[4];
            fila[0]=contador.getIdCliente();
            fila[1]=contador.getNombre();
            fila[2]=contador.getDireccion();
            fila[3]=contador.getTelefono();
            tablaClientes.addRow(fila);
            
        } 
       
    }

    public void altaVehiculo(JTextField txtSerie, JTextField txtMarca, JTextField txtModelo, JTextField txtStock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostarVehiculo(DefaultTableModel tableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
