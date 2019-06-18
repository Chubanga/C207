/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DAO.TelefoneDAO;
import exception.ErroCadastroException;
import java.util.ArrayList;
import model.Telefone;

/**
 *
 * @author joaop
 */
public class ManipuladorTelefones {
    private final ArrayList<Telefone> listaTelefones;
    private final TelefoneDAO telefoneDao = new TelefoneDAO();
    
    public ManipuladorTelefones() 
    {     
        listaTelefones = telefoneDao.buscarTelefone();
    }

    public void edita(int nTelefone, Telefone telefone) throws ErroCadastroException {
    	
        
        if (listaTelefones.isEmpty()) {
            throw new ErroCadastroException("Não há pacientes com esse número cadastrados no "
                    + "sistema.");
        } else {
        	
            for (Telefone telefoneNaLista : listaTelefones) {
                    if (telefoneNaLista.getTelefone()==(telefone.getTelefone())) {
                        throw new ErroCadastroException("Já existe um paciente "
                                + "com o mesmo telefone cadastrado no sistema.");
                    } 
                }
            
            telefoneDao.editarPacientePeloTelefone(telefone, nTelefone);
        }
    }
    public void remove(int nTelefone, Telefone telefone) throws ErroCadastroException {
        boolean telefoneExisteNaLista = false;
        
        if (listaTelefones.isEmpty()) {
            throw new ErroCadastroException("Não há pacientes com esse telefone cadastrados no "
                    + "sistema.");
        } else {
        	
            for (Telefone telefoneNaLista : listaTelefones) {
                if (telefoneNaLista.getTelefone()== telefone.getTelefone()) {
                    telefoneDao.deleteUsuarioPeloTelefone(telefone);
                    telefoneExisteNaLista = true;
                }
            }
            if (!telefoneExisteNaLista) {
                throw new ErroCadastroException("Este telefone não está "
                        + "cadastrado no sistema.");
            }
        }
    }
    public Telefone buscaPorTelefone(int telefone) {
    	
        if (listaTelefones.isEmpty()) {
            
            return null;
        } else {
            for (Telefone telefoneNaLista : listaTelefones) {
                
                if (telefoneNaLista.getTelefone()== telefone) {
                    return telefoneNaLista;         
                }
            }
            
            return null; 
        }
    }
}
