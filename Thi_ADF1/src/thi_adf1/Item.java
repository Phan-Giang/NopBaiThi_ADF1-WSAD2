/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_adf1;

import java.util.Scanner;

/**
 *
 * @author Alamit
 */
public class Item {

    private int itemId;
    private String name;
    private String producer;
    private double price;

    public Item() {
    }

    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ItemId: ");
        itemId = input.nextInt();
        System.out.println("Enter name:");
        name = input.next();
        System.out.println("Enter Producer");
        producer = input.next();
        System.out.println("Enter price");
        price = input.nextDouble();
    }

    @Override
    public String toString() {
        return "Item{" + "itemId=" + itemId + ", name=" + name + ", producer=" + producer + ", price=" + price + '}';
    }
}
