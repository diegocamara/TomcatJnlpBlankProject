package template.blank.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import template.blank.manager.IExemploManager;
import template.blank.util.MensagensUtil;

@ManagedBean
@ViewScoped
public class ExemploMB extends AbstractMB {

	@ManagedProperty(value = "#{exemploManager}")
	private IExemploManager exemploManager;

	private double resultado;

	@Override
	void inicializar() {
		System.out.println();
	}

	public void buscar() {
		resultado = this.exemploManager.buscarValor(1);
	}

	public IExemploManager getExemploManager() {
		return exemploManager;
	}

	public void setExemploManager(IExemploManager exemploManager) {
		this.exemploManager = exemploManager;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getMsg() {		
		return  MensagensUtil.getMessage("message2", "Test3");
	}

}
