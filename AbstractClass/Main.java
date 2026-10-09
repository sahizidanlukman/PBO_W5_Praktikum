public class Main {
    public static void main(String[] args) 
    {
        Animal[] hewan = {
            
            new Dog("Kintamani", "Indonesia", 4),
            new Lion("Barbary", "Afrika", 4),
            new Chicken("Cemani", "Indonesia", 2)
        };

        for (Animal a : hewan) {
            System.out.println("Nama       : " + a.getNama());
            System.out.println("Asal       : " + a.getAsal());
            System.out.println("Jumlah kaki: " + a.getJumlahKaki());
            System.out.print("Suara      : ");
            a.toShout();
            System.out.print("Makan      : ");
            a.toEat();
            System.out.println();
        }
    }

}