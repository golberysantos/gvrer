package br.com.gvrer.itinerario.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.itinerario.model.Itinerario;

@Service
public class ItinerarioRepository {
	public int criar(Itinerario itinerario) throws SQLException {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		String query = "" + "insert into itinerario"
				+ "	(nomeitinerario, valor, observacoes, seguroviagem, dataida, horaida, horavolta, motivodaviagem_motivodaviagemid)"
				+ "value" + "	('" + itinerario.getNomeitinerario() + "', " + itinerario.getValor()
				+ "  , 'obs', 'seguro', '2025-05-01', '00:00:00', '00:00:00', 1)"

		;

		return stmt.executeUpdate(query);

	}
}
