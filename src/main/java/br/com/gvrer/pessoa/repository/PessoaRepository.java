package br.com.gvrer.pessoa.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.pessoa.model.Pessoa;

@Service
public class PessoaRepository {
	public Pessoa criar(Pessoa pessoa) throws SQLException {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		
		// cnctn.setAutoCommit(false);
		//Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		
		try {
	        String query = "INSERT INTO pessoa (datanascimento) VALUE (?)";
	        
	        // IMPORTANTE: Adicione Statement.RETURN_GENERATED_KEYS aqui
	        PreparedStatement stmt = cnctn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	        stmt.setString(1, pessoa.getDatanascimento());

	        int linhasAfetadas = stmt.executeUpdate();

	        if (linhasAfetadas > 0) {
	            try (ResultSet rs = stmt.getGeneratedKeys()) {
	                if (rs.next()) {
	                    int idGerado = rs.getInt(1);
	                    pessoa.setPessoaid(idGerado); // Supondo que você tenha um setter para o ID
	                    System.out.println("ID gerado: " + idGerado);
	                }
	            }
	        }

	        return pessoa;

	    } finally {
	        cnctn.close();
	    }

	}
}
