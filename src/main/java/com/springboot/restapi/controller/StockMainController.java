package com.springboot.restapi.controller;

import com.springboot.restapi.entity.mapper.StockMainMapper;
import com.springboot.restapi.repository.StockMainRepository;
import com.springboot.restapi.entity.StockMainDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class StockMainController {
    private final StockMainRepository stockMainRepository;
    private final StockMainMapper stockMainMapper;

    public StockMainController(StockMainRepository stockMainRepository,
                               StockMainMapper stockMainMapper) {
        this.stockMainRepository = stockMainRepository;
        this.stockMainMapper = stockMainMapper;
    }



    @GetMapping("/stocks")
    public List<StockMainDto> getStocks() {
        return stockMainRepository.findAll().stream()
                .map(stockMainMapper::toDto)
                .collect(Collectors.toList());
    }
}
