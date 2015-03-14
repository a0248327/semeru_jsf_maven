package main.java.br.com.semeru.suport;

import main.java.br.com.semeru.model.dao.HibernateDAO;
import main.java.br.com.semeru.model.dao.InterfaceDAO;
import main.java.br.com.semeru.model.entities.Estado;
import main.java.br.com.semeru.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bbEstado")
@RequestScoped
public class BbEstado implements Serializable {

	private static final long serialVersionUID = 1L;

	public List<Estado> getEstados() {
		InterfaceDAO<Estado> estadoDAO = new HibernateDAO<Estado>(Estado.class, FacesContextUtil.getRequestSession());
		return estadoDAO.getEntities();
	}
}