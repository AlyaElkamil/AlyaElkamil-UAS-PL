import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cuboid1 {
    public static void main(String[] args) {
        String fileName = "cuboid.txt";
        ArrayList<Kubus> k = new ArrayList<>();

        try { BufferedReader br = new BufferedReader(new FileReader(fileName)) {
            String line;
            br.readline();

                }
            }
        } catch(IOException e){
            System.err.println("Gagal membaca file" + e.getMessage());
        }
    }
}
