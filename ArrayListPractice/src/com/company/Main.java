package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> someApprentices = new ArrayList<>();

        someApprentices.add("Brian");
        someApprentices.add("Jamie");
        someApprentices.add("Omar");
        someApprentices.add("David");

        ArrayList<String> moreApprentices = someApprentices;

        moreApprentices.add("Christie");
        moreApprentices.add("Nada");
        System.out.println(moreApprentices);

        List allTheTypes = new ArrayList();
        allTheTypes.add(6);
        allTheTypes.add("Hello");
        allTheTypes.add(false);
        System.out.println(allTheTypes);

        ArrayList<String> allString = new ArrayList<>();
        allString.add("Kareem");
        allString.add("is");
        allString.add("the");
        allString.add("man");
        System.out.println(allString);
        allString.add(2, "always");
        System.out.println(allString);

    }
}
