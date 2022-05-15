/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerceapp;

/**
 *
 * @author Boss
 */
public class Product {
    private String productName; 
    private String productColor; 
    private String productCategory; 
    private int productStockInformation; 
    private double productWeight;
    private String productDescriptionInformation;

    public Product(String productName, String productColor, String productCategory, int productStockInformation, double productWeight, 
            String productDescriptionInformation) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInformation = productStockInformation;
        this.productWeight = productWeight;
        this.productDescriptionInformation = productDescriptionInformation;
    }
    public Product(String productName){
        this.productName = productName;
    }
    
    public void orderingProduct(){
        
    }

    public void lookat(){
        System.out.println("productName : "+ getProductName());
        System.out.println("productColor : "+ getProductColor());
        System.out.println("productCategory : "+ getProductCategory());
        System.out.println("productStockInformation : "+ getProductStockInformation());
        System.out.println("productWeight : "+ getProductWeight());
        System.out.println("productDescriptionInformation : "+ getProductDescriptionInformation());
    }
    
    
    
    
    
    
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockInformation() {
        return productStockInformation;
    }

    public void setProductStockInformation(int productStockInformation) {
        this.productStockInformation = productStockInformation;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescriptionInformation() {
        return productDescriptionInformation;
    }

    public void setProductDescriptionInformation(String productDescriptionInformation) {
        this.productDescriptionInformation = productDescriptionInformation;
    }
    
    
    
    
}
