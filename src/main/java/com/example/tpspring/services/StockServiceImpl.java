package com.example.tpspring.services;

import com.example.tpspring.entities.Stock;
import com.example.tpspring.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

    public class StockServiceImpl implements StockService{
    @Autowired
    StockRepository stockRepository;

    @Override
    public void addStock(Stock stock) {
        if(!stockRepository.findById(stock.getIdStock()).isPresent()){
            stockRepository.save(stock);
        }

    }

    @Override
    public Stock getStockById(long id) {
        return   stockRepository.findById(id).get();
    }

    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public void deleteStockById(long id) {
        stockRepository.findById(id);
    }

    @Override
    public void deleteAllStocks() {
        stockRepository.deleteAll();
    }

    @Override
    public void UpdateStock(Stock stock, long id) {
        Stock st=stockRepository.findById(id).get();

        if(stock.getLibelleStock()!=null) st.setLibelleStock(stock.getLibelleStock());

        if(stock.getQte()!=0) st.setQte(stock.getQte());

        if(stock.getQteMin()!=0)st.setQteMin(stock.getQteMin());

        stockRepository.save(st);
    }
}
