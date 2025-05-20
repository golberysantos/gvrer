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
		endereco.getNumero();

		try {

			String query = "insert into endereco"
					+ "			(numero, complemento, referencia, pessoa_pessoaid, rua_ruaid)"
					+ "		value(?, ?, ?, ?, ?)" + ";";
			PreparedStatement stmt = cnctn.prepareStatement(query);
			stmt.setString(1, endereco.getNumero());
			stmt.setString(2, endereco.getComplemento());
			stmt.setString(3, endereco.getReferencia());
			stmt.setLong(4, 1);
			stmt.setLong(5, 1);
		

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
			System.out.println("ERRO: "+e);
			return 0;
		}

	}
}

