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

@Service
public class JuridicaRepository {
	public int cadastrar(JuridicaDTO juridicaDTO) throws SQLException {

		ConexaoConfig cnx = new ConexaoConfig();	
		Connection cnctn = cnx.conectar();
		cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		

		
		String query = "insert into juridica" + "		("
				+ "			(razaosocial, nomefantasia, cnpj)"
				+ "	value(?,?,?)" + ";";
		
		PreparedStatement stmt = cnctn.prepareStatement(query);
		stmt.setString(1, juridicaDTO.getRazaosocial());
		stmt.setString(2, juridicaDTO.getNomefantasia());
		stmt.setString(3, juridicaDTO.getCnpj());
		
		stmt.close();

		return stmt.executeUpdate(query);
	}
}
