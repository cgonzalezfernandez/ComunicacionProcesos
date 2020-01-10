package examenprocesost2;

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
public class HijoPasaMayusculas {
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	
	    	Scanner entrada = new Scanner(System.in);
	    	
	    	Process hijo = new ProcessBuilder("PasoMayusculas.exe").start();
	    	//int retorno = hijo.waitFor();
	    	InputStream ip = hijo.getInputStream();
	    	InputStreamReader ipr = new InputStreamReader(ip);
	    	BufferedReader br = new BufferedReader(ipr);
	    	PrintStream ps = new PrintStream(hijo.getOutputStream());
	    	try {	
	    	System.out.println("Introduce la cadena que quieres cambiar");
	        String stuff;
	        stuff = entrada.nextLine();
	        ps.println(stuff);
	        ps.flush(); //Obliga a pintar la salida
	        String line1;
	        while((line1 = br.readLine()) != null ) {
	        	System.out.println(line1);}
	        	hijo.destroy();
    	} catch (IOException e) {
    		
    		System.out.println("Error ocurrió ejecutanto el comando....." + e.getMessage());
    		
    	}
    }
    	
    	
        
 }   
