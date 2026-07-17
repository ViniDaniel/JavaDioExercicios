public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setSecond(40);
        brlClock.setMinute(25);
        brlClock.setHour(17);

        System.out.println(brlClock.getTime());
        System.out.println(new USClock().convert(brlClock).getTime());

    }
}
