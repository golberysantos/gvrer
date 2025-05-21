package br.com.gvrer.tiposegmento.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.tiposegmento.model.TipoSegmento;
@Service
public class TipoSegmentoRepository {
    public int criar(TipoSegmento tiposegmneto) throws SQLException {
        ConexaoConfig cnx = new ConexaoConfig();
        try (Connection cnctn = cnx.conectar()) {
            String query = "INSERT INTO tiposegmneto (culinaria) VALUES (?)";
            try (PreparedStatement stmt = cnctn.prepareStatement(query)) {
                stmt.setString(1, tiposegmneto.getculinaria());
                int linhasAfetadas = stmt.executeUpdate();
                System.out.println(linhasAfetadas + " linhas modificadas.");
                return 1;
            } catch (SQLException e) {
                e.printStackTrace();
                return 0;
            }
        }
    }
}
