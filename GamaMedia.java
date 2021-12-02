package Concesionario;

public class GamaMedia extends Auto
{   
    //Atributos de Gama Media
    String referencia;
    int año;
    
    //Constructor
    public GamaMedia(String marca, String modelo, String color, int año, String referencia) 
    {
        super.marca = marca;
        super.modelo = modelo;
        super.color = color;
        this.año = año;
        this.referencia = referencia;
    }
    
    //Setters y Getters de la Clase Padre Auto
    @Override
    public void setColor(String color) 
    {
        super.setColor(color);
    }

    @Override
    public String getColor() 
    {
        return super.getColor();
    }

    @Override
    public void setModelo(String modelo) 
    {
        super.setModelo(modelo);
    }

    @Override
    public String getModelo() 
    {
        return super.getModelo();
    }

    @Override
    public void setMarca(String marca) 
    {
        super.setMarca(marca);
    }

    @Override
    public String getMarca() 
    {
        return super.getMarca();
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
    
    //Imprimir los Atributos del Automovil
    @Override
    public String toString() 
    {
        return "Marca -> " + marca + ", " + "Modelo -> " + modelo + ", " + "Color -> " + color + ", " + "Año -> " + año + ", " + "Referencia -> " + referencia;
    }
}
