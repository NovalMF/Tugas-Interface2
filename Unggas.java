public abstract class Unggas implements UnggasIntfrc {
    
    protected String nama;
    protected String habitat;
	
    protected String getnama() {
        return this.nama;
        
    }
    
    protected String gethabitat() {
        return this.habitat;
        
    }
    public void setnama(String nama) {
      this.nama= nama;  
        
    }
    
    public void sethabitat(String hbt) {
        this.habitat=hbt;
    }
    
    protected abstract void Tampilnama();
    protected abstract void Tampilhabitat();
    
	
}