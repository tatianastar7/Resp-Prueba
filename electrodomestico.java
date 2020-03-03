package PruebaElectrodomestico;

public class electrodomestico {
    
	// Declaración de los atributos de la superclase electrodomestico	
	
	protected String Color;
	protected char consumoEnergetico;
	protected double precioBase;
	protected double Peso;	
	
	// Definición de constantes por defecto:
	
	protected final static String ColorDefecto="Blanco"; 
	
	protected final static char consumoEnergeticoDefecto='F';
	
	protected final static double precioBaseDefecto=100;
	
	protected final static double PesoDefecto=5;


    //Constructor por defecto:
    
    public electrodomestico () {
    	this(precioBaseDefecto, PesoDefecto, consumoEnergeticoDefecto, ColorDefecto); 
    }
    
    //Constructor con el precio y peso. El resto por defecto:
    
    public electrodomestico (double precioBase, double Peso) {
    	this(precioBase, Peso, consumoEnergeticoDefecto, ColorDefecto);
    }
    	
    //Constructor con todos los atributos
    public electrodomestico (String Color, char consumoEnergetico, double precioBase, double Peso){
    	this.precioBase=precioBase;
    	this.Peso=Peso;
    	this.Color=Color;
    	this.consumoEnergetico=consumoEnergetico;
    }
    
    //Metodo get de todos los atributos
    
    //Retorna el precioBase del electrodomestico
    public double getprecioBase() {
    	return precioBase;
    }
    //Retorna el Peso del electrodomestico
    public double getPeso() {
    	return Peso;
    }
    //Retorna el Color del electrodomestico
    public String getColor() {
    	return Color;
    }
    //Retorna el consumoEnergetico del electrodomestico
    public char consumoEnergetico() {
    	return consumoEnergetico;
    }
    
    //Método comprobar consumoEnergetico 
    
    public void comprobarconsumoEnergetico (char consumoEnergetico) {
    	if (consumoEnergetico>=65 && consumoEnergetico <=70) {
    		this.consumoEnergetico=consumoEnergetico;
    	} else {
    			this.consumoEnergetico=consumoEnergeticoDefecto;
    		}
 	   	}
   
        
    //Método comprobar Color
    public void comprobarColor (String Color) {
    	String colores[]= {"blanco","negro","rojo","azul","gris"};
    	boolean encontrado=false;
    
    	for(int i=0; i<colores.length && !encontrado;i++) {
    		if (colores[i].equals(Color)){
    			encontrado=true;
    		}
    	}
    	if (encontrado) {
    		this.Color=Color;
    	}else {
    		this.Color=ColorDefecto;
    	}
    }  
   
    //Método precio final
    public double PrecioFinal(){
    	double plus=0;
    	switch{consumoEnergetico){
    		case 'A':
    			plus+=100;
    			break;
    		case 'B':
    			plus+=80;
    			break;
    		case 'C':
    			plus+=60;
    			break;
    		case 'D':
    			plus+=50;
    			break;
    		case 'E':
    			plus+=30;
    			break;
    		case 'F':
    			plus+=10;
    			break;
    	}
        	
     if(Peso>=0 && Peso<=19) { 
    	 plus+=10;
    	 }else if(Peso>=20 && Peso<=49){
    		 plus+=50;
    	 }else if(Peso>=50 && Peso<=79){
    		 plus+=80; 
    	 }else if(Peso>=80) {
    		 plus+=100;
    	 }
    	
    	return precioBase+plus;
      	  	
        
}


	
	

