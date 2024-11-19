/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.control.Habilidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author karol
 */
public class ManterHabilidade extends DAO{
    public void inserir(Habilidade h) throws SQLException{
        try {
            abrirBanco();
            String query = "INSERT INTO habilidade(id,habilidadenome,descricao)"
                    + "values(null,?,?)";
            pst=(PreparedStatement) con.prepareStatement(query);
            pst.setString(1, h.getHabilidade_nome());
            pst.setString(2, h.getDescricao());
            pst.execute();
            fecharBanco();
            JOptionPane.showMessageDialog(null, "Concluido!");
    } catch (Exception e) {
        System.out.println("Erro inserir ManterRegiao" + e.getMessage());
    }
    }
    
    public void deletar(Habilidade h) throws Exception{
         abrirBanco();
         String query = "delete FROM habilidade where id=?";
         pst=(PreparedStatement) con.prepareStatement(query);
         pst.setInt(1, h.getId());
         pst.execute();
        fecharBanco();   
        JOptionPane.showMessageDialog(null, "Deletado!");
     }
    
    public ArrayList<Habilidade> PesquisarTudoHabilidade() throws Exception {
       ArrayList<Habilidade> lista = new ArrayList<Habilidade>();
       abrirBanco();
       
         try{        
         String query = "select * from habilidade;";
         pst = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = pst.executeQuery();
         Habilidade h;
         while(tr.next()){
             h = new Habilidade();
             h.setId(tr.getInt("id"));
             h.setHabilidade_nome(tr.getString("habilidadenome"));
             h.setDescricao(tr.getString("descricao"));
             lista.add(h);
         }
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro PesquisarTudoHabilidade :" + e.getMessage());
     } 
       return lista;
     }
    
    public void EditarHabilidade(Habilidade h) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE habilidade set habilidadenome = ?, descricao = ? where id = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, h.getHabilidade_nome());
        pst.setString(2, h.getDescricao());
        pst.setInt(3, h.getId());
        pst.executeUpdate();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Alterado!");
    }
    
    public void PesquisarRegistroHabilidade(Habilidade h) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM habilidade where id=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, h.getId());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                h.setId(tr.getInt("id"));
                h.setHabilidade_nome(tr.getString("habilidadenome"));
                h.setDescricao(tr.getString("descricao"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro PesquisarRegistroHabilidade : " + e.getMessage());
        }
    }
}
