package br.com.gvrer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.gvrer.usuario.controller",		
		"br.com.gvrer.home.controller"
})
public class GvrerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GvrerApplication.class, args);
		System.out.println("\nGVRER INICIADO COM SUCESSO!!!!!");
	}

}
