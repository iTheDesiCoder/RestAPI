package com.springboot.restapi.entity.JPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StockMain")
public class StockMain {
    @Id
    @Column(name = "Symbol", nullable = false, length = 50)
    private String id;

    @Column(name = "Nasdaq_Traded", length = 5)
    private String nasdaqTraded;

    @Column(name = "Security_Name", length = 500)
    private String securityName;

    @Column(name = "Listing_Exchange", length = 50)
    private String listingExchange;

    @Column(name = "Market_Category", length = 50)
    private String marketCategory;

    @Column(name = "ETF", length = 50)
    private String etf;

    @Column(name = "Round_Lot_Size")
    private Integer roundLotSize;

    @Column(name = "Test_Issue", length = 50)
    private String testIssue;

    @Column(name = "Financial_Status", length = 50)
    private String financialStatus;

    @Column(name = "CQS_Symbol", length = 50)
    private String cqsSymbol;

    @Column(name = "NASDAQ_Symbol", length = 50)
    private String nasdaqSymbol;

    @Column(name = "NextShares", length = 50)
    private String nextShares;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNasdaqTraded() {
        return nasdaqTraded;
    }

    public void setNasdaqTraded(String nasdaqTraded) {
        this.nasdaqTraded = nasdaqTraded;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    public String getMarketCategory() {
        return marketCategory;
    }

    public void setMarketCategory(String marketCategory) {
        this.marketCategory = marketCategory;
    }

    public String getEtf() {
        return etf;
    }

    public void setEtf(String etf) {
        this.etf = etf;
    }

    public Integer getRoundLotSize() {
        return roundLotSize;
    }

    public void setRoundLotSize(Integer roundLotSize) {
        this.roundLotSize = roundLotSize;
    }

    public String getTestIssue() {
        return testIssue;
    }

    public void setTestIssue(String testIssue) {
        this.testIssue = testIssue;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public String getCqsSymbol() {
        return cqsSymbol;
    }

    public void setCqsSymbol(String cqsSymbol) {
        this.cqsSymbol = cqsSymbol;
    }

    public String getNasdaqSymbol() {
        return nasdaqSymbol;
    }

    public void setNasdaqSymbol(String nasdaqSymbol) {
        this.nasdaqSymbol = nasdaqSymbol;
    }

    public String getNextShares() {
        return nextShares;
    }

    public void setNextShares(String nextShares) {
        this.nextShares = nextShares;
    }
}