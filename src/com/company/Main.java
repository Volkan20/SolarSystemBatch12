package com.company;

public class Main {
    public static void main(String[] args) {
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Star="10000";

        //        adding features to our sun
        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";

        //        adding the features for star in the solar system
        FeatureStars FacX = new FeatureStars();
        FacX.color="green";
        FacX.radius="738y4932749km";
        FacX.size="9999999999m";


        //        adding features for Planet2
        Planet2 Oslo =new Planet2();
        Oslo.color="Red";
        Oslo.size="0.00001cm";
        Oslo.name="Volkyy";


    //  adding features for planet1
    Planet1Features GulK = new Planet1Features();
    GulK.color="blue";
    GulK.size="321321321km";
    GulK.name="Islak Kedi";


    }
}
