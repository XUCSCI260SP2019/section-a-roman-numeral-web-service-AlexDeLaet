package edu.xavier.csci.romanNubmeralWeb;

import edu.xavier.csci.ALexDeLaet.Roman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class RomanWebApp {

	public static void main(String[] args) {
		SpringApplication.run(RomanWebApp.class, args);
	}

	@GetMapping("/decode")

	public MultiDecode MultiDecode(@PathVariable() String a, String b, String c)
	{
		MultiDecode response = new MultiDecode();

		response.setNumber1(Roman.decode(a));
		response.setNumber2(Roman.decode(b));
		response.setNumber3(Roman.decode(c));


		return response;
	}

	@GetMapping("/encode/{id}")
	public MultiEncode MultiEncode(@PathVariable("id") int a, int b, int c)
	{
		MultiEncode response = new MultiEncode();

		response.setNumber1(Roman.encode(a));
		response.setNumber2(Roman.encode(b));
		response.setNumber3(Roman.encode(c));


		return response;
	}

	@GetMapping("/decode/{id}")

	public SingleDecode encode(@PathVariable("id") String L) {
		SingleDecode response = new SingleDecode();

		response.setNumber(Roman.decode(L));

		return response;
	}

	@GetMapping("/encode/{id}")
	public SingleEncode decode(@PathVariable("id") int num) {
		SingleEncode response = new SingleEncode();

		response.setLetter(Roman.encode(num));

		return response;
	}


}
