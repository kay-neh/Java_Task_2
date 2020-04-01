package com.example.javatask2;

public class Details {
    private String interest;
    private String description;

    public Details(String interest, String description) {
        this.interest = interest;
        this.description = description;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
