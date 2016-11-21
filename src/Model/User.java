package Model;

public class User {
	private String madoanvien;
	private String hoten;
	private String password;
	private String machidoan;
	private String khoa;
	private String email;
	private String diachi;
	private String sdt;
	private String ngayvaodoan;
	private String cmnd;
	private String machucvu;
	public User() 
	{
	}
	public User(String madoanvien, String hoten, String password, String machidoan, String khoa, String email,
			String diachi, String sdt, String ngayvaodoan, String cmnd, String machucvu) {
		this.madoanvien = madoanvien;
		this.hoten = hoten;
		this.password = password;
		this.machidoan = machidoan;
		this.khoa = khoa;
		this.email = email;
		this.diachi = diachi;
		this.sdt = sdt;
		this.ngayvaodoan = ngayvaodoan;
		this.cmnd= cmnd;
		this.machucvu=machucvu;
	}
	public String getMadoanvien() {
		return madoanvien;
	}
	public void setMadoanvien(String madoanvien) {
		this.madoanvien = madoanvien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMachidoan() {
		return machidoan;
	}
	public void setMachidoan(String machidoan) {
		this.machidoan = machidoan;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getNgayvaodoan() {
		return ngayvaodoan;
	}
	public void setNgayvaodoan(String ngayvaodoan) {
		this.ngayvaodoan = ngayvaodoan;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getMachucvu() {
		return machucvu;
	}
	public void setMachucvu(String machucvu) {
		this.machucvu = machucvu;
	}
}
