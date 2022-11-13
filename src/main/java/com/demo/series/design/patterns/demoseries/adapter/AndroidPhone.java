package com.demo.series.design.patterns.demoseries.adapter;

public class AndroidPhone {

    private AndroidCharger charger;
    public void plugCharger (AndroidCharger charger){
        System.out.println( "Charger plugged into your Apple Phone !");
        this.charger=charger;
    }
    public void charge(){
        System.out.println("Charging your Apple phone");
        this.charger.chargeAndroidPhones();
    }
}
