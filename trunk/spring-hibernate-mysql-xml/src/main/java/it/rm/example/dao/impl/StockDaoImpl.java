package it.rm.example.dao.impl;

import it.rm.example.dao.StockDao;
import it.rm.example.model.Stock;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Implementation of {@link StockDao}.
 * @author r.mazzocca
 *
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(Stock stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);
	}

	@SuppressWarnings("rawtypes")
	public Stock findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find("from Stock where stockCode=?",
				stockCode);
		return (Stock) list.get(0);
	}

}
