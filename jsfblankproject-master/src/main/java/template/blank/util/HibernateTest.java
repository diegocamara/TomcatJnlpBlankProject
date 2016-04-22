package template.blank.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import template.blank.domain.ExemploEntity;

public class HibernateTest {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("blank");
		EntityManager manager = factory.createEntityManager();

		Session session = (Session) manager.getDelegate();

		Criteria criteria = session.createCriteria(ExemploEntity.class);

		criteria.add(Restrictions.eq("codigo", "1"));

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("codigo"));

		criteria.setProjection(projectionList);

		System.out.println(criteria.list().size());

	}

}
