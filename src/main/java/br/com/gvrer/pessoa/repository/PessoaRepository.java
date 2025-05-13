package br.com.gvrer.pessoa.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.pessoa.service.PessoaDTO;

@Service
public class PessoaRepository {
	public int criar(PessoaDTO pessoaDTO) throws SQLException {

		ConexaoConfig cnx = new ConexaoConfig();	
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		

		
		String query = "insert into pessoa" + "		("
				+ "			nomeitem, ingredientes, descricao, valor, imagemitem, origemitemrestaurante_origemrestauranteid, especialidadedoitem_nomeespecialidadedoitem)\r\n"
				+ "	value" + "     ('" + pessoaDTO.getDatanascimento() + "')";

		return stmt.executeUpdate(query);

	}
}
