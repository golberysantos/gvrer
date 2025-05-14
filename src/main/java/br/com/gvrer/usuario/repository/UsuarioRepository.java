package br.com.gvrer.usuario.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.usuario.model.Usuario;

public class UsuarioRepository {
public int criar(Usuario usuario) throws SQLException {
        
        ConexaoConfig cnx = new ConexaoConfig();
        Connection cnctn = cnx.conectar();
        
        // Criação do Statement para execução da query
        Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        // Imprime os valores de debug para verificar se tudo está correto
        System.out.println("nickname: " + usuario.getNickname());
        System.out.println("senha: " + usuario.getSenha());
        System.out.println("pessoa_pessoaid: " + usuario.getPessoa_pessoaid());
        System.out.println("statususuario_statususuarioid: " + usuario.getStatususuario_statususuarioid());
        
        // SQL para inserção, incluindo todos os campos necessários
        String query = "INSERT INTO usuario " + 
                       "(nickname, senha, pessoa_pessoaid, statususuario_statususuarioid) " +
                       "VALUES ('" + usuario.getNickname() + "', '" + usuario.getSenha() + "', " + 
                       usuario.getPessoa_pessoaid() + ", " + usuario.getStatususuario_statususuarioid() + ")";
        
        // Executa a query e retorna o número de linhas afetadas (sucesso)
        return stmt.executeUpdate(query);
    }
}
