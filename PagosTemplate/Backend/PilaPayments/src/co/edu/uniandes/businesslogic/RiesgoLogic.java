package co.edu.uniandes.businesslogic;

import co.edu.uniandes.dao.RiesgoDAO;
import co.edu.uniandes.dao.RiesgoDAOImpl;
import co.edu.uniandes.entity.Riesgo;
import co.edu.uniandes.to.RiesgoTO;

public class RiesgoLogic {

	private RiesgoDAO riesgoDAO;
	
	public RiesgoLogic(RiesgoDAO riesgoDAO) {
		this.riesgoDAO = riesgoDAO;
	}
	
	public RiesgoTO findByActividadEconomica(Long idActividad) {
		
		RiesgoTO to = new RiesgoTO();
		Riesgo riesgo = riesgoDAO.findByActividadEconomica(idActividad);
		
		to.setClaseRiesgo(riesgo.getClaseRiesgo());
		to.setValorInicial(riesgo.getValorInicial());
		to.setId(riesgo.getId());
		
		return to;
	}
	
	public static RiesgoLogic getRiesgoLogic() {
		return new RiesgoLogic(new RiesgoDAOImpl());
	}
}
