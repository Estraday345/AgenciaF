
package Sistema;

import TDA.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Bajas 
{
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   Conexion obConectar=new Conexion();
   
   private ArrayList<Cliente> cliente;

   
   public void darBaja(JTextField idCliente)
   {
        
        String deleteSQL = "DELETE FROM cliente WHERE idCliente=?";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(deleteSQL);
            ps.setInt(1, Integer.parseInt(idCliente.getText()));
            ps.executeUpdate();
         
        } catch (Exception e) 
        {
            e.printStackTrace();
        }

   }
    public void mostrar(DefaultTableModel tablaClientes) {

        cliente= new ArrayList();
        String selectSQL = "SELECT * FROM Cliente";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(selectSQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Cliente obC=new Cliente();
                obC.setIdCliente(rs.getInt(1));
                obC.setNombre(rs.getString(2));
                obC.setDireccion(rs.getString(4));
                obC.setTelefono(rs.getString(3));
                cliente.add(obC);
            }
        } catch (Exception e) 
        {
        }
        
       
        tablaClientes.setRowCount(0);
        Object[] fila = new Object[4];
        
        for (Cliente contador: cliente) 
        {
            
            fila[0]=contador.getIdCliente();
            fila[1]=contador.getNombre();
            fila[2]=contador.getDireccion();
            fila[3]=contador.getTelefono();
            
        } 
        tablaClientes.addRow(fila);
        
    }
    
    

}

