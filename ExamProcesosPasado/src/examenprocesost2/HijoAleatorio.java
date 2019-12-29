package examenprocesost2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class HijoAleatorio {
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	
	    	Scanner entrada = new Scanner(System.in);
	    	
	    	Process hijo = new ProcessBuilder("Num_Aleatorio.exe").start();
	    	//int retorno = hijo.waitFor();
	    	InputStream ip = hijo.getInputStream();
	    	InputStreamReader ipr = new InputStreamReader(ip);
	    	BufferedReader br = new BufferedReader(ipr);
	    	PrintStream ps = new PrintStream(hijo.getOutputStream());
	    	try {	
	    	System.out.println("Introduce una letra para continuar, 'fin' para acabar \n");
	        String stuff;
	        stuff = entrada.nextLine();
	        
	        //Compromabos si el usuario ha introducido la cadena fin.
	        if(!(stuff.equalsIgnoreCase("fin"))) {
	        String line1;
	        System.out.println("introduce el valor superior del intervalo");
	        Scanner numero_temporal=new Scanner(System.in);
	        int numero = numero_temporal.nextInt();
	        ps.println(numero);
	        ps.flush(); //Obliga a pintar la salida
	        while((line1 = br.readLine()) != null ) {
	        	
	        	System.out.println(line1);
	        	}
	        	hijo.destroy();
	        }else {
	        	
	        	System.out.println("Se acabó el proceso");
	        }
    	} catch (IOException e) {
    		
    		System.out.println("Error ocurrió ejecutanto el comando....." + e.getMessage());
    		System.exit(-1);
    		
    	}
    }
    	
    	
        
 }   
