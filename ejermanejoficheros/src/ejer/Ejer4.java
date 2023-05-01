package ejer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
    		FileWriter script = new FileWriter("//Users//angeldecarasalas//1//creategat.sh");
    		BufferedWriter bs=new BufferedWriter(script);
    		bs.write("git checkout -b angel\n");
    		bs.write("git add creategit.sh\n");
    		bs.write("git commit -m 'subido fichero'\n");
    		bs.write("git push origin angel\n");
    		System.out.println("script creado\n");
    		bs.close();
    		
    		}catch (IOException e) {
    			System.out.println("No se ha podido crear el script " + e.getMessage());
    		}
	}

}
