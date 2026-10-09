public class Main {
    public static void main(String[] args) {
        Goods[] barang = {
            new Food("Roti Coklat", 15000, 250),
            new Toy("Robot Mainan", 100000, 5),
            new Book("Belajar Java", 80000, "Sahizidan")
        };

        for (Goods g : barang) {
            g.display();

            if (g instanceof Taxable) {
                System.out.println("(barang ini kena pajak " + (Taxable.taxRate * 100) + "%)");
            } else {
                System.out.println("(barang ini tidak kena pajak)");
            }
            System.out.println();
        }
    }
}