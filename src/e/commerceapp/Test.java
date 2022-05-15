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
    User user1 =new User("ali1221","ali","demirci","01/10/1965","abc123","alidemirci@amail.com","izmir aydın mah","manisa şehzade mah");
    Product product1 = new Product("pc","black","electronic device",100,2.5,"bu pc çok iyi");
    CreditCard creditCard1 = new CreditCard("1234567890","alidemirci","21415","09/05/2026");
    user1.addFavoriteProducts(product1);
    user1.lookat();
    product1.lookat();
    creditCard1.lookat();
    }
}
