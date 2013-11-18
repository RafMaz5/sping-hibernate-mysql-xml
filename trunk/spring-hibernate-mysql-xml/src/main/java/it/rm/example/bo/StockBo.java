package it.rm.example.bo;

import it.rm.example.model.Stock;

/**
 * Stock business object (BO) interface and implementation, it’s used to store
 * the project’s business function, the real database operations (CRUD) works
 * should not involved in this class, instead it has a DAO (StockDao) class to
 * do it.
 * 
 * @author r.mazzocca
 * 
 */
public interface StockBo {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);
}