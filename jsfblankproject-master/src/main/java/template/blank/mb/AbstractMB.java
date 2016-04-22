package template.blank.mb;

import javax.annotation.PostConstruct;

public abstract class AbstractMB {
	
	@PostConstruct
	abstract void inicializar();
	
}
