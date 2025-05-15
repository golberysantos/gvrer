package br.com.gvrer.juridica.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.juridica.service.JuridicaDTO;
import br.com.gvrer.juridica.model.Juridica;
import br.com.gvrer.pessoa.model.Pessoa;

@Service
public class JuridicaRepository {
	
	public int cadastrar (Juridica juridica) throws Exception {
		ConexaoConfig cnx = new ConexaoConfig();    
	    Connection cnctn = cnx.conectar();

	    String query = "INSERT INTO juridica (razaosocial, nomefantasia, cnpj, pessoa_pessoaid) VALUES (?, ?, ?, ?)";
	    
	    try (PreparedStatement stmt = cnctn.prepareStatement(query)) {
	        stmt.setString(1, juridica.getRazaosocial());
	        stmt.setString(2, juridica.getNomefantasia());
	        stmt.setString(3, juridica.getCnpj());
	        
	        return stmt.executeUpdate(); // Aqui executa corretamente
	    } finally {
	        if (cnctn != null && !cnctn.isClosed()) {
	            cnctn.close(); // Lembre-se de fechar a conexão depois
	        }
	    }
		
	}
	
	//public int cadastrar(Juridica juridica) throws SQLException {

		//ConexaoConfig cnx = new ConexaoConfig();	
		//Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		

		
		//String query = "insert into juridica" + "		("
		//		+ "			(razaosocial, nomefantasia, cnpj)"
		//		+ "	value(?,?,?)" + ";";
		
		//PreparedStatement stmt = cnctn.prepareStatement(query);
		//stmt.setString(1, juridica.getRazaosocial());
		//stmt.setString(2, juridica.getNomefantasia());
		//stmt.setString(3, juridica.getCnpj());
		
		//stmt.close();

		//return stmt.executeUpdate(query);
	//}
}
