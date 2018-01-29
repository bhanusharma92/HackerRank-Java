package comman;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class Dummy2 {

	public static void main(String[] args) {
		try {

			String urlInString = "http://emis.wbpcb.gov.in/emis/industrydata";
			String jsonString = callURL(urlInString);
			//JSONArray jsonArray = new JSONArray(jsonString);
			// count = jsonArray.length();
			/*for (int i = 0; i < count - 1; i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				System.out.println("----" + i + ": " + jsonObject);
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String callURL(String myURL) {
		System.out.println("Requeted URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			HttpURLConnection http = (HttpURLConnection) urlConn;
			http.setRequestMethod("POST");
			if (urlConn != null && urlConn.getInputStream() != null) {
				InputStreamReader in  = new InputStreamReader(urlConn.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:" + myURL,
					e);
		}

		return sb.toString();
	}
}
