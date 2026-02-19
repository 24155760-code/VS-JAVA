import java.io.FileInputStream;
import java.io.IOException;

public class CompareBinaryFiles {

    public static void main(String[] args) {

        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try {
            FileInputStream f1 = new FileInputStream(file1);
            FileInputStream f2 = new FileInputStream(file2);

            int byte1, byte2;
            int position = 1;
            boolean isEqual = true;

            while (true) {

                byte1 = f1.read();
                byte2 = f2.read();

                // If both files reach end
                if (byte1 == -1 && byte2 == -1) {
                    break;
                }

                // If bytes are different
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal.");
                    System.out.println("First difference at byte position: " + position);
                    isEqual = false;
                    break;
                }

                position++;
            }

            if (isEqual) {
                System.out.println("Two files are equal.");
            }

            f1.close();
            f2.close();

        } catch (IOException e) {
            System.out.println("Error reading files.");
        }
    }
}
