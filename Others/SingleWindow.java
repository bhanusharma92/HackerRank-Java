import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class SingleWindow {

    void sendApplicationStatus(String actionTaken, String commentByUserLogin, String commentDate,
                               String comments, String id, String projectid, String serviceid){

        try{

            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);


            URL url = new URL("https://staging.investharyana.in/api/project-service-logs-updated");
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST"); // PUT is another valid option
            http.setDoOutput(true);
            http.setDoInput(true);
            byte[] out = ("{" +
                    "\"actionTaken\":\"" + actionTaken +"\"," +
                    "\"commentByUserLogin\":\""+ commentByUserLogin +"\"," +
                    "\"commentDate\":\"" + commentDate + "\"," +
                    "\"comments\":\"" + comments + "\"," +
                    "\"id\":\"" + id + "\"," +
                    "\"projectid\":\"" + projectid + "\"," +
                    "\"serviceid\":\"" + serviceid + "\"" +
                    "}").getBytes("UTF8");
            int length = out.length;

            http.setFixedLengthStreamingMode(length);
            http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            http.connect();
            OutputStream os = http.getOutputStream();
            os.write(out);
            System.out.println("response code: ");
            System.out.println(http.getResponseCode());
            System.out.println();
            System.out.println("response message:");
            System.out.println(http.getResponseMessage());
            System.out.println();

        }catch (Exception e){
            System.out.println("e: " + e);
        }

    }

    public static void main(String[] args) {
        SingleWindow singleWindow = new SingleWindow();
        singleWindow.sendApplicationStatus("test2ByNic",
                "test2ByNic",
                "2017-08-29T09:43:42.335Z",
                "test2ByNic",
                "",
                "d7c94375-6f51-4edb-b82c-53b6754ed3ab",
                "6bd18359-09f4-4c71-85d9-e4f313ccfb8d");
    }


}
