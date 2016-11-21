package DAO;

import java.util.ArrayList;

import Model.HoatDong;

public interface HoatDongDAO {
	public ArrayList<HoatDong> getListHoatDong(String mahoatdong);

	public void addHoatDong(HoatDong ac);

	public void editHoatDong(HoatDong ac);

	public void deleteHoatDong(String mahoatdong);

	public HoatDong getHoatDong(String mahoatdong);

	public ArrayList<HoatDong> getList(ArrayList<HoatDong> ac, String  mahoatdong);
}

