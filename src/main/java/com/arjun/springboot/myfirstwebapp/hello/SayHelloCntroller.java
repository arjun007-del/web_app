package com.arjun.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloCntroller {
	

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello ! what are you learning today";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title> my First HTML Page</title>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("My first html page with body");
		buffer.append("</body>");
		buffer.append("</html>");
		return buffer.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
