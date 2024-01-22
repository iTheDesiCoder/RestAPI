package com.springboot.restapi.entity.mapper;

import com.springboot.restapi.entity.JPA.StockMain;
import com.springboot.restapi.entity.StockMainDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-20T19:32:24-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21 (Oracle Corporation)"
)
@Component
public class StockMainMapperImpl implements StockMainMapper {

    @Override
    public StockMain toEntity(StockMainDto stockMainDto) {
        if ( stockMainDto == null ) {
            return null;
        }

        StockMain stockMain = new StockMain();

        stockMain.setId( stockMainDto.getId() );
        stockMain.setNasdaqTraded( stockMainDto.getNasdaqTraded() );
        stockMain.setSecurityName( stockMainDto.getSecurityName() );
        stockMain.setListingExchange( stockMainDto.getListingExchange() );
        stockMain.setMarketCategory( stockMainDto.getMarketCategory() );
        stockMain.setEtf( stockMainDto.getEtf() );
        stockMain.setRoundLotSize( stockMainDto.getRoundLotSize() );
        stockMain.setTestIssue( stockMainDto.getTestIssue() );
        stockMain.setFinancialStatus( stockMainDto.getFinancialStatus() );
        stockMain.setCqsSymbol( stockMainDto.getCqsSymbol() );
        stockMain.setNasdaqSymbol( stockMainDto.getNasdaqSymbol() );
        stockMain.setNextShares( stockMainDto.getNextShares() );

        return stockMain;
    }

    @Override
    public StockMainDto toDto(StockMain stockMain) {
        if ( stockMain == null ) {
            return null;
        }

        String id = null;
        String nasdaqTraded = null;
        String securityName = null;
        String listingExchange = null;
        String marketCategory = null;
        String etf = null;
        Integer roundLotSize = null;
        String testIssue = null;
        String financialStatus = null;
        String cqsSymbol = null;
        String nasdaqSymbol = null;
        String nextShares = null;

        id = stockMain.getId();
        nasdaqTraded = stockMain.getNasdaqTraded();
        securityName = stockMain.getSecurityName();
        listingExchange = stockMain.getListingExchange();
        marketCategory = stockMain.getMarketCategory();
        etf = stockMain.getEtf();
        roundLotSize = stockMain.getRoundLotSize();
        testIssue = stockMain.getTestIssue();
        financialStatus = stockMain.getFinancialStatus();
        cqsSymbol = stockMain.getCqsSymbol();
        nasdaqSymbol = stockMain.getNasdaqSymbol();
        nextShares = stockMain.getNextShares();

        StockMainDto stockMainDto = new StockMainDto( id, nasdaqTraded, securityName, listingExchange, marketCategory, etf, roundLotSize, testIssue, financialStatus, cqsSymbol, nasdaqSymbol, nextShares );

        return stockMainDto;
    }

    @Override
    public StockMain partialUpdate(StockMainDto stockMainDto, StockMain stockMain) {
        if ( stockMainDto == null ) {
            return stockMain;
        }

        if ( stockMainDto.getId() != null ) {
            stockMain.setId( stockMainDto.getId() );
        }
        if ( stockMainDto.getNasdaqTraded() != null ) {
            stockMain.setNasdaqTraded( stockMainDto.getNasdaqTraded() );
        }
        if ( stockMainDto.getSecurityName() != null ) {
            stockMain.setSecurityName( stockMainDto.getSecurityName() );
        }
        if ( stockMainDto.getListingExchange() != null ) {
            stockMain.setListingExchange( stockMainDto.getListingExchange() );
        }
        if ( stockMainDto.getMarketCategory() != null ) {
            stockMain.setMarketCategory( stockMainDto.getMarketCategory() );
        }
        if ( stockMainDto.getEtf() != null ) {
            stockMain.setEtf( stockMainDto.getEtf() );
        }
        if ( stockMainDto.getRoundLotSize() != null ) {
            stockMain.setRoundLotSize( stockMainDto.getRoundLotSize() );
        }
        if ( stockMainDto.getTestIssue() != null ) {
            stockMain.setTestIssue( stockMainDto.getTestIssue() );
        }
        if ( stockMainDto.getFinancialStatus() != null ) {
            stockMain.setFinancialStatus( stockMainDto.getFinancialStatus() );
        }
        if ( stockMainDto.getCqsSymbol() != null ) {
            stockMain.setCqsSymbol( stockMainDto.getCqsSymbol() );
        }
        if ( stockMainDto.getNasdaqSymbol() != null ) {
            stockMain.setNasdaqSymbol( stockMainDto.getNasdaqSymbol() );
        }
        if ( stockMainDto.getNextShares() != null ) {
            stockMain.setNextShares( stockMainDto.getNextShares() );
        }

        return stockMain;
    }
}
