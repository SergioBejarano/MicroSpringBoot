package co.edu.escuelaing.microspringboot.examples;

import co.edu.escuelaing.microspringboot.annotations.GetMapping;
import co.edu.escuelaing.microspringboot.annotations.RequestParam;
import co.edu.escuelaing.microspringboot.annotations.RestController;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author sergio.bejarano-r
 */
@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";

	@GetMapping("/greeting")
	public static String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello " + name;
	}
}
