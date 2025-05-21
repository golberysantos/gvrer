package br.com.gvrer.tiposegmento.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.tiposegmento.model.TipoSegmento;

@Service
public class TipoSegmentoRepository {

    public int criar(TipoSegmento tiposegmento) {
        ConexaoConfig cnx = new ConexaoConfig();
        Connection cnctn = cnx.conectar();

        System.out.println("VALOR: " + tiposegmento.getCulinaria());

        String query = "INSERT INTO tiposegmento (culinaria) VALUES (?)";

        try (PreparedStatement stmt = cnctn.prepareStatement(query)) {
            stmt.setString(1, tiposegmento.getCulinaria());

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println(linhasAfetadas + " linhas modificadas.");

            return linhasAfetadas;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            try {
                if (cnctn != null && !cnctn.isClosed()) {
                    cnctn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


	
}
