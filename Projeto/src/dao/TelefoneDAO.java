/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Telefone;

/**
 *
 * @author joaop
 */
public class TelefoneDAO {
    Connection con;
    
    PreparedStatement pst;
    
    Statement st;
    
    ResultSet rs;
    
    String banco = "Healthbook";
    
    String url = "jdbc:mysql://localhost:3306/" + banco + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    String usuario = "root";
    String senha = "Chimbinha69";
    
    boolean sucesso = false;
    public void conectarnoBanco() {
        try {
            con = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ex.getMessage());
            
        }
    }
    
    public boolean inserirTelefone(Telefone novoTelefone) {

        conectarnoBanco();

        String sql = "INSERT INTO TELEFONE (telefone,nome) values (?,?)";
        

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, novoTelefone.getTelefone());
            pst.setString(2, novoTelefone.getNome());

            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir telefone: "+ ex.getMessage());
            sucesso = false;
        } finally {
            try {

                if (con != null && pst != null) {
                    con.close();
                    pst.close();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar o BD" +ex.getMessage());
            }

        }

        return sucesso;
    }
    
    public ArrayList<Telefone> buscarTelefone() {
        
        ArrayList<Telefone> listaTelefones = new ArrayList<>();

        conectarnoBanco();

        String sql = "SELECT * FROM TELEFONE";

        try (PreparedStatement stmt = con.
                prepareStatement("select * from TELEFONE");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Telefone telefone = new Telefone();
                telefone.setTelefone(rs.getInt("telefone"));
                telefone.setNome(rs.getString("nome"));
                

                listaTelefones.add(telefone);
            }
            return listaTelefones;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

        }
    
    public boolean editarPacientePeloTelefone(Telefone telefone, int nTelefone) {

        conectarnoBanco();

        String sql = "UPDATE TELEFONE SET telefone = ?,nome=? WHERE telefone = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, telefone.getTelefone());
            pst.setString(2, telefone.getNome());
            pst.setInt(3, nTelefone);
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar telefone" +ex.getMessage());
            sucesso = false;
        } finally {
            try {

                if (con != null && pst != null) {
                    con.close();
                    pst.close();
                }

            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"Erro ao fechar o BD" +ex.getMessage());
            }

        }

        return sucesso;
    }
    
    public boolean deleteUsuarioPeloTelefone(Telefone telefone) {

        conectarnoBanco();

        String sql = "DELETE FROM TELEFONE WHERE telefone = ?";

        try (PreparedStatement stmt = con.
                prepareStatement("DELETE FROM TELEFONE WHERE telefone=?")){
            stmt.setInt(1, telefone.getTelefone());
            stmt.execute();
            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar telefone" +ex.getMessage());
            sucesso = false;
        } finally {
            try {

                if (con != null && pst != null) {
                    con.close();
                    pst.close();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar o BD" +ex.getMessage());
            }

        }
        return sucesso;
    }
}
