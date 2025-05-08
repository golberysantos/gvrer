package br.com.gvrer.itemrestaurante.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.itemrestaurante.model.Itemrestaurante;

@Service
public class ItemrestauranteRepository {
	public int criar(Itemrestaurante itemrestaurante) throws SQLException {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		itemrestaurante.getNomeitem();
		
		System.out.println("VALOR: "+itemrestaurante.getValor());
		System.out.println("origemid: "+itemrestaurante.getOrigemitemrestaurante_origemrestauranteid());
		
		String query = "insert into itemrestaurante"
				+ "		("
				+ "			nomeitem, ingredientes, descricao, valor, imagemitem, origemitemrestaurante_origemrestauranteid, especialidadedoitem_nomeespecialidadedoitem)\r\n"
				+ "	value"
				+ "     ('"+itemrestaurante.getNomeitem()+"', '"+itemrestaurante.getIngredientes()+"', '"+itemrestaurante.getDescricao()+"', "+itemrestaurante.getValor()+", '"+itemrestaurante.getImagemitem()+"',"+itemrestaurante.getOrigemitemrestaurante_origemrestauranteid() +" ,"+itemrestaurante.getEspecialidadedoitem_nomeespecialidadedoitem()+")"
				; 
				 
				
		return stmt.executeUpdate(query);

	}
}
