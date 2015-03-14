package main.java.br.com.semeru.suport;

import main.java.br.com.semeru.model.dao.HibernateDAO;
import main.java.br.com.semeru.model.dao.InterfaceDAO;
import main.java.br.com.semeru.model.entities.TipoEndereco;
import main.java.br.com.semeru.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

@ManagedBean(name = "bbTipoEndereco")
@RequestScoped
public class BbTipoEndereco implements Serializable {

	private static final long serialVersionUID = 1L;

	public List<TipoEndereco> getTipoEnderecos() {
		Session session = FacesContextUtil.getRequestSession();
		InterfaceDAO<TipoEndereco> tipoEnderecoDAO = new HibernateDAO<TipoEndereco>(TipoEndereco.class, session);
		return tipoEnderecoDAO.getEntities();
	}
}