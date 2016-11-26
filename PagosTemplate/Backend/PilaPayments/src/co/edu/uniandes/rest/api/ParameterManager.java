package co.edu.uniandes.rest.api;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.edu.uniandes.businesslogic.EntityLogic;
import co.edu.uniandes.businesslogic.ParameterLogic;
import co.edu.uniandes.dao.ActividadEconomicaDAO;
import co.edu.uniandes.dao.ActividadEconomicaDAOImpl;
import co.edu.uniandes.dao.EntityDAOImpl;
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.TipoPagadorDAO;
import co.edu.uniandes.dao.TipoPagadorDAOImpl;
import co.edu.uniandes.dao.TipoPensionDAO;
import co.edu.uniandes.dao.TipoPensionDAOImpl;
import co.edu.uniandes.dao.TipoPensionadoDAO;
import co.edu.uniandes.dao.TipoPensionadoDAOImpl;
import co.edu.uniandes.entity.Parametro;
import co.edu.uniandes.entity.TipoPension;
import co.edu.uniandes.entity.TipoPensionado;
import co.edu.uniandes.entity.Validacion;

@Path("/parameters")
public class ParameterManager {
    private static final Logger logger = LogManager.getLogger(ParameterManager.class);
    private ParameterLogic logic;


	 /**
     * Retorna los TipoPagador
     *
     * @return entidades
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/tipopagador")
    public String listAllTipoPagador() {
        ObjectMapper mapper = new ObjectMapper();
        logger.debug("Start getEntities");
        String response = "";
        try {
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getParameterLogic().findAllTipoPagador());
        } catch (JsonProcessingException e) {
            response = "No se pudo obtener la lista " + e.getMessage();
        }
        logger.debug("end getEntities:" + response);
        return response;
    }
    
	 /**
     * Retorna los TipoPensionado para un TipoPagador
     *
     * @return entidades
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/opciones/{idPagador}")
    public String listTPensionadoByTPagador(@PathParam("idPagador") Long idPagador) {
        ObjectMapper mapper = new ObjectMapper();
        logger.debug("Start getEntities");
        String response = "";
        try {
        	
        	List<TipoPensionado> listPensionado = getParameterLogic().listTPensionadoByTPagador(idPagador);
        	List<TipoPension> listPension = getParameterLogic().listTPensionByTPagador(idPagador);
        	
        	Validacion validaciones= new Validacion();
        	HashMap<String, List<?>> mapPensionadoPension = new HashMap<String, List<?>>();
        	for(int i=0; i<listPensionado.size();i++){
        		TipoPensionado pensionado = listPensionado.get(i);
        		List<?> itemsPension = getParameterLogic().listTPensionByTPensionado(pensionado.getId());
        		mapPensionadoPension.put(pensionado.getCodigo(), itemsPension);
        	}
        	
        	
        	HashMap<String, List<?>> mapPensionPensionado = new HashMap<String, List<?>>();
        	for(int i=0; i<listPension.size();i++){
        		TipoPension pension = listPension.get(i);
        		List<?> itemsPensionado =  getParameterLogic().listTPensionadoByTPension(pension.getId());
        		mapPensionPensionado.put(pension.getCodigo(), itemsPensionado);
        	}
        	
        	validaciones.getValues().put("pensionPensionado", mapPensionPensionado);
        	validaciones.getValues().put("pensionadoPension", mapPensionadoPension);

        	
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(validaciones);
        } catch (JsonProcessingException e) {
            response = "No se pudo obtener la lista " + e.getMessage();
        }
        logger.debug("end getEntities:" + response);
        return response;
    }
    /**
     * metodo auxiliar para obtener la logica del entity
     *
     * @return
     */
	private ParameterLogic getParameterLogic() {
		
	        if (logic == null) {
	            logic = new ParameterLogic(new TipoPagadorDAOImpl(), new TipoPensionadoDAOImpl(), new ActividadEconomicaDAOImpl(), new TipoPensionDAOImpl());
	         
	        }
	        return logic;
	    }
}
