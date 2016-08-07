package com.backbase.test.atmlocator.models;

/**
 * Created by luizsantana on 10/6/15.
 */
public class ATM {
    private String type;
    private Address address;
    private int distance;

    public int getDistance(){
    	return distance;
    }
    
    public String getMe(){
    	return "RobFGreenwood 7/Aug/2016";
    }
    
    
    public void setDistance(int distance){
    	this.distance = distance;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
