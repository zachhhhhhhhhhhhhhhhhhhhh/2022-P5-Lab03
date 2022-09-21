public class project {
    public static void main(String args[]) {
    
    int sv =10000;


    int hrs = sv / 3600;
    int sec = sv % 3600;
    int min = sec / 60;
    int rsec = sec % 60;

    System.out.println("starting value: " + sv);
    System.out.println("hours: " + hrs);
    System.out.println("minutes: " + min);
    System.out.println("seconds: " + rsec);
    System.out.println();
    System.out.println();
    //100 points

        System.out.println("100 points");
        int smil = 10000123;
        int hours = smil / 3600000;
        int milliseconds = smil % 3600000;
        int minutes = milliseconds / 60000;
        int remainmill = milliseconds % 60000;
        int seconds = remainmill / 1000;
        int remmilliseconds = remainmill % 1000;

        System.out.println("starting value: " + smil);
        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("seconds: " + seconds);
        System.out.println("milliseconds: " + remmilliseconds);


    }

}