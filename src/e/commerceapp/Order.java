/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerceapp;

/**
 *
 * @author Boss
 */
public class Order {
    private User orderingUser;
    private Product orderedProduct;
    private CreditCard paymentCard;

    public Order(User orderingUser, Product orderedProduct, CreditCard paymentCard) {
        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.paymentCard = paymentCard;
    }
    
    public void canBeOrdered(Product a,int amount,User x){
            if (a.isEnough(amount)){
            x.shoppingProduct(a, amount);
            }
        }
}
