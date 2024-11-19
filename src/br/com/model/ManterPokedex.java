package br.com.model;

import br.com.control.Pokemon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class ManterPokedex extends DAO {

    public void inserir(Pokemon p) throws SQLException {
        try {
            abrirBanco();
            String query = "INSERT INTO pokemon(id,geracao,nome,id_habilidade,id_regiao,id_tipo) "
                    + "values(null,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, p.getGeracao());
            pst.setString(2, p.getNome());
            pst.setInt(3, p.getHabilidade());
            pst.setInt(4, p.getRegiao());
            pst.setInt(5, p.getTipo());
            pst.execute();
            fecharBanco();
            JOptionPane.showMessageDialog(null, "Concluido!");
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public void deletar(Pokemon p) throws Exception {
        abrirBanco();
        String query = "delete FROM pokemon where id=?;";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, p.getId());
        pst.execute();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Deletado!");
    }

    public ArrayList<Pokemon> PesquisarTudo() throws Exception {
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        try {
            abrirBanco();
            String query = "select p.id, p.geracao, p.nome, h.habilidadenome , r.regiaonome, t.tiponome from pokemon p join habilidade h on h.id = p.id_habilidade join regiao r on r.id = p.id_regiao join tipo t on t.id = p.id_tipo order by id;";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = pst.executeQuery();
            Pokemon p;
            while (tr.next()) {
                p = new Pokemon();
                p.setId(tr.getInt("id"));
                p.setGeracao(tr.getInt("geracao"));
                p.setNome(tr.getString("nome"));
                p.setNomeHabilidade(tr.getString("habilidadenome"));
                p.setNomeRegiao(tr.getString("regiaonome"));
                p.setNomeTipo(tr.getString("tiponome"));
                pokemons.add(p);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro pesquisarTudo " + e.getMessage());
        }
        return pokemons;
    }

    public ArrayList<Pokemon> LogPokemon() throws Exception {
        ArrayList<Pokemon> log = new ArrayList<Pokemon>();
        try {
            abrirBanco();
            String query = "select pr.id, pr.geracao ,pr.nome, h.habilidadenome , r.regiaonome, t.tiponome, pr.modificado_em, pr.acao from pokemon_relatorio pr join habilidade h on h.id = pr.nomehabilidade join regiao r on r.id = pr.nomeregiao join tipo t on t.id = pr.nometipo order by pr.modificado_em;";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = pst.executeQuery();
            Pokemon p;
            while (tr.next()) {
                p = new Pokemon();
                p.setId(tr.getInt("id"));
                p.setGeracao(tr.getInt("geracao"));
                p.setNome(tr.getString("nome"));
                p.setNomeHabilidade(tr.getString("habilidadenome"));
                p.setNomeRegiao(tr.getString("regiaonome"));
                p.setNomeTipo(tr.getString("tiponome"));
                p.setModificadoPokemon(tr.getString("modificado_em"));
                p.setAcao(tr.getString("acao"));
                log.add(p);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro pesquisarTudo " + e.getMessage());
        }
        return log;
    }

    public void PesquisarRegistroPokemon(Pokemon p) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM pokemon where id=?;";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, p.getId());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                p.setId(tr.getInt("id"));
                p.setGeracao(tr.getInt("geracao"));
                p.setNome(tr.getString("nome"));
                p.setHabilidade(tr.getInt("id_habilidade"));
                p.setRegiao(tr.getInt("id_regiao"));
                p.setTipo(tr.getInt("id_tipo"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro PesquisarRegistro : " + e.getMessage());
        }
    }

    public void EditarPokemon(Pokemon p) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE pokemon set geracao = ?,nome = ?,id_habilidade = ?,id_regiao = ?,id_tipo = ? where id = ?;";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(6, p.getId());
        pst.setInt(1, p.getGeracao());
        pst.setString(2, p.getNome());
        pst.setInt(3, p.getHabilidade());
        pst.setInt(4, p.getRegiao());
        pst.setInt(5, p.getTipo());
        pst.executeUpdate();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Alterado!");
    }

    public ResultSet comboBoxHabilidade() {
        try {
            abrirBanco();
            String query = "select id,habilidadenome from habilidade order by habilidadenome;";
            pst = (PreparedStatement) con.prepareStatement(query);
            return pst.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro comboBoxHabilidade :" + e.getMessage());
            return null;
        }
    }

    public ResultSet comboBoxRegiao() {
        try {
            abrirBanco();
            String query = "select * from regiao order by regiaonome;";
            pst = (PreparedStatement) con.prepareStatement(query);
            return pst.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro comboBoxRegiao :" + e.getMessage());
            return null;
        }
    }

    public ResultSet comboBoxTipo() {
        try {
            abrirBanco();
            String query = "select * from tipo order by tiponome;";
            pst = (PreparedStatement) con.prepareStatement(query);
            return pst.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro comboBoxTipo :" + e.getMessage());
            return null;
        }
    }

}
