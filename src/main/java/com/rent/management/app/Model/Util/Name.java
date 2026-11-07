package com.rent.management.app.Model.Util;


public class Name {
    private String firstName;
    private String lastName;

    /**
     * @param firstName String argument for first name
     * @param lastName String argument for last name
     */
    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    /**
     * getter for last name
     * @return returns string of last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter for last name
     * @param lastName String argument to be stored
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter for first name
     * @return returns string of first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter for first name
     * @param firstName String argument to be stored
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter for formatted name
     * @return returns a String with the name properly formatted to read
     */
    public String getFormattedName(){
        return firstName + " " + lastName;
    }
}

  
