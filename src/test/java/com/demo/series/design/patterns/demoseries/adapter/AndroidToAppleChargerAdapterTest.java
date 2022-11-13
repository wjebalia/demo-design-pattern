package com.demo.series.design.patterns.demoseries.adapter;


class AndroidToAppleChargerAdapterTest {

    private void test(){
        ApplePhone applePhone = new ApplePhone();
        AndroidCharger androidCharger = new AndroidCharger();
        System.out.println("We have an apple phone and an android charger...!");
        AppleCharger androidToAppleChargerAdapter
                = new AndroidToAppleChargerAdapter(androidCharger); //Adapter Pattern
        System.out.println("Created an Apple Charger by converting an android charger");
        applePhone.plugAppleCharger(androidToAppleChargerAdapter);
        applePhone.charge();
    }

}