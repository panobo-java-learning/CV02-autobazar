package com.engeto.autobazar;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CarData {

    private String brandAndModel;
    private LocalDate firstInServiceDate;
    private double averageConsumption;
    private int previousOwnersCount;
    private String ownerNameSurname;
    private BigDecimal price;
    private boolean preparedForSale;

    public CarData(String brandAndModel,
                   LocalDate firstInServiceDate, double averageConsumption, int previousOwnersCount,
                   String ownerNameSurname, BigDecimal price, boolean preparedForSale) {
        this.brandAndModel = brandAndModel;
        this.firstInServiceDate = firstInServiceDate;
        this.averageConsumption = averageConsumption;
        this.previousOwnersCount = previousOwnersCount;
        this.ownerNameSurname = ownerNameSurname;
        this.price = price;
        this.preparedForSale = preparedForSale;
    }

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public LocalDate getFirstInServiceDate() {
        return firstInServiceDate;
    }

    public void setFirstInServiceDate(LocalDate firstInServiceDate) {
        this.firstInServiceDate = firstInServiceDate;
    }

    public double getAverageConsumption() {
        return averageConsumption;
    }

    public void setAverageConsumption(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    }

    public int getPreviousOwnersCount() {
        return previousOwnersCount;
    }

    public void setPreviousOwnersCount(int previousOwnersCount) {
        this.previousOwnersCount = previousOwnersCount;
    }

    public String getOwnerNameSurname() {
        return ownerNameSurname;
    }

    public void setOwnerNameSurname(String ownerNameSurname) {
        this.ownerNameSurname = ownerNameSurname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isPreparedForSale() {
        return preparedForSale;
    }

    public void setPreparedForSale(boolean preparedForSale) {
        this.preparedForSale = preparedForSale;
    }
}
