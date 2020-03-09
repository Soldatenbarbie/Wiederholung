public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Willkommen im glücklichen Tierheim");
        //Hund Lessie - 20 kg - spielfreudig, löst kriminalfälle
        double futterLessie;
        double ge = 20;
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt " + futterLessie +" kg Futter");
        // Unterschiedliche Varianten um das Gewicht um 1 kg zu erhoehen
        double x;

         x= ge++;
        System.out.println(x+ "" +ge);

        // fuettern am Abend
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie +" kg Futter");
    }
     public static double berechneFuttermenge(double gewicht){

        double futterMenge;

        futterMenge = gewicht /20;

        return futterMenge;

        // kurz geschrieben
         // return gewicht / 20;
     }
}