package br.com.gvrer.usuario.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.usuario.model.Usuario;

public class UsuarioRepository {

    public int criar(Usuario usuario) throws SQLException {
        ConexaoConfig cnx = new ConexaoConfig();
        Connection cnctn = cnx.conectar();

        String query = "INSERT INTO usuario (nickname, senha, pessoa_pessoaid, statususuario_statususuarioid) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = cnctn.prepareStatement(query);
        pstmt.setString(1, usuario.getNickname());
        pstmt.setString(2, usuario.getSenha());
        pstmt.setLong(3, usuario.getPessoa_pessoaid());
        pstmt.setLong(4, usuario.getStatususuario_statususuarioid());

        return pstmt.executeUpdate();
    }

    public Usuario findByNickname(String nickname) throws SQLException {
        ConexaoConfig cnx = new ConexaoConfig();
        Connection cnctn = cnx.conectar();

        String query = "SELECT * FROM usuario WHERE nickname = ?";
        PreparedStatement pstmt = cnctn.prepareStatement(query);
        pstmt.setString(1, nickname);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setUsuarioid(rs.getLong("usuarioid"));
            usuario.setNickname(rs.getString("nickname"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPessoa_pessoaid(rs.getLong("pessoa_pessoaid"));
            usuario.setStatususuario_statususuarioid(rs.getLong("statususuario_statususuarioid"));
            return usuario;
        } else {
            return null;
        }
    }
}
