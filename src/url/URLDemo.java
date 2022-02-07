package url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo{
    public static void main(String[] args) {
        try{
            URL url = new URL ("https://es.wikipedia.org/wiki/Tim_Berners-Lee");
            
            System.out.println("Protocol    : " + url.getProtocol());
            System.out.println("File        : " + url.getFile());
            System.out.println("Host        : " + url.getHost());
            System.out.println("Port        : " + url.getPort());
            System.out.println("Path        : " + url.getPath());
            System.out.println("Query       : " + url.getQuery());
            System.out.println("UserInfo    : " + url.getUserInfo());
            System.out.println("Authority   : " + url.getAuthority());
            System.out.println("DefaultPort : " + url.getDefaultPort());
            System.out.println("Reference   : " + url.getRef());
            
        } catch (MalformedURLException me)	{
            me.printStackTrace();
        }
    }
}