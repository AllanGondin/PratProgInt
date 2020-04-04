package ArqDev;

import java.util.Random;

public class PrintTest {

	public static void main(String[] args) {
		
		 //private int impressao;
		
		 OutputFolderPrint print = new OutputFolderPrint();
		 PrintScreen print2 = new PrintScreen();
		 
		   Random gerador = new Random(); 
	       int x = gerador.nextInt();
	        
	        switch (x%2){
	        case 0:
	        	//System.out.println("Exporta TXT");
	        	print.write();
	            break;
	            
	        case 1:
	        	 print2.write();
	        	 //System.out.println("teste");
	        	 
	        }
	       
	    }
	
		 
		 
		
		
		

	

}