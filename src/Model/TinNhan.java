package Model;

public class TinNhan {
	private String matinnhan;
	private String noidungtinnhan;
	private String tieude;
	
	public TinNhan() 
	{
	}
	public TinNhan(String matinnhan, String noidungtinnhan, String tieude) {
		this.matinnhan = matinnhan;
		this.noidungtinnhan = noidungtinnhan;
		this.tieude = tieude;
		
	}
	public String getMatinnhan() {
		return matinnhan;
	}
	public void setMatinnhan(String matinnhan) {
		this.matinnhan = matinnhan;
	}
	public String getNoidungtinnhan() {
		return noidungtinnhan;
	}
	public void setNoidungtinnhan(String noidungtinnhan) {
		this.noidungtinnhan = noidungtinnhan;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
}
