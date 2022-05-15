/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerceapp;

import java.util.ArrayList;

/**
 *
 * @author Boss
 */
public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddresse;
    private String workAddresse;
    private ArrayList orderedProducts;
    private ArrayList favoriteProducts;

    public User(String username, String name, String surname, String dateOfBirth, String password, String email, String homeAddresse,
            String workAddresse) {
        //, ArrayList orderedProducts, ArrayList favoriteProducts
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAddresse = homeAddresse;
        this.workAddresse = workAddresse;
        this.orderedProducts =  orderedProducts;
        //this.favoriteProducts = favoriteProducts;
        this.orderedProducts =  new ArrayList<Product>();
        this.favoriteProducts = new ArrayList<Product>();
        this.favoriteProducts = favoriteProducts;
    }
        public void addFavoriteProducts(Product a){
        this.favoriteProducts.add(a);
    }
    
        public void lookat(){
            System.out.println("Username : "+ getUsername());
            System.out.println("Name :"+getName());
            System.out.println("Surname :"+getSurname());
            System.out.println("DATE OF BIRTH :"+getDateOfBirth());
            System.out.println("Password :"+getPassword());
            System.out.println("Email :"+getEmail());
            System.out.println("Home Address :"+getHomeAddresse());
            System.out.println("Work Address :"+getWorkAddresse());
            System.out.println("Ordered Products :"+getOrderedProducts());
            for(int i=0;i<this.favoriteProducts.size();i++){
            System.out.println("Favorite Products :"+getFavoriteProducts());
            System.out.println(this.favoriteProducts.get(i));
        }
            
        }

        
        
        
        
        
        
        
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddresse() {
        return homeAddresse;
    }

    public void setHomeAddresse(String homeAddresse) {
        this.homeAddresse = homeAddresse;
    }

    public String getWorkAddresse() {
        return workAddresse;
    }

    public void setWorkAddresse(String workAddresse) {
        this.workAddresse = workAddresse;
    }

    public ArrayList getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(ArrayList orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public ArrayList getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(ArrayList favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
        
}
