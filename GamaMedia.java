package concesionario;

public class GamaMedia extends Auto
{
    //Atributos de Gama Media
    String referencia;
    int año;
    
    //Setters y Getters de la Clase Padre
    @Override
    public String getMarca() 
    {
        return Marca;
    }

    @Override
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String getModelo() {
        return Modelo;
    }

    @Override
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public void setColor(String Color) 
    {
        this.Color = Color;
    }
    
    //Setters y Getters de la clase Gama Media
    public String getReferencia() 
    {
        return referencia;
    }

    public void setReferencia(String referencia) 
    {
        this.referencia = referencia;
    }

    public int getAño() 
    {
        return año;
    }

    public void setAño(int año) 
    {
        this.año = año;
    }
}
