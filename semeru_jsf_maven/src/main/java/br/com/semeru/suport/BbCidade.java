package main.java.br.com.semeru.suport;

import main.java.br.com.semeru.model.dao.HibernateDAO;
import main.java.br.com.semeru.model.dao.InterfaceDAO;
import main.java.br.com.semeru.model.entities.Cidade;
import main.java.br.com.semeru.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bbCidade")
@RequestScoped
public class BbCidade implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Cidade> cidades;

	public List<Cidade> getCidades() {
		InterfaceDAO<Cidade> cidadeDAO = new HibernateDAO<Cidade>(Cidade.class, FacesContextUtil.getRequestSession());
		return cidadeDAO.getEntities();
	}
}
