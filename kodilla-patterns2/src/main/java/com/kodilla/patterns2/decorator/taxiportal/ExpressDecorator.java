package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class ExpressDecorator extends AbstractTaxiOrderDecorator {
    public ExpressDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " express service";
    }
}