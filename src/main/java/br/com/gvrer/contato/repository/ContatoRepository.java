package br.com.gvrer.contato.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.contato.model.Contato;

public class ContatoRepository {

    public Contato criar(Contato contato) throws Exception {
        ConexaoConfig cnx = new ConexaoConfig();
        Connection cnctn = cnx.conectar();

        try {
            String query = "INSERT INTO contato (contato, pessoa_pessoaid, tipodecontato_tipocontatoid) VALUES (?, ?, ?)";
            PreparedStatement stmt = cnctn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, contato.getContato());
            stmt.setLong(2, contato.getPessoa_pessoaid());
            stmt.setLong(3, contato.getTipodecontato_tipocontatoid());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        contato.setContatoid(rs.getLong(1));
                    }
                }
            }

            return contato;

        } finally {
            cnctn.close();
        }
    }
}