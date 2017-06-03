public class Mahasiswa {
	public String nama="Rendy";
	
	public void kuliah () {
		System.out.println ("kuliah");
		}
		
		public static void main	(String[] args){
			Mahasiswa rendy= new Mahasiswa();
			
			System.out.println(rendy.nama);
			rendy.kuliah();
			
		}
	}