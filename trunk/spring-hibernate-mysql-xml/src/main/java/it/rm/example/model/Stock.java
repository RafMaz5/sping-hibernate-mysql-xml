package it.rm.example.model;
 
import java.io.Serializable;
 
/**
 * A Stock model class to store the stock data later.
 * 
 * @author r.mazzocca
 *
 */
public class Stock implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private Long stockId;
	private String stockCode;
	private String stockName;
	
	/**
	 * @return the stockId
	 */
	public Long getStockId() {
		return stockId;
	}
	
	/**
	 * @param stockId the stockId to set
	 */
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	
	/**
	 * @return the stockCode
	 */
	public String getStockCode() {
		return stockCode;
	}
	
	/**
	 * @param stockCode the stockCode to set
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}
	
	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
}
