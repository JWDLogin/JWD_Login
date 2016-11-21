package Model;

public class CT_HoatDong {
	private String mahoatdong;
	private String tenhoatdong;
	private String thoigianbatdau;
	private String thoigianketthuc;
	private String diadiem;
	private String diemRL;
	private String diemCTXH;

	public CT_HoatDong() {
	}

	public CT_HoatDong(String mahoatdong, String tenhoatdong, String thoigianbatdau, String thoigianketthuc, String diadiem, String diemRL, String diemCTXH) {
		this.mahoatdong = mahoatdong;
		this.tenhoatdong = tenhoatdong;
		this.thoigianbatdau = thoigianbatdau;
		this.thoigianketthuc = thoigianketthuc;
		this.diadiem = diadiem;
		this.diemRL= diemRL;
		this.diemCTXH= diemCTXH;
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

	public String getThoigianbatdau() {
		return thoigianbatdau;
	}

	public void setThoigianbatdau(String thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}

	public String getThoigianketthuc() {
		return thoigianketthuc;
	}

	public void setThoigianketthuc(String thoigianketthuc) {
		this.thoigianketthuc = thoigianketthuc;
	}

	public String getDiadiem() {
		return diadiem;
	}

	public void setDiadiem(String diadiem) {
		this.diadiem = diadiem;
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