/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.control.Regiao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author karol
 */
public class ManterRegiao extends DAO{
    public void inserir(Regiao r) throws SQLException{
        try {
            abrirBanco();
            String query = "INSERT INTO regiao(id,regiaonome) "
                    + "values(null,?)";
            pst=(PreparedStatement) con.prepareStatement(query);
            pst.setString(1, r.getRegiaoNome());
            pst.execute();
            fecharBanco();
            JOptionPane.showMessageDialog(null, "Concluido!");
    } catch (Exception e) {
        System.out.println("Erro inserir ManterRegiao" + e.getMessage());
    }
    }
    
    public void deletar(Regiao r) throws Exception{
         abrirBanco();
         String query = "delete FROM regiao where id=?";
         pst=(PreparedStatement) con.prepareStatement(query);
         pst.setInt(1, r.getId());
         pst.execute();
        fecharBanco();   
        JOptionPane.showMessageDialog(null, "Deletado!");
     }
    
    public ArrayList<Regiao> PesquisarTudo () throws Exception {
       ArrayList<Regiao> regiao = new ArrayList<Regiao>();
       abrirBanco();
       
         try{        
         String query = "select * from regiao;";
         pst = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = pst.executeQuery();
         Regiao r;
         while(tr.next()){
             r = new Regiao();
             r.setId(tr.getInt("id"));
             r.setRegiaoNome(tr.getString("regiaonome"));
             regiao.add(r);
         }
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro pesquisarTudo ManterRegiao" + e.getMessage());
     } 
       return regiao;
     }
    
    public void EditarRegiao(Regiao r) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE regiao set regiaonome = ? where id = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, r.getRegiaoNome());
        pst.setInt(2, r.getId());
        pst.executeUpdate();
        fecharBanco();
        JOptionPane.showMessageDialog(null, "Alterado!");
    }
    
    public void PesquisarRegistroRegiao(Regiao r) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM regiao where id=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, r.getId());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                r.setId(tr.getInt("id"));
                r.setRegiaoNome(tr.getString("regiaonome"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro PesquisarRegistroPokemon : " + e.getMessage());
        }
    }
}
