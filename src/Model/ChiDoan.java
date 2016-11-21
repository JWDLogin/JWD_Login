package Model;

public class ChiDoan {
	private String machidoan;
	private String tenchidoan;
	private String soluongdv;
	
	public ChiDoan() 
	{
	}
	public ChiDoan(String machidoan, String tenchidoan, String soluongdv) {
		this.machidoan = machidoan;
		this.tenchidoan = tenchidoan;
		this.soluongdv = soluongdv;
		
	}
	public String getMachidoan() {
		return machidoan;
	}
	public void setMachidoan(String machidoan) {
		this.machidoan = machidoan;
	}
	public String getTenchidoan() {
		return tenchidoan;
	}
	public void setTenchidoan(String tenchidoan) {
		this.tenchidoan = tenchidoan;
	}
	public String getSoluongdv() {
		return soluongdv;
	}
	public void setSoluongdv(String soluongdv) {
		this.soluongdv = soluongdv;
	}
}
