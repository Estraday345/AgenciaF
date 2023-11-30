package Interfaz;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Auxiliar {

    public void contra(String con, JTextField contr) {
        if (con.equals(contr.getText())) {
            Menú M  = new Menú();
            M.setVisible(true);
        } else 
        {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
        }

    }
}