package br.com.gvrer.endereco.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.endereco.model.Endereco;


@Service
public class EnderecoRepository {
	public int criar(Endereco endereco) {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		// ResultSet.CONCUR_READ_ONLY);
		endereco.getEndereco();

		try {

			String query = "insert into Endereco"
					+ "			(rua, Complemento, numeor,)"
					+ "		value(?, ?, ?, ?, ?, ?, ?)" + ";";
			PreparedStatement stmt = cnctn.prepareStatement(query);
			stmt.setString(1, endereco.getRua());
			stmt.setString(2, endereco.getComplemento());
			stmt.setString(4, endereco.getNumero());
		

			int linhasAfetadas = stmt.executeUpdate();
			System.out.println(linhasAfetadas + " linhas modificadas.");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}

			stmt.close(); //  use try-with-resources (recomendado). Fechando o recurso (importante!)
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			// return stmt.executeUpdate(query);
			return 0;
		}

	}
}
