package it.rm.example.bo.impl;
 
import it.rm.example.bo.StockBo;
import it.rm.example.dao.StockDao;
import it.rm.example.model.Stock;
 
/**
 * Implementation of {@link StockBo}.
 * 
 * @author r.mazzocca
 *
 */
public class StockBoImpl implements StockBo{
 
	StockDao stockDao;
 
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}
 
	public void save(Stock stock){
		stockDao.save(stock);
	}
 
	public void update(Stock stock){
		stockDao.update(stock);
	}
 
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
 
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}
