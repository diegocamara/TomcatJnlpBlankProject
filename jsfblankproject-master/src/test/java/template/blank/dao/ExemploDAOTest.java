package template.blank.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import template.blank.domain.ExemploEntity;

public class ExemploDAOTest extends AbstractDAOTest {

	@Autowired
	private ExemploDAO exemploDAO;

	@Test
	public void verificarBuscarValor() {

		ExemploEntity exemploEntity1 = new ExemploEntity();
		exemploEntity1.setValor(2);

		ExemploEntity exemploEntity2 = new ExemploEntity();
		exemploEntity2.setValor(10);

		save(exemploEntity1, exemploEntity2);
		
		int valor = exemploDAO.buscarValor(exemploEntity1.getCodigo());

		Assert.assertEquals("RESULTADO DEVERIA SER IGUAL", exemploEntity1.getValor(), valor);

	}

}
