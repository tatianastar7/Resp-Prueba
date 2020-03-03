package PruebaElectrodomestico;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array electrodomestico de 10 posiciones
		
		electrodomestico lista_electrodomestico []=new electrodomestico[10];
		
		lista_electrodomestico[0]=new electrodomestico(150, 50, 'D', "Azul");
		lista_electrodomestico[1]=new television(200, 60,'A', "Negro",42, false);
		lista_electrodomestico[2]=new electrodomestico(300, 70, 'B', "Rojo");
		lista_electrodomestico[3]=new lavadora(260, 60, 'A', "Blanco", 15);
		lista_electrodomestico[4]=new electrodomestico(150, 40, 'C', "Amarillo");
		lista_electrodomestico[5]=new television(200, 60, 'C', "Negro", 22, false);
		lista_electrodomestico[6]=new electrodomestico(200, 45, 'B', "Blanco");
		lista_electrodomestico[7]=new lavadora(300, 70,'B', "Rojo", 6);
		lista_electrodomestico[8]=new television(180, 70, 'F',"Rojo", 32, true);
		lista_electrodomestico[9]=new electrodomestico(180,35, 'A', "Negro");

		double sumaelectrodomestico=0;
		double sumalavadora=0;
		double sumatelevisor=0;
		   
		        //Recorremos el array invocando el metodo precioFinal
		for(int i=0;i<lista_electrodomestico.length;i++){
		     	      
		     if(lista_electrodomestico[i] instanceof electrodomestico){
		                sumaelectrodomestico+=lista_electrodomestico[i].precioFinal();
		     }
		     if(lista_electrodomestico[i] instanceof lavadora){
		                sumalavadoras+=lista_electrodomestico[i].precioFinal();
		      }
		     if(lista_electrodomestico[i] instanceof television){
		                sumalelevisiones+=lista_electrodomestico[i].precioFinal();
		            }
		        }
		   
		        //Mostramos los resultados
		        System.out.println("La suma del precio de los electrodomesticos es de "+sumaelectrodomestico);
		        System.out.println("La suma del precio de las lavadoras es de "+sumalavadora);
		        System.out.println("La suma del precio de las televisiones es de "+sumalelevisiones);
		   
		    }
		   
		}
	}

}
