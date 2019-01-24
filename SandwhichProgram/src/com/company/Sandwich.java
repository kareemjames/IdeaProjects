package com.company;

public class Sandwich {
    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    public Sandwich(String breadType, String proteinType, String cheeseType, boolean veggies) {
        this.breadType = breadType;
        this.proteinType = proteinType;
        this.cheeseType = cheeseType;
        this.veggies = veggies;
    }

    public Sandwich(String proteinType, String cheeseType, boolean veggies) {
        breadType = "Whole Grain";
        this.proteinType = proteinType;
        this.cheeseType = cheeseType;
        this.veggies = veggies;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public boolean isVeggies() {
        return veggies;
    }

    public void setVeggies(boolean veggies) {
        this.veggies = veggies;
    }

    public void describeSandwich() {
        System.out.println(breadType + " " + proteinType + " " + cheeseType + " " + veggies);
    }
}
