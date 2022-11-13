package com.demo.series.design.patterns.demoseries.adapter;

public class AndroidToAppleChargerAdapter extends AppleCharger {

    private final AndroidCharger androidCharger;

    public AndroidToAppleChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeApplePhones() {
        System.out.println("You are using an AndroidToAppleChargerAdapter");
        androidCharger.chargeAndroidPhones();
    }

}
