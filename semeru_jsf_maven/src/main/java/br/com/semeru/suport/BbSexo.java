package main.java.br.com.semeru.suport;

import main.java.br.com.semeru.model.dao.HibernateDAO;
import main.java.br.com.semeru.model.dao.InterfaceDAO;
import main.java.br.com.semeru.model.entities.Sexo;
import main.java.br.com.semeru.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bbSexo")
@RequestScoped
public class BbSexo implements Serializable {

	private static final long serialVersionUID = 1L;

	public List<Sexo> getSexos() {
		InterfaceDAO<Sexo> sexoDAO = new HibernateDAO<Sexo>(Sexo.class, FacesContextUtil.getRequestSession());
		return sexoDAO.getEntities();
	}

}
