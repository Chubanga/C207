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
import model.PacienteHasMedico;

public class PacienteHasMedicoDAO {
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
    
    public boolean inserirPacienteHasMedico(PacienteHasMedico novoPaciente) {

        conectarnoBanco();

        String sql = "INSERT INTO PACIENTE_HAS_MEDICO (cpf,crm) values (?,?)";
        

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, novoPaciente.getCpf());
            pst.setInt(2, novoPaciente.getCrm());
  
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
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
    
    public ArrayList<PacienteHasMedico> buscarPacienteHasMedico() {
        
        ArrayList<PacienteHasMedico> listaPacientes = new ArrayList<>();
        conectarnoBanco();
        String sql = "SELECT * FROM PACIENTE_HAS_MEDICO";

        try (PreparedStatement stmt = con.
                prepareStatement("select * from PACIENTE_HAS_MEDICO");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                PacienteHasMedico paciente = new PacienteHasMedico();
                paciente.setCpf(rs.getInt("cpf"));
                paciente.setCrm(rs.getInt("crm"));
                         
                listaPacientes.add(paciente);
            }
            return listaPacientes;
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
    
}
