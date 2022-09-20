public class project {
    public static void main(String args[]) {
    
    int sv =20000;


    int hrs = sv / 3600;
    int sec = sv % 3600;
    int min = sec / 60;
    int rsec = sec % 60;

    System.out.println("starting value: " + sv);
    System.out.println("hours: " + hrs);
    System.out.println("minutes: " + min);
    System.out.println("seconds: " + rsec);






    }

}
