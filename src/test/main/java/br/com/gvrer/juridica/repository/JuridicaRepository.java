package br.com.gvrer.juridica.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.gvrer.config.ConexaoConfig;
import br.com.gvrer.contato.model.Contato;
import br.com.gvrer.contato.repository.ContatoRepository;
import br.com.gvrer.juridica.service.JuridicaDTO;
import br.com.gvrer.pessoa.model.Pessoa;
import br.com.gvrer.pessoa.repository.PessoaRepository;

@Service
public class JuridicaRepository {

    public int cadastrar(JuridicaDTO juridicaDTO) throws Exception {
        ConexaoConfig cnx = new ConexaoConfig();
        Connection cnctn = cnx.conectar();

        try {
            // Iniciar transação
            cnctn.setAutoCommit(false);

            // Criar pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setDatanascimento(juridicaDTO.getDatanascimento());
            PessoaRepository pr = new PessoaRepository();
            pessoa = pr.criar(pessoa);

            // Inserir tipo de contato
            long tipocontatoId;
            String insertTipoContato = "INSERT INTO tipodecontato (nometipocontato) VALUES (?)";
            PreparedStatement stmtTipoContato = cnctn.prepareStatement(insertTipoContato, Statement.RETURN_GENERATED_KEYS);
            stmtTipoContato.setString(1, juridicaDTO.getTipodecontato());
            stmtTipoContato.executeUpdate();

            try (ResultSet rsTipoContato = stmtTipoContato.getGeneratedKeys()) {
                if (rsTipoContato.next()) {
                    tipocontatoId = rsTipoContato.getLong(1);
                } else {
                    throw new Exception("Erro ao obter ID de tipo de contato");
                }
            }

            // Inserir contato
            String insertContato = "INSERT INTO contato (contato, tipocontatoid) VALUES (?, ?)";
            PreparedStatement stmtContato = cnctn.prepareStatement(insertContato);
            stmtContato.setString(1, juridicaDTO.getContato());
            stmtContato.setLong(2, tipocontatoId);
            stmtContato.executeUpdate();

            // Inserir jurídica
            String insertJuridica = "INSERT INTO juridica (razaosocial, nomefantasia, cnpj, pessoaid) VALUES (?, ?, ?, ?)";
            PreparedStatement stmtJuridica = cnctn.prepareStatement(insertJuridica);
            stmtJuridica.setString(1, juridicaDTO.getRazaosocial());
            stmtJuridica.setString(2, juridicaDTO.getNomefantasia());
            stmtJuridica.setString(3, juridicaDTO.getCnpj());
            stmtJuridica.setLong(4, pessoa.getPessoaid());
            stmtJuridica.executeUpdate();

            // Commit se tudo deu certo
            cnctn.commit();
            return 1;

        } catch (Exception e) {
            // Rollback em caso de erro
            if (cnctn != null) {
                cnctn.rollback();
            }
            throw e;

        } finally {
            // Encerrar conexão
            if (cnctn != null && !cnctn.isClosed()) {
                cnctn.setAutoCommit(true);
                cnctn.close();
            }
        }
    }
}
