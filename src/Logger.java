
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Logger {

    public static void main(String[] args) {

        FileWriter out;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la frase: ");
        s = in.nextLine();
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        try {
            
            out = new FileWriter("data/log.txt");
            out.write("{" + day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second + "}");
            out.write(s);
            out.close();
        } catch (IOException ex) {
            System.out.println("ERRORE " + ex.getMessage());
        }
    }
}
