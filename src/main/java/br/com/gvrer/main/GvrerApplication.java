package br.com.gvrer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.gvrer.config",		
		"br.com.gvrer.juridica.controller",
		"br.com.gvrer.usuario.controller",		
		"br.com.gvrer.home.controller",
		"br.com.gvrer.itinerario.controller",
		"br.com.gvrer.grupo.controller",
		"br.com.gvrer.itemrestaurante.controller",
		"br.com.gvrer.tiposegmento.controller",
		"br.com.gvrer.categoriaitem.controller",
		"br.com.gvrer.pessoa.controller",
		"br.com.gvrer.endereco.controller",
		"br.com.gvrer.tipopermissaodogrupo.controller",
		"br.com.gvrer.principal.controller",
		"br.com.gvrer.links.controller"
		
})
public class GvrerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GvrerApplication.class, args);
		System.out.println("\nGVRER INICIADO COM SUCESSO!!!!!");
	}

}
