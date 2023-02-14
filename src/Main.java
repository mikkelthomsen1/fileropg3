import java.io.FileReader;
import java.io.FileWriter;

import static java.lang.Character.getNumericValue;

public class Main {
    public static void main(String[] args) {
        System.out.print(getNumericValue('B'));
        //System.out.println("Hello world!");
        try {
            FileReader input = new FileReader("src\\fil.txt");
            FileWriter output = new FileWriter("src\\stat1.txt");

            while (input.ready()) {
                char test = (char) input.read();
                if ('a'<=test && test<='z' || test == ' ') {
                    output.write(test);
                }

            }
            input.close();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}