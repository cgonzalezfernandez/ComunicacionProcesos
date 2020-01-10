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
public class ExamenProcesosT2 {
    /**
     * @param args the command line arguments
     */
    public static void honesto() throws IOException{
    Scanner entrada = new Scanner(System.in); 
        Process pro= new ProcessBuilder("Honesto.exe").start();
                InputStream is = pro.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		PrintStream ps = new PrintStream(pro.getOutputStream());
                System.out.println("¿Que numero desea comprobar, mi buen señor?");
                String stuff;
                stuff = entrada.nextLine();
                ps.println(stuff);
                ps.flush();
                String line1;
                while((line1 = br.readLine()) != null ) {System.out.println(line1);}
                pro.destroy();
    }
    public static void notanhonesto() throws IOException{
    Scanner entrada = new Scanner(System.in); 
        Process pro= new ProcessBuilder("NoTanHonesto.exe").start();
                InputStream is = pro.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		PrintStream ps = new PrintStream(pro.getOutputStream());           
                System.out.println("¿Que numero desea comprobar, mi buen señor?");
                String stuff;
                stuff = entrada.nextLine();
                ps.println(stuff);
                ps.flush();
                String line1;
                while((line1 = br.readLine()) != null ) {System.out.println(line1);}
                pro.destroy();
    }  
    public static void main(String[] args) throws IOException { 
        String whatever;
        Scanner entrada = new Scanner(System.in); 
        do{
           System.out.println("Te encuentras ante dos guardianes, uno dice siempre la verdad y otro siempre miente...");
           System.out.println("¿Preguntas al de la -izquierda-, al de la -derecha- o le pones -fin- a este calvario?");            
            whatever = entrada.nextLine();
            if(whatever.equals("izquierda")){honesto(); }
            else if(whatever.equals("derecha")){notanhonesto();}
            else if (whatever.equals("derecha")){System.out.println("¿Ya te rindes?");}
            else{System.out.println("No es una opcion correcta");}   
        }while(!whatever.equals("fin"));   
    }   
}

//HOla buenas lo he solucionao to 
