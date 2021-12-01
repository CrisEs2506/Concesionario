package concesionario;

public class GamaAlta extends Auto
{
    //Atributos de Gama Alta
    String Referencia;
    int año;
    
    //Setters y Getters de la Clase Padre
    @Override
    public String getMarca() 
    {
        return Marca;
    }

    @Override
    public void setMarca(String Marca) 
    {
        this.Marca = Marca;
    }

    @Override
    public String getModelo() 
    {
        return Modelo;
    }

    @Override
    public void setModelo(String Modelo) 
    {
        this.Modelo = Modelo;
    }

    @Override
    public String getColor() 
    {
        return Color;
    }

    @Override
    public void setColor(String Color) 
    {
        this.Color = Color;
    }
    
    //Setters y Getters de la clase Gama Alta
    public String getReferencia() 
    {
        return Referencia;
    }

    public void setReferencia(String Referencia) 
    {
        this.Referencia = Referencia;
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
