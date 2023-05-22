package com.java.stringDoselect;

import java.util.*;
import java.lang.*;
import java.util.regex.*;

class TransactionParty {
    String seller;
    String buyer;

    public TransactionParty(String seller, String buyer)
    {
        this.seller = seller;
        this.buyer = buyer;
    }
}

class Receipt{
    TransactionParty transactionParty;
    String productsQR;

    public Receipt(TransactionParty transactionParty, String productsQR)
    {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }
}


class GenerateReceipt{
    public int verifyParty(Receipt r){
    	
//    	System.out.println(r.transactionParty.buyer);
        Pattern pattern = Pattern.compile("^[A-Za-z]+([ '-][a-zA-Z]+)*$");
        Matcher matcherOne = pattern.matcher(r.transactionParty.seller);
        Matcher matcherTwo = pattern.matcher(r.transactionParty.buyer);

        if(matcherOne.find() && matcherTwo.find() )
        {
        	System.out.println(r.transactionParty.seller);
        	System.out.println(r.transactionParty.buyer);
        	return 2;
        }	
        else if(matcherOne.find() || matcherTwo.find())
        {
        	return 1;
        }
        
          return 0;

    }
    public String calcGST(Receipt r){
        String str = r.productsQR;

        String[] strArray1 = str.split("@");
        int sum = 0;
        for(int i = 0;i<strArray1.length;i++){
        	System.out.println(strArray1[i]);
            String[] strArray2 = strArray1[i].split(",");
              int k = 1;
              for(String j : strArray2){
                  k *= Integer.parseInt(j);
              }
            sum += k;
        }
      int gst = (sum/100)*12;
       
      System.out.println(gst);
     
	return Integer.toString(gst);
    }
}
public class Source{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    TransactionParty transactionParty = new TransactionParty(scan.nextLine(),scan.nextLine());
    Receipt rec = new Receipt(transactionParty,scan.nextLine());
    GenerateReceipt gr = new GenerateReceipt();

    System.out.println(gr.verifyParty(rec));
    System.out.println(gr.calcGST(rec));

  }
}
