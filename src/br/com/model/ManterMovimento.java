/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.control.Movimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class ManterMovimento extends DAO{
    public void inserir(Movimento m) throws SQLException {
        try {
            abrirBanco();
            String query = "INSERT INTO movimento(id,nome,dano,descricao,id_tipo) "
                    + "values(null,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, m.getNome());
            pst.setInt(2, m.getDano());
            pst.setString(3, m.getDescricao());
            pst.setInt(4, m.getId_tipo());
            pst.execute();
            fecharBanco();
            JOptionPane.showMessageDialog(null, "Concluido!");
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void deletar(Movimento m) throws Exception {
        abrirBanco();
        String query = "delete FROM movimento where id=?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, m.getId());
        pst.execute();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Deletado!");
    }
    
    public ArrayList<Movimento> PesquisarTudoMovimento() throws Exception {
        ArrayList<Movimento> Lista = new ArrayList<Movimento>();
        try {
            abrirBanco();
            String query = "select m.id, nome, dano, descricao, tiponome from movimento m inner join tipo on m.id_tipo = tipo.id order by m.id;";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = pst.executeQuery();
            Movimento p;
            while (tr.next()) {
                p = new Movimento();
                p.setId(tr.getInt("id"));
                p.setNome(tr.getString("nome"));
                p.setDano(tr.getInt("dano"));
                p.setDescricao(tr.getString("descricao"));
                p.setNome_tipo(tr.getString("tiponome"));
                Lista.add(p);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro PesquisarTudoMovimento " + e.getMessage());
        }
        return Lista;
    }
    
    public void PesquisarRegistroMovimento(Movimento m) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM movimento where id=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, m.getId());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                m.setId(tr.getInt("id"));
                m.setNome(tr.getString("nome"));
                m.setDano(tr.getInt("dano"));
                m.setDescricao(tr.getString("descricao"));
                m.setId_tipo(tr.getInt("id_tipo"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro PesquisarRegistroMovimento : " + e.getMessage());
        }
    }
    
    public void EditarMovimento(Movimento m) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE movimento set nome = ?,dano = ?,descricao = ?,id_tipo = ? where id = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(5, m.getId());
        pst.setString(1, m.getNome());
        pst.setInt(2, m.getDano());
        pst.setString(3, m.getDescricao());
        pst.setInt(4, m.getId_tipo());
        pst.executeUpdate();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Alterado!");
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
