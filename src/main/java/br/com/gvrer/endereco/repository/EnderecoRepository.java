package br.com.gvrer.endereco.repository;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;


import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.endereco.dto.EnderecoDTO;
import br.com.gvrer.endereco.model.Endereco;


@Service
public class EnderecoRepository {
	public int criar(EnderecoDTO enderecodto) {

		ConexaoConfig cnx = new ConexaoConfig();
		Connection cnctn = cnx.conectar();
		// cnctn.setAutoCommit(false);
		// Statement stmt = cnctn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
		// ResultSet.CONCUR_READ_ONLY);

		try {
			
			String queryPais = "insert into pais"
					+ "			(nomepais, siglapais)"
					+ "		value(?, ?)" + ";";
			PreparedStatement stmtPais = cnctn.prepareStatement(queryPais);
			stmtPais.setString(1, enderecodto.getNomepais());
			stmtPais.setString(2, enderecodto.getSiglapais());
			stmtPais.executeUpdate();
			
			String queryEstado = "insert into estado"
					+ "			(nomeestado, uf, pais_paisid)"
					+ "		value(?, ?, ?)" + ";";
			PreparedStatement stmtEstado = cnctn.prepareStatement(queryEstado);
			stmtEstado.setString(1, enderecodto.getNomeestado());
			stmtEstado.setString(2, enderecodto.getUf());
			stmtEstado.setLong(3, 1);
			stmtEstado.executeUpdate();
			
			String queryCidade = "insert into cidade"
					+ "			(nomecidade, estado_estadoid)"
					+ "		value(?, ?)" + ";";
			PreparedStatement stmtCidade = cnctn.prepareStatement(queryCidade);
			stmtCidade.setString(1, enderecodto.getNomecidade());
			stmtCidade.setLong(2, 1);
			stmtCidade.executeUpdate();
			
			String queryBairro = "insert into bairro"
					+ "			(nomebairro, cidade_cidadeid)"
					+ "		value(?, ?)" + ";";
			PreparedStatement stmtBairro = cnctn.prepareStatement(queryBairro);
			stmtBairro.setString(1, enderecodto.getNomebairro());
			stmtBairro.setLong(2, 1);
			stmtBairro.executeUpdate();
			
			String queryRua = "insert into rua"
					+ "			(cep, logradouro, bairro_bairroid)"
					+ "		value(?, ?, ?)" + ";";
			PreparedStatement stmtRua = cnctn.prepareStatement(queryRua);
			stmtRua.setString(1, enderecodto.getCep());
			stmtRua.setString(2, enderecodto.getLogradouro());
			stmtRua.setLong(3, 1);
			stmtRua.executeUpdate();

			String queryEndereco = "insert into endereco"
					+ "			(numero, complemento, referencia, pessoa_pessoaid, rua_ruaid)"
					+ "		value(?, ?, ?, ?, ?)" + ";";
			PreparedStatement stmtEndereco = cnctn.prepareStatement(queryEndereco);
			stmtEndereco.setString(1, enderecodto.getNumero());
			stmtEndereco.setString(2, enderecodto.getComplemento());
			stmtEndereco.setString(3, enderecodto.getReferencia());
			stmtEndereco.setLong(4, 1);
			stmtEndereco.setLong(5, 1);
			stmtEndereco.executeUpdate();

			cnctn.close(); //  use try-with-resources (recomendado). Fechando o recurso (importante!)
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO: "+e);
			return 0;
		}

	}
}

