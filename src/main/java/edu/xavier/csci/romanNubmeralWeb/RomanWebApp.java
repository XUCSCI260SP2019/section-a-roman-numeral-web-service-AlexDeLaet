package edu.xavier.csci.romanNubmeralWeb;

import edu.xavier.csci.ALexDeLaet.Translate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@SpringBootApplication
public class RomanWebApp {

	public static void main(String[] args) {
		SpringApplication.run(RomanWebApp.class, args);
	}

	@GetMapping("/decode/{id}")

	public SingleDecode encode(@PathVariable("id") String let) {
		SingleDecode response = new SingleDecode();

		response.setNum(Translate.decode(let));

		return response;
	}

	@GetMapping("/encode/{id}")
	public SingleEncode decode(@PathVariable("id") int num) {
		SingleEncode response = new SingleEncode();

		response.setLet(Translate.encode(num));

		return response;
	}

	@GetMapping("/decode")

	public MultiDecode MultiDecode(@PathVariable() String let1, String let2, String let3)
	{
		MultiDecode response = new MultiDecode();

		response.setNum1(Translate.decode(let1));
		response.setNum2(Translate.decode(let2));
		response.setNum3(Translate.decode(let3));


		return response;
	}

	@GetMapping("/encode/{id}")
	public MultiEncode MultiEncode(@PathVariable("id") int num1, int num2, int num3)
	{
		MultiEncode response = new MultiEncode();

		response.setLet1(Translate.encode(num1));
		response.setLet2(Translate.encode(num2));
		response.setLet3(Translate.encode(num3));


		return response;
	}


}
