package datadrivenprograms;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

public class json {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader filepath	= new FileReader(".\\src\\test\\resources\\jsonread.json");
		JSONParser jsonp = new JSONParser();
		Object obj = jsonp.parse(filepath);
		
		//READ data from json file
		JSONObject map = (JSONObject) obj;
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		
	}

}
