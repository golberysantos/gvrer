package br.com.gvrer.itinerario.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.itinerario.model.Itinerario;

@Service
public class ItinerarioRepository {
	public int criar(Itinerario itinerario) throws SQLException {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		//Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
		try {

			String query = "" 
					+ "insert into itinerario"
					+ "		(nomeitinerario, valor, observacoes, dataida, horaida, horavolta, motivodaviagem_motivodaviagemid)"				
					+ "value(?, ?, ?, ?, ?, ?, ?)"
			;			
			
			PreparedStatement stmt = cnctn.prepareStatement(query);
			stmt.setString(1, itinerario.getNomeitinerario());
			stmt.setDouble(2, itinerario.getValor());
			stmt.setString(3, itinerario.getObservacoes());
			stmt.setString(4, itinerario.getDataida());
			stmt.setString(5, itinerario.getHoraida());
			stmt.setString(6, itinerario.getHoravolta());
			stmt.setLong(7, itinerario.getMmotivodaviagem_motivodaviagemid());
			

			int linhasAfetadas = stmt.executeUpdate();
			System.out.println(linhasAfetadas + " linhas modificadas.");
/*
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}
*/
			stmt.close(); // Ou use try-with-resources (recomendado). Fechando o recurso (importante!)
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			// return stmt.executeUpdate(query);
			return 0;
		}
		

	}
}
