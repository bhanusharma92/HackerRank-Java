import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class Saroj {

	public static void main(String[] argv) throws Exception {

		try {

			String deptinspectionId = "867867867";
			String name = "vineet";
			String district = "test";
			String address = "india6786";
			String inspection_schedule_date = "10-11-2017";
			String inspection_dept = "1877106";
			String inspection_classification = "2";
			String promoter_name = "test";
			String promoter_email = "abc@gmail.com";
			String promoter_mobile = "1111111111";
			String inspector_name = "Vineet";
			String inspector_email = "abc@gmail.com";
			String inspector_contact_no = "1111111111";
			String Inspectiontype = "type";
			String expiry_date = "10-11-2017";
			String category = "green";
			String issue_date = "10-11-2017";
			String expirydate = "10-11-2017";

			String urlInString = "http://36.255.3.199/SANDBOX/SingleWindow/InspectionSchedules/add";

			byte[] out = ("{
  				"deptinspectionId":"1877106",
  				"name":"vineet",
  				"district":"test",
  				"address":"india",
			  "inspection_schedule_date":"13-11-2017",
			  "inspection_dept":"1877106",
			  "inspection_classification":"2",
			  "promoter_name":"test",
			  "promoter_email":"abc@gmail.com",
			  "promoter_mobile":"9891821981",
			  "inspector_name":"Vineet",
			  "inspector_email":"abc@gmail.com",
			  "inspector_contact_no":"1236547890",
			  "Inspectiontype":"type",
			  "expiry_date":"13-11-2017",
			  "category":"green",
			  "issue_date":"13-11-2017",
	  			"expirydate":"13-11-2017"
  
				}");
			byte[] out = ("{" +
                           "\"actionTaken\":\"" + actionTaken +"\"," +
                           "\"commentByUserLogin\":\""+ commentByUserLogin +"\"," +
                           "\"commentDate\":\"" + commentDate + "\"," +
                           "\"comments\":\"" + comments + "\"," +
                           "\"id\":\"" + id + "\"," +
                           "\"projectid\":\"" + projectid + "\"," +
                           "\"actionTaken\":\"" + actionTaken +"\"," +
                           "\"commentByUserLogin\":\""+ commentByUserLogin +"\"," +
                           "\"commentDate\":\"" + commentDate + "\"," +
                           "\"comments\":\"" + comments + "\"," +
                           "\"id\":\"" + id + "\"," +
                           "\"projectid\":\"" + projectid + "\"," +
                           "\"serviceid\":\"" + serviceid + "\"" +
                    "}") .getBytes("UTF8");

			System.out.println("urlInString....." + urlInString);
			System.out.println("out....." + out);

			int length = out.length;
			Saroj saroj = new Saroj();
			String jsonString = saroj.callURL(urlInString, out, length);
			System.out.println("Response CodeFrom SDP--: " + jsonString);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String callURL(String myURL, byte[] out, int length) {
		System.out.println("Requeted URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			HttpURLConnection http = (HttpURLConnection) urlConn;
			http.setFixedLengthStreamingMode(length);
			http.setRequestMethod("POST"); // PUT is another valid option
			http.setDoOutput(true);
			http.setDoInput(true);
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null) {
				http.setFixedLengthStreamingMode(length);
				http.setRequestProperty("Content-Type",
						"application/json; charset=UTF-8");
				http.connect();
				OutputStream os = http.getOutputStream();
				os.write(out);
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
			in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:" + myURL,
					e);
		}

		return sb.toString();
	}
}
