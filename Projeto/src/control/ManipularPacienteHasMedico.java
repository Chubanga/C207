
package control;


import java.util.ArrayList;
import model.PacienteHasMedico;
import DAO.PacienteHasMedicoDAO;

public class ManipularPacienteHasMedico {
    private final ArrayList<PacienteHasMedico> listaPacientesH;
    private final PacienteHasMedicoDAO pacienteHDao = new PacienteHasMedicoDAO();
    
    public ManipularPacienteHasMedico() 
    {      
        listaPacientesH = pacienteHDao.buscarPacienteHasMedico();  
    }

}
