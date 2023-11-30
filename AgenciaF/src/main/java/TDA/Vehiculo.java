package TDA;
public class Vehiculo
{
    private int serie;
    private String marca,modelo,stock;

    public Vehiculo() 
    {
        
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getSerie() {
        return serie;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getStock() {
        return stock;
    }
    
    
    
    
    
}
