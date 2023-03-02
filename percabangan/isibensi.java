public class Main {
    public static void main(String[] args) {
        int bensinSekarang = 5; // liter
        int kapasitasTangki = 50; // liter
        double persentaseBensin = (double) bensinSekarang / kapasitasTangki * 100;
        
        if (persentaseBensin >= 75) {
            System.out.println("Tangki bensin penuh (" + bensinSekarang + " liter, " + persentaseBensin + "%)");
        } else if (persentaseBensin >= 50) {
            System.out.println("Tangki bensin setengah (" + bensinSekarang + " liter, " + persentaseBensin + "%)");
        } else if (persentaseBensin >= 25) {
            System.out.println("Tangki bensin hampir habis (" + bensinSekarang + " liter, " + persentaseBensin + "%)");
        } else {
            System.out.println("Tangki bensin kosong (" + bensinSekarang + " liter, " + persentaseBensin + "%)");
        }
    }
}
