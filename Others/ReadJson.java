import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class ReadJson {

    public static void main(String[] argv) throws Exception {

        try {

            String url = "http://emis.wbpcb.gov.in/emis/industrydata";
            String json_response = "";
            URL obj = new URL(url);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            //Setting the Request Method header as POST
            con.setRequestMethod("POST");

            InputStreamReader in = new InputStreamReader(con.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String text = "";
            while ((text = br.readLine()) != null) {
                json_response += text;
                //System.out.println(json_response);
            }
            System.out.println(json_response);

    } catch (Exception e) {
        e.printStackTrace();
    }

}


}
