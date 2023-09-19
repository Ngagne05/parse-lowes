package com.parse.lowes.controller;

import org.jsoup.Connection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
@RestController
public class ParseController {
	
	static String fileURL = "https://www.lowes.com/pd/groupDetail/1000014276/1875/Guest?groupIds=GR_6569,GR_6572,GR_9886,GR_9896";

	@GetMapping("/index")
	public String Home() throws IOException {
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
		System.out.println("End");
		return html;
	}
}
