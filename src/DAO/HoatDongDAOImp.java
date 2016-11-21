package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.HoatDong;

public abstract class HoatDongDAOImp implements HoatDongDAO {
	public HoatDongDAOImp()
	{
		
	}
	@Override
	public ArrayList<HoatDong> getListHoatDong(String mahoatdong) {
		Connection conn = DBConnect.getConnection();
		ResultSet rs = null;
		ArrayList<HoatDong> list = new ArrayList<HoatDong>();
		String sql = "select * from hoatdong order by mahoatdong desc";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mahoatdong);
			rs = ps.executeQuery();
			while (rs.next()) {
				String mahoatdong1 = rs.getString("mahoatdong");
				String tenhoatdong = rs.getString("tenhoatdong");
				String duyet = rs.getString("duyet");
				list.add(new HoatDong(mahoatdong1, tenhoatdong, duyet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void addHoatDong(HoatDong ac) {
		Connection conn = DBConnect.getConnection();
		String sql = "insert into hoatdong values(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ac.getMahoatdong());
			ps.setString(2, ac.getTenhoatdong());
			ps.setString(3, ac.getDuyet());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void editHoatDong(HoatDong ac) {
		Connection conn = DBConnect.getConnection();
		String sql = "update hoatdong set mahoatdong=?, noidung=? where mahoatdong=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(3, ac.getMahoatdong());
			ps.setString(1, ac.getTenhoatdong());
			ps.setString(2, ac.getDuyet());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteHoatDong(String mahoatdong) {
		Connection conn = DBConnect.getConnection();
		String sql = "delete from hoatdong where mahoatdong =?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mahoatdong);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public HoatDong getHoatDong(String mahoatdong) {
		Connection conn = DBConnect.getConnection();
		ResultSet rs = null;
		HoatDong hd = new HoatDong();
		String sql = "select * from hoatdong where duyet =?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mahoatdong);
			rs = ps.executeQuery();
			while (rs.next()) {
				String mahoatdong1 = rs.getString("mahoatdong");
				String tenhoatdong = rs.getString("tenhoatdong");
				String duyet = rs.getString("duyet");
				hd = new HoatDong(mahoatdong1, tenhoatdong, duyet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return hd;
	}

}

