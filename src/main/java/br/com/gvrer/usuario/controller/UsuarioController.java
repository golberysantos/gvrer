package br.com.gvrer.usuario.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.gvrer.usuario.model.Usuario;
import br.com.gvrer.usuario.service.UsuarioService;

@Controller
public class UsuarioController {
	@GetMapping("/usuario/cadastrar")
	public String usuariocd(Model model) {
		System.out.println("/usuario/usuario.html ");
		model.addAttribute("usuario", new Usuario());
		return "/usuario/usuario.html";
	}
	@PostMapping("/usuario/criarconta")
	public String criarconta(@ModelAttribute Usuario usuario, Model model ) throws SQLException {
	System.out.println("\n");
	System.out.println("Nickname: "+usuario.getNickname());
	System.out.println("Senha: "+usuario.getSenha());
	System.out.println("\n");
	
	var ucr = new UsuarioService();
	ucr.criar(usuario);
	return "/home/home.html";
	
		
		
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		System.out.println("olá ");
		model.addAttribute("usuario", new Usuario());
		return "/usuario/login.html";
		

		
	}
	@RequestMapping("/login-error.html")
	  public String loginError(Model model) {
	    model.addAttribute("loginError", true);
	    return "login.html";
		    
	    
	}
}
