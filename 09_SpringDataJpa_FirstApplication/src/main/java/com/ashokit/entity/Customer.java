package com.ashokit.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "customers_seq")
    /*@SequenceGenerator(name = "customers_seq",
                       sequenceName = "shopping_customers_seq",
                       initialValue = 10001,
                       allocationSize = 1
                       )*/
    @TableGenerator(name="customers_seq",table="sequence_store",
            pkColumnName = "seq_name", valueColumnName ="seq_value",
            pkColumnValue = "customer_seq_id",initialValue = 1, allocationSize = 1)
    @Column(name="customer_id")
    private Integer customerId;

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="email_id")
    private String emailId;

    public Customer(){
    }

   public Customer(Integer customerId, String location, String name, String emailId) {
        this.customerId = customerId;
        this.location = location;
        this.name = name;
        this.emailId = emailId;
    }

    public Customer(String name, String location, String emailId) {
        this.name = name;
        this.location = location;
        this.emailId = emailId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
