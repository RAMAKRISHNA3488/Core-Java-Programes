package com.bank.ploymarphism;

public class TestBank {

	public static void main(String[] args) {
       Bank b;
       b=new SBI();
       System.out.println("SBI Rate of Interest:"+b.getrateofinterest());
       System.out.println("total amount is:"+b.total());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest:"+b.getrateofinterest());
        System.out.println("ICICI Rate of Interest:"+b.getamount());
       b=new Axis();
       System.out.println("Axis Rate of Interest:"+b.getrateofinterest());
       System.out.println("Axis total ammount:"+b.total());
       b=new Kanara();
       System.out.println("Kanara Rate of Interest:"+b.getrateofinterest());
       b=new Andra();
       System.out.println("Andra Rate of Interest:"+b.getrateofinterest());

	}

}
