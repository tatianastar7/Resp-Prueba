package PruebaElectrodomestico;

public class television extends electrodomestico{
	
	// atributos
	
	private int Resolucion;
	private boolean sintonizadorTDT;
		
	//Por defecto
	
	private final static int ResolucionDefecto=20;
	private final static boolean sintonizadorTDTDefecto=false;//REVISAR
		
	
	//Constructor por defecto
	
     public television() {
    	 this(precioBaseDefecto, ColorDefecto, consumoEnergeticoDefecto, PesoDefecto, ResolucionDefecto, sintonizadorTDTDefecto);
	}
     
     //Constructor con precio y peso y el resto por defecto
     
     public television(double precioBase, double Peso) {
    	 this(ColorDefecto, consumoEnergeticoDefecto, ResolucionDefecto,sintonizadorTDTDefecto);
     }
     
     //Constructor con resolución y sintonizador TDT el resto de atributos heredados
     
     public television(int Resolucion, boolean sintonizadorTDT, String Color, double Peso, char consumoEnergetico, double PrecioBase){
    	 // super, se usa para heredar
    	 super(precioBase, Color, consumoEnergetico, Peso);
    	 this.Resolucion=Resolucion;
    			 this.sintonizadorTDT=sintonizadorTDT;
     }
     }
	
	// Método get de resolución y sintonizador TDT

     public int getResolucion() {
    	 return Resolucion;
     }

    // Método precio final
     public double PrecioFinal(){
    	 
    	 double plus=super.PrecioFinal();
    	 
    	 if(Resolucion>40) {
    		 plus+=precioBase*0,30;
    	 }
    	 if(sintonizadorTDT) {
    		 plus+=50;
    	 }
    	 return plus;
    	 }
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
