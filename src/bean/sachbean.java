package bean;

public class sachbean {
	private String masach;
	private String tensach;
	private String taciga;
	private Long gia;
	private String anh;
	// phat sinh 1 ham tao co tham so
	// phat sinh 5 ham get, 5 ham set
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public String getTaciga() {
		return taciga;
	}
	public void setTaciga(String taciga) {
		this.taciga = taciga;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public sachbean(String masach, String tensach, String taciga, Long gia, String anh) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.taciga = taciga;
		this.gia = gia;
		this.anh = anh;
	}
	
}
