package Model;

public class HocKi {
	private String mahocki;
	private String tenhocki;

	
	public HocKi() 
	{
	}
	public HocKi(String mahocki, String tenhocki) {
		this.mahocki = mahocki;
		this.tenhocki = tenhocki;
		
		
	}
	public String getMahocki() {
		return mahocki;
	}
	public void setMahocki(String mahocki) {
		this.mahocki = mahocki;
	}
	public String getTenhocki() {
		return tenhocki;
	}
	public void setTenhocki(String tenhocki) {
		this.tenhocki = tenhocki;
	}
}
