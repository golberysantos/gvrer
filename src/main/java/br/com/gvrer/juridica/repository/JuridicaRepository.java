package br.com.gvrer.juridica.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.juridica.service.JuridicaDTO;
import br.com.gvrer.pessoa.model.Pessoa;
import br.com.gvrer.pessoa.repository.PessoaRepository;

@Service
public class JuridicaRepository {
	
	public int cadastrar(JuridicaDTO juridicaDTO) throws Exception {
	    ConexaoConfig cnx = new ConexaoConfig();    
	    Connection cnctn = cnx.conectar();

	    try {
	        // 1. Inicia transação
	        cnctn.setAutoCommit(false);

	        // 2. Inserir pessoa
	        Pessoa pessoa = new Pessoa();
	        var pr = new PessoaRepository();
	        pessoa = pr.criar(pessoa);
	        
	        /*
	        String insertPessoa = "INSERT INTO pessoa (datanascimento) VALUES (?)";
	        PreparedStatement stmtPessoa = cnctn.prepareStatement(insertPessoa, Statement.RETURN_GENERATED_KEYS);
	        stmtPessoa.setString(1, juridicaDTO.getDatanascimento());
	        stmtPessoa.executeUpdate();

	        ResultSet rsPessoa = stmtPessoa.getGeneratedKeys();
	        long idPessoa = 0;
	        if (rsPessoa.next()) {
	            idPessoa = rsPessoa.getLong(1);
	        } else {
	            throw new SQLException("Falha ao obter o ID da pessoa inserida.");
	        }
*/
	        // 3. Inserir juridica com o ID da pessoa
	        String insertJuridica = "INSERT INTO juridica (razaosocial, nomefantasia, cnpj, pessoa_pessoaid) VALUES (?, ?, ?, ?)";
	        PreparedStatement stmtJuridica = cnctn.prepareStatement(insertJuridica);
	        stmtJuridica.setString(1, juridicaDTO.getRazaosocial());
	        stmtJuridica.setString(2, juridicaDTO.getNomefantasia());
	        stmtJuridica.setString(3, juridicaDTO.getCnpj());
	        stmtJuridica.setLong(4, pessoa.getPessoaid());
	        stmtJuridica.executeUpdate();

	        // 4. Se tudo deu certo, confirma a transação
	        cnctn.commit();
	        return 1;

	    } catch (Exception e) {
	        // 5. Se deu erro, desfaz a transação
	        if (cnctn != null) {
	            cnctn.rollback();
	        }
	        throw e;
	    } finally {
	        // 6. Fecha conexão
	        if (cnctn != null && !cnctn.isClosed()) {
	            cnctn.setAutoCommit(true); // volta ao comportamento padrão
	            cnctn.close();
	        }
	    }
	}
	
	//public int cadastrar(Juridica juridica) throws SQLException {

		//ConexaoConfig cnx = new ConexaoConfig();	
		//Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		

		
		//String query = "insert into juridica" + "		("
		//		+ "			(razaosocial, nomefantasia, cnpj)"
		//		+ "	value(?,?,?)" + ";";
		
		//PreparedStatement stmt = cnctn.prepareStatement(query);
		//stmt.setString(1, juridica.getRazaosocial());
		//stmt.setString(2, juridica.getNomefantasia());
		//stmt.setString(3, juridica.getCnpj());
		
		//stmt.close();

		//return stmt.executeUpdate(query);
	//}
}
