package com.ashokit.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mahesh_banks")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "banks_seq")
    @TableGenerator(name="banks_seq",table="sequence_store",
            pkColumnName = "seq_name", valueColumnName ="seq_value",
            pkColumnValue = "bank_seq_id",initialValue = 1, allocationSize = 1)
    private Integer bankId;

    private String bankName;

    private String location;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", location=" + location + "]";
    }
}