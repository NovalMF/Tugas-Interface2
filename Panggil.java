public class Panggil {
        public static void main (String[] args) {
        Jenisunggas ju = new Jenisunggas();
        
        ju.setMakanan("Cacing");
        System.out.println("Makanan Hewan = " +ju.getMakanan());
        ju.setBerkembangbiak("Bertelur");
        System.out.println("Cara berkembangbiak hewan = " +ju.getBerkembangbiak());
        ju.Tampilnama();
        ju.Tampilhabitat();
        ju.Berjalan("Unggas Berjalan = " +"dengan 2 kaki");
        ju.Terbang("Unggas Terbang = " +"dengan 2 sayap", "Burung");
    }

    
}
