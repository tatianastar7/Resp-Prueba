package PruebaElectrodomestico;

public class lavadora extends electrodomestico{

	// Atributo carga
	private int Carga;
	
	// Carga por defecto 5kg
	private final static int CargaDefecto=5;
		   
	//Constructor por defecto
	public lavadora (){
		this(precioBaseDefecto, ColorDefecto, consumoEnergeticoDefecto, PesoDefecto, CargaDefecto);
			}
	//Constructor con precio y peso y el resto por defecto
	public lavadora(double Precio, double Peso){
		this(Precio, Peso, consumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
	}
	
	//Constructor con carga y resto atributos heredados
	public lavadora(int carga) { // REVISAR
		super(precioBase, Color, consumoEnergetico, Peso);
		this.Carga=Carga;
	}
}


	//M�todos get de carga
		   
		    		    
		   public int getCarga() {
		       return Carga;
		   }
		 
  
		    // Precio final de la lavadora
		    
		    
		   public double PrecioFinal(){
			   
		       //Invocamos el m�todo precioFinal del m�todo padre
		       double plus=super.precioFinal();
		 
		       //a�adimos el c�digo necesario
		       if (Carga>30){
		           plus+=50;
		       }
		 
		       return plus;
		   }
		 
}
