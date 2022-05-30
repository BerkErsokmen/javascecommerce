/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerceapp;

/**
 *
 * @author Boss
 */
public class Test {
    public static void main(String[] args){
    User user1 =new User("ali1221","ali","demirci","01/10/1965","abc123","alidemirci@amail.com","izmir aydın mah","manisa sehzade mah");
    User user2 =new User("ayse1221","ayse","kalayci","02/05/1977","ayse123","aysekalayci@amail.com","izmir kapak mah","manisa muradiye mah");
    Product product1 = new Product("pc","black","electronic device",100,2.5,"bu pc çok iyi");
    Product product2 = new Product("tel","white","electronic device",300,1.2,"bu telefon dokunmatik");
    Product product3 = new Product("kulaklık","red","electronic device",50,0.6,"bluetooth modu vardır");
    CreditCard creditCard1 = new CreditCard("1234567890","alidemirci","21415","09/05/2026");
    user2.addFavoriteProducts(product1);
    user2.addFavoriteProducts(product2);
    user2.addFavoriteProducts(product3);
    user2.lookat();
    product1.lookat();
    creditCard1.lookat();
    //user2.showFavoriteProducts(product1);
    }
}
