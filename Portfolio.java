package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client,String cDate)
    {   
        clientId = client;
        creationDate = cDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientId()
    {
        return clientId;
    }

    public void setClientId(Client client)
    {
        clientId = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


}

