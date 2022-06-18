import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        LocalTime myObj = LocalTime.now();
//        System.out.println(myObj);

        Time time = new Time();
        time.setH(13);
        time.setM(33);
        time.setS(11);
        System.out.println("Soat:Minut:Sekund: " + time.getH() + ":" + time.getM() + ":" + time.getS() + " HH:mm:ss");
    }
}
