package com.jpmc.midascore.foundation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    private long id;
    private long timestamp;
    private float amount;

    public Transaction() {
        // default constructor
    }

    public Transaction(long id, long timestamp, float amount) {
        this.id = id;
        this.timestamp = timestamp;
        this.amount = amount;
    }

    // Getters and Setters (required for Kafka JSON deserialization)
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }

    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", timestamp=" + timestamp + ", amount=" + amount + "}";
    }
}


