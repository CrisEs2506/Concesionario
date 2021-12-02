package Concesionario;

public class Main 
{
    public static void main(String[] args) 
    {
        //Mensaje de Bienvenida
        System.out.println("Bienvenidos al Concesionario Espitia S.A!!!");
        System.out.println("Tenenos los siguientes automóviles a tú disposición: ");
        System.out.println("");
        
        //Base de Datos
        //Array con Automoviles de Gama Alta
        GamaAlta[] arrayGamaAlta = new GamaAlta[3];
        arrayGamaAlta[0] = new GamaAlta("Lamborghini Huracan Evo", "LHGA2021", "Rojo", 2021, "Bien Fresas");
        arrayGamaAlta[1] = new GamaAlta("McLaren 720S", "MCGA2021", "Fibra Carbono", 2021, "Liviano como una Pluma");
        arrayGamaAlta[2] = new GamaAlta("Mercedes-Benz Clase A", "GA2021", "Rojo", 2021, "Chiquito pero Peligroso");
                
        //Array con Automoviles de Gama Media
        GamaMedia[] arrayGamaMedia = new GamaMedia[3];
        arrayGamaMedia[0] = new GamaMedia("Tesla Model X", "TXGM2019", "Blanco", 2019, "Full Amigable Envinronment");
        arrayGamaMedia[1] = new GamaMedia("Hyunday Elantra", "HEGM2020", "Azul", 2020, "Grandote Locochote");
        arrayGamaMedia[2] = new GamaMedia("Ford Ranger Raptor", "FRGM2008", "Negro", 2015, "I'm Monster");
        
        GamaBaja[] arrayGamaBaja = new GamaBaja[3];
        arrayGamaBaja[0] = new GamaBaja("Volkswagen Escarabajo", "VEGB1998", "Amarillo", 1998, "Pichirilo Me Cubro");
        arrayGamaBaja[1] = new GamaBaja("Chevrolet Joy", "CJGB2008", "Gris", 2008, "Dame solo una gota de Gasolina");
        arrayGamaBaja[2] = new GamaBaja("Mini Cooper", "MCGB2002", "Aguamarina", 2002, "Mini Mini");
        
        //Número Aleatorio
        //Generación de Número Aleatorio entre 0 y 2 para el Array de Gama Alta
        int GA = (int)(Math.random()*3);
        System.out.println("Gama Alta: " + arrayGamaAlta[GA].toString());
        
        //Generación de Número Aleatorio entre 0 y 2 para el Array de Gama Media
        int GM = (int)(Math.random()*3);
        System.out.println("Gama Media: " + arrayGamaMedia[GM].toString());
        
        //Generación de Número Aleatorio entre 0 y 2 para el Array de Gama Baja
        int GB = (int)(Math.random()*3);
        System.out.println("Gama Baja: " + arrayGamaBaja[GB].toString());
        
        //Mensaje de Despedida
        System.out.println("");
        System.out.println("Anímate a comprar cualquiera de estos íncreibles coches!!!");
        System.out.println("Y ponte en contacto con nosotros, a la línea telefónica: +57 3203500184...");
    }
}
