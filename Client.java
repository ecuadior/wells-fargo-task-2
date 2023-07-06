package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clinetid;

    
    @ManyToOne
    private Advisor advisorid;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client()
    { }

    public Client(Advisor advisorID, String fname, String lName, String Address, String phonenum, String emaill)
    {
        advisorid = advisorID;
        firstName = fname;
        lastName = lName;
        address = Address;
        phone = phonenum;
        email = emaill;
    }

    public Long getClientId() {
        return clinetid;
    }

    public Advisor getAdvisorId() {
        return advisorid;
    }

    public void setAdvisorId(Advisor advisorID) {
        advisorid = advisorID;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    
    
}
