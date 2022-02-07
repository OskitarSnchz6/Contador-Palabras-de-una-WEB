package url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class buscardorPalabra{
	public static void main(String[] args){
		String palabra;
		int i = 0;
		try	{
			
			URL url = new URL ("https://es.wikipedia.org/wiki/World_Wide_Web");
			
			BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( url.openStream()));
						
			while ((palabra = bufferedReader.readLine()) != null)	{
				if(palabra.contains("Berners-Lee"));
					i++;
				}
				System.out.println("La palabra aparece " + i + " veces.");
				
			
			bufferedReader.close();
			
			
		} catch (MalformedURLException me)	{
			me.printStackTrace();
			
		} catch (IOException ie)	{
			ie.printStackTrace();
		}
	}
}