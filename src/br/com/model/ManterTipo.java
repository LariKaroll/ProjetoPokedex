/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.control.Tipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author karol
 */
public class ManterTipo extends DAO{
    public void inserir(Tipo t) throws SQLException{
        try {
            abrirBanco();
            String query = "INSERT INTO tipo(id,tiponome) "
                    + "values(null,?)";
            pst=(PreparedStatement) con.prepareStatement(query);
            pst.setString(1, t.getNome_tipo());
            pst.execute();
            fecharBanco();
            JOptionPane.showMessageDialog(null, "Concluido!");
    } catch (Exception e) {
        System.out.println("Erro inserir ManterRegiao" + e.getMessage());
    }
    }
    
    public void deletar(Tipo t) throws Exception{
         abrirBanco();
         String query = "delete FROM tipo where id=?";
         pst=(PreparedStatement) con.prepareStatement(query);
         pst.setInt(1, t.getId());
         pst.execute();
        fecharBanco(); 
        JOptionPane.showMessageDialog(null, "Deletado!");
     }
    
    public ArrayList<Tipo> PesquisarTudo () throws Exception {
       ArrayList<Tipo> Lista = new ArrayList<Tipo>();
       abrirBanco();
       
         try{        
         String query = "select * from tipo;";
         pst = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = pst.executeQuery();
         Tipo t;
         while(tr.next()){
             t = new Tipo();
             t.setId(tr.getInt("id"));
             t.setNome_tipo(tr.getString("tiponome"));
             Lista.add(t);
         }
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro pesquisarTudo ManterTipo" + e.getMessage());
     } 
       return Lista;
     }
    
    public void EditarTipo(Tipo t) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE tipo set tiponome = ? where id = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, t.getNome_tipo());
        pst.setInt(2, t.getId());
        pst.executeUpdate();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Alterado!");
    }
    
    public void PesquisarRegistroTipo(Tipo t) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM tipo where id=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, t.getId());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                t.setId(tr.getInt("id"));
                t.setNome_tipo(tr.getString("tiponome"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro PesquisarRegistroTipo : " + e.getMessage());
        }
    }
}
