package com.example.module10;

public class UseDivision {

    public static void main(String[] args) {

        Division intDiv1 = new InternationalDivision("Global Sales", 1001, "Germany", "German");
        Division intDiv2 = new InternationalDivision("Tech Support", 1002, "Japan", "Japanese");

        Division domDiv1 = new DomesticDivision("HR Services", 2001, "Florida");
        Division domDiv2 = new DomesticDivision("Warehouse Ops", 2002, "Arkansas");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}