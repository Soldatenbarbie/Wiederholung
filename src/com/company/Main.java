package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int alter = 17;
        // hier wird der code immer ausgeführt
        if (alter >= 18) {
            System.out.println("JUHUUU!!! aber nur wein ich bin alt");
        } else if (alter >= 16) {
            System.out.println("auch schnapps erlaubt, wenn es niemand sieht :)");
        } else {

            System.out.println("Gehe Pizza essen");
        }
        // hier wird der code auch immer ausgeführt
        System.out.println("warte gelangweilt im Auto!");


        // Beispiel für switch
        int note = 2, stipendium;
        // Berechne Fördertipendium

        switch (note) {
            case 1:
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 20;
            default:
                stipendium = 10;
                break;
        }
            System.out.println("Stipendium"+ stipendium +"€");


    }

}
