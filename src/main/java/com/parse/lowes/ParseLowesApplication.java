package com.parse.lowes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParseLowesApplication {

	static String fileURL = "http://www.lowes.com/pd/GE-5-Burners-5-cu-ft-Freestanding-Gas-Range-Stainless-Steel-Common-30-in-Actual-30-in/1000014276";
	public static void main(String[] args) throws IOException {
		System.out.println("Starts ..");
/*		String hostName = InetAddress.getLocalHost().getHostName();
		InetAddress addrs[] = InetAddress.getAllByName(hostName);
		for (InetAddress inetAddress : addrs) {
			System.out.println(inetAddress.getHostAddress());
			System.out.println(hostName);
		}
		URL whatismyip = new URL("http://checkip.amazonaws.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(
		                whatismyip.openStream()));

		String ip = in.readLine(); //you get the IP as a String
		System.out.println(ip);
		Connection conn = Jsoup.connect(fileURL)
				.userAgent("Mozilla")
				.ignoreHttpErrors(true)
				.followRedirects(true)
				.referrer("http://www.google.com/");
		Response res = conn.execute();
		String body = res.contentType();
		Document doc = conn.get();
		String html = doc.html();
		System.out.println(html);
		System.out.println("End");*/
		SpringApplication.run(ParseLowesApplication.class, args);

	}

}
