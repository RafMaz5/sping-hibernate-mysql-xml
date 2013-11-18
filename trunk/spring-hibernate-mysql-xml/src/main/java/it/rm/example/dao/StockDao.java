package it.rm.example.dao;

import it.rm.example.model.Stock;

/**
 * A Stock DAO interface and implementation, the dao implementation class
 * extends the Spring’s “HibernateDaoSupport” to make Hibernate support in
 * Spring framework. Now, you can execute the Hibernate function via
 * getHibernateTemplate().
 * 
 * @author r.mazzocca
 * 
 */
public interface StockDao {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);

}