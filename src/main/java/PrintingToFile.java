import java.io.IOException;
import java.io.PrintWriter;

public class PrintingToFile {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 1};
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        sb.append(", ");
        sb.append(arr[1]);
        sb.append(", ");
        sb.append(arr[2]);
        System.out.println(sb.toString());
        try (PrintWriter pw = new PrintWriter("output.txt")) {
            /*for (int i = 0; i < arr.length; i++) {
                pw.println(arr[i]);
            }*/
            pw.println(sb.toString());
            pw.flush();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
