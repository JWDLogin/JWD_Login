package Model;

public class HoatDong {
	private String mahoatdong;
	private String tenhoatdong;
	private String duyet;
	public HoatDong() 
	{
	}
	public HoatDong(String mahoatdong, String tenhoatdong, String duyet) {
		this.mahoatdong = mahoatdong;
		this.tenhoatdong = tenhoatdong;
		
		this.duyet=duyet;
	}
	public String getMahoatdong() {
		return mahoatdong;
	}
	public void setMahoatdong(String mahoatdong) {
		this.mahoatdong = mahoatdong;
	}
	public String getTenhoatdong() {
		return tenhoatdong;
	}
	public void setTenhoatdong(String tenhoatdong) {
		this.tenhoatdong = tenhoatdong;
	}
	
	public String getDuyet() {
		return duyet;
	}
	public void setDuyet(String duyet) {
		this.duyet = duyet;
	}
}
