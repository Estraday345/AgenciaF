
package Interfaz;

public class Contraseña {
     private String con;
    Contraseña()
    {
        
    }
    Contraseña(String con)
    {
        this.con="";
    }
    
    public String getCon(){
        return con;
    }
    
    public void setCon(String con){
        this.con = con;
    }
}
