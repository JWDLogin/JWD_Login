package Model;

public class DiemRL_CTXH {
	private String madoanvien;
	private String mahocki;
	private String tenhocki;
	private String diemRL;
	private String diemCTXH;
	
	public DiemRL_CTXH() 
	{
	}
	public DiemRL_CTXH(String madoanvien, String maHK, String tenHK, String diemRL, String diemCTXH) {
		this.madoanvien = madoanvien;
		this.mahocki = maHK;
		this.tenhocki = tenHK;
		this.diemRL=diemRL;
		this.diemCTXH=diemCTXH;
		
	}
	public String getMadoanvien() {
		return madoanvien;
	}
	public void setMadoanvien(String madoanvien) {
		this.madoanvien = madoanvien;
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
	public String getDiemRL() {
		return diemRL;
	}
	public void setDiemRL(String diemRL) {
		this.diemRL = diemRL;
	}
	public String getDiemCTXH() {
		return diemCTXH;
	}
	public void setDiemCTXH(String diemCTXH) {
		this.diemCTXH = diemCTXH;
	}
}
