package appcekkursmatauang;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


    public class HTTPRequest {
    public static void main(String args[]){
        String data ;
        try {
            URL url = new URL("https://api.exchangeratesapi.io/latest?base=");
            URLConnection connection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while((data=bufferedReader.readLine())!=null){
               
              System.out.print(data);}
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(HTTPRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HTTPRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

