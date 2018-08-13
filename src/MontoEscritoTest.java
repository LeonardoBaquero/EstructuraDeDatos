import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner; 


import org.junit.jupiter.api.Test;


class MontoEscritoTest {

	@Test
	public void testUnidades() {
				int resultado = Monto.suma
				int esperado =  
		
		
		
		 String unidades[] = 
		        {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco" , "seis" ,"siete" ,"ocho" ,"nueve","diez"};
		        String decenas11al19[] = 
		        {"once", "doce","trece","catorce", "quince", "diezciseis", "diecisiete", "dieciocho", "diecinueve"};
		        String decenas[] = 
		        {"veinte", "treinta","cuarenta","cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
		        /*String centenas[] = 
		        {"cien", "doscientos","trescientos","cuatrocientos", 
		        "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};*/
		                             
		        Scanner scanner=new Scanner(System.in);
		        System.out.print("Ingrese un numero entre 0 y 99: "); 
		        int num = scanner.nextInt();
		        
		        if(num>=0 && num<11)
		             System.out.print('\n' + unidades[num]);         
		        else if(num<20)
		            System.out.print('\n' + decenas11al19[num-11]);        
		         else if(num<100){
		            int unid = num % 10;
		            int dec = num/10;
		            if(unid == 0)
		                System.out.print('\n' + decenas[dec-2]);                
		            else
		                System.out.print('\n' + decenas[dec-2]
		                                       + " y " + unidades[unid]);
		        }
		        else            
		            System.out.print("El numero debe ser menor a 100");
		  }    
		
	}

