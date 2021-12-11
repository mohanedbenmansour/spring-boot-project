package com.example.tpspring.services;

import com.example.tpspring.entities.Stock;

import java.util.List;

public interface StockService {

    public void addStock(Stock stock);
    public void UpdateStock(Stock stock,long id);
    public Stock getStockById(long id);
    public List<Stock> getAllStock();
    public void deleteStockById(long id);
    public void deleteAllStocks();
}
