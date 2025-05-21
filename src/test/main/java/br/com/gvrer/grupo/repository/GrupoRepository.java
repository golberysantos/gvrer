package br.com.gvrer.grupo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.grupo.model.Grupo;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Service
public class GrupoRepository {
	public int criar(Grupo grupo) {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		// ResultSet.CONCUR_READ_ONLY);
		
		

		LocalDate localDate = LocalDate.of(2025, 5, 10);
		LocalDateTime localDateTime = localDate.atStartOfDay();
		Timestamp timestamp = Timestamp.valueOf(localDateTime);
		
		try {

			String query = "insert into grupo"
					+ "			(nomegrupo, linkgrupo, orcamentototal, datacriacao, dataviagem, descricao, qtdparticipantes)"
					+ "		value(?, ?, ?, ?, ?, ?, ?)" + ";";
			PreparedStatement stmt = cnctn.prepareStatement(query);
			stmt.setString(1, grupo.getNomegrupo());
			stmt.setString(2, "https://viagem/iaygefauy/gvrer.com.br");
			stmt.setDouble(3, grupo.getOrcamanetototal());
			stmt.setTimestamp(4, timestamp);
			stmt.setTimestamp(5, timestamp);
			stmt.setString(6, grupo.getDescricao());
			stmt.setLong(7, 0);

			int linhasAfetadas = stmt.executeUpdate();
			System.out.println(linhasAfetadas + " linhas modificadas.");
			System.out.println("Preco: " + grupo.getOrcamanetototal());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}
			

			stmt.close(); // Ou use try-with-resources (recomendado). Fechando o recurso (importante!)
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			// return stmt.executeUpdate(query);
			return 0;
		}
		
	}
	
}
