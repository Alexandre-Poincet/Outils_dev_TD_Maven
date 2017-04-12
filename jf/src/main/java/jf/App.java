package jf;

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "max(4,5) = " + max(4,5));
        
        int monMax=0;
        try{
        	CSVReader reader = new CSVReader(new FileReader("data.csv"));
        	try{
        	List<String[]> myEntries = reader.readAll();
        	for(String[] array : myEntries){
        		for(String nb : array){
        			System.out.println("Nombre lu : " + nb);
        			monMax=max(monMax,Integer.parseInt(nb));
        		}
        	}
        	System.out.println("Plus grand nombre lu : " + monMax);
        	}
        	catch(IOException e){
				System.out.println("Erreur à la lecture du fichier");
			}
        }
        catch(FileNotFoundException e)
		{
			System.out.println("Fichier non trouvé");
		}
    }
    public static int max(int a, int b){
    	//return a; // Le stagiaire est passe la
    	return a>b ? a:b;
    }
}
