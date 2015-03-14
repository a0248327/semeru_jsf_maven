package main.java.br.com.semeru.suport;

import main.java.br.com.semeru.model.dao.HibernateDAO;
import main.java.br.com.semeru.model.dao.InterfaceDAO;
import main.java.br.com.semeru.model.entities.TipoLogradouro;
import main.java.br.com.semeru.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

@ManagedBean(name = "bbTipoLogradouro")
@RequestScoped
public class BbTipoLogradouro implements Serializable {

	private static final long serialVersionUID = 1L;

	public List<TipoLogradouro> getTipoLogradouros() {
		Session session = FacesContextUtil.getRequestSession();
		InterfaceDAO<TipoLogradouro> tipoLogradouroDAO = new HibernateDAO<TipoLogradouro>(TipoLogradouro.class, session);
		return tipoLogradouroDAO.getEntities();
	}
}