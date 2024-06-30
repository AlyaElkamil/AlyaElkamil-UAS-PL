public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(String panjang, String lebar, String tinggi) {
        this.panjang = Double.parseDouble(panjang);
        this.lebar = Double.parseDouble(lebar);
        this.tinggi = Double.parseDouble(tinggi);
    }
    public double volumeBalok(){
        return panjang * lebar * tinggi;
    }
    public double hitungLuasPermukaan() {
        return  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public String toString() {
        return "(Volume Balok adalah " + volumeBalok() + " & Luas Permukaannya adalah " + hitungLuasPermukaan() + ")";
    }
}
