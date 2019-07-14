package br.com.assecrn.autorizacaoapi

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
class GreetingController {
	
	@RequestMapping("/greeting")
	fun greeting(@RequestParam(value="name") name: String): Greeting {
		return Greeting(1L, "Hello $name");
	}
	
}

data class Greeting(val id: Long, val conten: String);