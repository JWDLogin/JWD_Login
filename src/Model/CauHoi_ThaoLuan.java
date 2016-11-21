package Model;

public class CauHoi_ThaoLuan {
	private String macauhoi;
	private String noidung;
	private String nguoihoi;
	
	public CauHoi_ThaoLuan() 
	{
	}
	public CauHoi_ThaoLuan(String macauhoi, String noidung, String nguoihoi) {
		this.macauhoi = macauhoi;
		this.noidung = noidung;
		this.nguoihoi = nguoihoi;
		
	}
	public String getMacauhoi() {
		return macauhoi;
	}
	public void setMacauhoi(String macauhoi) {
		this.macauhoi = macauhoi;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getNguoihoi() {
		return nguoihoi;
	}
	public void setNguoihoi(String nguoihoi) {
		this.nguoihoi = nguoihoi;
	}
}
