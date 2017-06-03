public class Jenisunggas extends Unggas  {
 
    private String Makanan ;
    private String Berkembangbiak;
   
    public void setMakanan(String mkn){
        this.Makanan=mkn;
    }
    public void setBerkembangbiak(String bk){
        this.Berkembangbiak = bk;        
    }
    public String getMakanan(){
        return this.Makanan;
    }
    public String getBerkembangbiak(){
        return this.Berkembangbiak;
    }    

    
    @Override
    protected void Tampilnama() {
     super.setnama("Ayam"); 
     System.out.println("Nama Unggas = " +super.getnama());
    }

    @Override
    protected void Tampilhabitat() {
       super.sethabitat("Darat"); 
     System.out.println("Habitat Unggas = " +super.gethabitat());
    }
    public void Berjalan(String jln) {
		System.out.println(jln);
}
    public void Terbang(String trbngA, String trbngB) {
		System.out.println(trbngA + trbngB);
}

    
}
