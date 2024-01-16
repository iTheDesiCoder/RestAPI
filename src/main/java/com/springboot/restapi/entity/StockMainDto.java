package com.springboot.restapi.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.springboot.restapi.entity.JPA.StockMain} entity
 */
public class StockMainDto implements Serializable {
    private final String id;
    private final String nasdaqTraded;
    private final String securityName;
    private final String listingExchange;
    private final String marketCategory;
    private final String etf;
    private final Integer roundLotSize;
    private final String testIssue;
    private final String financialStatus;
    private final String cqsSymbol;
    private final String nasdaqSymbol;
    private final String nextShares;

    public StockMainDto(String id, String nasdaqTraded, String securityName, String listingExchange, String marketCategory, String etf, Integer roundLotSize, String testIssue, String financialStatus, String cqsSymbol, String nasdaqSymbol, String nextShares) {
        this.id = id;
        this.nasdaqTraded = nasdaqTraded;
        this.securityName = securityName;
        this.listingExchange = listingExchange;
        this.marketCategory = marketCategory;
        this.etf = etf;
        this.roundLotSize = roundLotSize;
        this.testIssue = testIssue;
        this.financialStatus = financialStatus;
        this.cqsSymbol = cqsSymbol;
        this.nasdaqSymbol = nasdaqSymbol;
        this.nextShares = nextShares;
    }

    public String getId() {
        return id;
    }

    public String getNasdaqTraded() {
        return nasdaqTraded;
    }

    public String getSecurityName() {
        return securityName;
    }

    public String getListingExchange() {
        return listingExchange;
    }

    public String getMarketCategory() {
        return marketCategory;
    }

    public String getEtf() {
        return etf;
    }

    public Integer getRoundLotSize() {
        return roundLotSize;
    }

    public String getTestIssue() {
        return testIssue;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public String getCqsSymbol() {
        return cqsSymbol;
    }

    public String getNasdaqSymbol() {
        return nasdaqSymbol;
    }

    public String getNextShares() {
        return nextShares;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockMainDto entity = (StockMainDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nasdaqTraded, entity.nasdaqTraded) &&
                Objects.equals(this.securityName, entity.securityName) &&
                Objects.equals(this.listingExchange, entity.listingExchange) &&
                Objects.equals(this.marketCategory, entity.marketCategory) &&
                Objects.equals(this.etf, entity.etf) &&
                Objects.equals(this.roundLotSize, entity.roundLotSize) &&
                Objects.equals(this.testIssue, entity.testIssue) &&
                Objects.equals(this.financialStatus, entity.financialStatus) &&
                Objects.equals(this.cqsSymbol, entity.cqsSymbol) &&
                Objects.equals(this.nasdaqSymbol, entity.nasdaqSymbol) &&
                Objects.equals(this.nextShares, entity.nextShares);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nasdaqTraded, securityName, listingExchange, marketCategory, etf, roundLotSize, testIssue, financialStatus, cqsSymbol, nasdaqSymbol, nextShares);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nasdaqTraded = " + nasdaqTraded + ", " +
                "securityName = " + securityName + ", " +
                "listingExchange = " + listingExchange + ", " +
                "marketCategory = " + marketCategory + ", " +
                "etf = " + etf + ", " +
                "roundLotSize = " + roundLotSize + ", " +
                "testIssue = " + testIssue + ", " +
                "financialStatus = " + financialStatus + ", " +
                "cqsSymbol = " + cqsSymbol + ", " +
                "nasdaqSymbol = " + nasdaqSymbol + ", " +
                "nextShares = " + nextShares + ")";
    }
}