/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerceapp;

/**
 *
 * @author Boss
 */
public class CreditCard {
    private String creditCardNumber;
    private String creditCardUser;
    private String securityCode;
    private String expirationDate;

    public CreditCard(String creditCardNumber, String creditCardUser, String securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public void lookat(){
        System.out.println("creditCardNumber : "+ getCreditCardNumber());
        System.out.println("creditCardUser : "+ getCreditCardUser());
        System.out.println("securityCode : "+ getSecurityCode());
        System.out.println("expirationDate : "+ getExpirationDate());
    }
    
    
    
    
    
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
    
    
    
    
    
    
}
