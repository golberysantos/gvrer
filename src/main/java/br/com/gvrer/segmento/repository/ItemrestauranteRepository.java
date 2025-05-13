package br.com.gvrer.segmento.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.itemrestaurante.model.Itemrestaurante;

@Service
public class ItemrestauranteRepository {
	public int criar(Itemrestaurante itemrestaurante) {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		// ResultSet.CONCUR_READ_ONLY);
		itemrestaurante.getNomeitem();

		System.out.println("VALOR: " + itemrestaurante.getValor());
		System.out.println("origemid: " + itemrestaurante.getOrigemitemrestaurante_origemrestauranteid());
		

		try {

			String query = "insert into itemrestaurante"
					+ "			(nomeitem, ingredientes, descricao, valor, imagemitem, origemitemrestaurante_origemrestauranteid, especialidadedoitem_nomeespecialidadedoitem)"
					+ "		value(?, ?, ?, ?, ?, ?, ?)" + ";";
			PreparedStatement stmt = cnctn.prepareStatement(query);
			stmt.setString(1, itemrestaurante.getNomeitem());
			stmt.setString(2, itemrestaurante.getIngredientes());
			stmt.setString(3, itemrestaurante.getDescricao());
			stmt.setDouble(4, itemrestaurante.getValor());
			stmt.setString(5, itemrestaurante.getImagemitem());
			stmt.setLong(6, itemrestaurante.getOrigemitemrestaurante_origemrestauranteid());
			stmt.setLong(7, itemrestaurante.getEspecialidadedoitem_nomeespecialidadedoitem());

			int linhasAfetadas = stmt.executeUpdate();
			System.out.println(linhasAfetadas + " linhas modificadas.");

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
