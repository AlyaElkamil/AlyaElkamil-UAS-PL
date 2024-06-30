import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/cuboid.txt";
        List<Balok> arrayBalok = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] kolom = line.split(",");
                    Balok b = new Balok(kolom[0], kolom[1], kolom[2]);
                    arrayBalok.add(b);
            }
        } catch (IOException f){
            System.err.println((f.getMessage()));
        }

        System.out.println("\nMENAMPILKAN VOLUME DAN LUAS PERMUKAAN BALOK");
        for (Balok b : arrayBalok) {
            System.out.println(b);
        }

        sort(arrayBalok);

    }
    public static void sort(List<Balok> arrayBalok){
        for (int i = 0; i < arrayBalok.size() - 1; i++) {
            for (int j = i + 1; j < arrayBalok.size(); j++) {
                double lp1 = arrayBalok.get(i).hitungLuasPermukaan();
                double lp2 = arrayBalok.get(j).hitungLuasPermukaan();
                if (lp1 > lp2) {
                    Balok temp = arrayBalok.get(i);
                    arrayBalok.set(i, arrayBalok.get(j));
                    arrayBalok.set(j, temp);
                }
            }
        }
        String namaFileLuasPermukaan = "src/SortedSurfaceArea.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFileLuasPermukaan))) {
            for (Balok balok : arrayBalok) {
                bw.write(String.valueOf(balok.hitungLuasPermukaan()));
                bw.newLine();
            }
            System.out.println("\nLuas permukaan sudah diurutkan dan ditulis ke dalam file: " + namaFileLuasPermukaan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
