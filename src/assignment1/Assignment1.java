/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author c0654335
 */
public class Assignment1 {
    static int  custid;
   static String custname;
  static  String productname;
  static  int quantity;
   static  String notes;
    
public static void placeOrders()
{
    Scanner in= new Scanner(System.in);
     System.out.println("enter your customer  id");
     try{
    custid=in.nextInt();
    in.nextLine();
     }
     catch(Exception e)
     {
         System.out.println("We got some problem:" +e);
     }
    System.out.println("enter your name");
    
    try{
    custname=in.nextLine();
    }
     catch(Exception e)
     {
         System.out.println("We got some problem:" +e);
     }
    System.out.println("enter product name you wanna purchase");
    
    try
    {
     productname=in.nextLine();
     
    }
      catch(Exception e)
     {
         System.out.println("We got some problem:" +e);
     }
     System.out.println("enter product quantity");
     try{
         
     
      quantity=in.nextInt();
      in.nextLine();
     }
      catch(Exception e)
     {
         System.out.println("We got some problem:" +e);
     }
       System.out.println("enter some notes");
       try{
            notes=in.nextLine();
       }
       catch(Exception e)
     {
         System.out.println("We got some problem:" +e);
     }
   
    ArrayList<order> or = new ArrayList<order>();
       order myorders = new order();
       myorders.setCustomerID(custid);
       myorders.setCustomerName(custname);
       myorders.setProductID(productname);
       myorders.setQuantity(quantity);
       myorders.setNotes(notes);
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   Date date = new Date();
	   String dd= dateFormat.format(date); 
       or.add(myorders);
       
       System.out.println("");
       
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("1.Enter you orders\n"
                + "2.See your order");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        switch(choice)
        {
            case 1:
                placeOrders();
            case 2:
               // seeorders();
                
        }
        
        // TODO code application logic here
    }
    
}
