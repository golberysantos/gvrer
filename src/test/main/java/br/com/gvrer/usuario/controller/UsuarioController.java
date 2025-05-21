package br.com.gvrer.usuario.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gvrer.pessoa.model.Pessoa;
import br.com.gvrer.pessoa.repository.PessoaRepository;
import br.com.gvrer.usuario.model.Usuario;
import br.com.gvrer.usuario.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@GetMapping("/usuario/cadastrar")
	public String usuariocd(Model model) {

		model.addAttribute("usuario", new Usuario());
		return "/usuario/usuario.html";
	}

	@PostMapping("/usuario/criarconta")
	public String criarconta(@ModelAttribute Usuario usuario, Model model) throws SQLException {
		System.out.println("\n");
		System.out.println("Nickname: " + usuario.getNickname());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("\n");

		// cria uma nova pessoa
		Pessoa pessoa = new Pessoa();
//pessoa.setDatanascimento("");
		System.out.println("pessoa datanascimetno: \n" + pessoa.getDatanascimento());
		PessoaRepository pr = new PessoaRepository();
		pessoa = pr.criar(pessoa);

		// cria um novo usuário
		usuario.setPessoa_pessoaid(pessoa.getPessoaid());
		usuario.setStatususuario_statususuarioid(1);
		var ucr = new UsuarioRepository();
		ucr.criar(usuario);

		return "/home/home.html";

	}

	@GetMapping("/usuario/login")
	public String login(Model model) {
		System.out.println("olá >>>>> ");
		model.addAttribute("usuario", new Usuario());
		return "/usuario/login.html";
	}

	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login.html";

	}
	

}
