package template.blank.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import template.blank.domain.ExemploEntity;

@Repository
public class ExemploDAO extends AbstractDAO<ExemploEntity> {

	public int buscarValor(int codigo) {

		Criteria criteria = createCriteria();

		criteria.add(Restrictions.eq("codigo", codigo));

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("valor"));

		criteria.setProjection(projectionList);

		return (int) criteria.uniqueResult();

	}

}
