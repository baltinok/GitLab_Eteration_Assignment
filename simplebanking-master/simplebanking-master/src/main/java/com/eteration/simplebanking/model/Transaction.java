package com.eteration.simplebanking.model;

import java.time.OffsetDateTime;
import java.util.UUID;

// This class is a place holder you can change the complete implementation
public abstract class Transaction {

    public Transaction(double d) {

    }
	
    

    @Id
    private UUID approvalCode;
    OffsetDateTime date;
    double amount;

    protected void create(double amount) {
        this.approvalCode = UUID.randomUUID();
        this.date = OffsetDateTime.now();
        this.amount = amount;
    }
abstract void Transaction(double d);

    public String toString() {

        return "";
    }



}
