package Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import Model.hoadonthuocModel;
import Database.JDBCtil;

public class donthuocDao implements daoInterface<hoadonthuocModel>{

	public static donthuocDao getInstance() {
		return new donthuocDao();
	}

	public String sql;
	
	
	@Override
	public int insert(hoadonthuocModel t) {
		//Tạo kết nối cơ sở dữ liệu
		try{
		Connection con = JDBCtil.getConnection();
		
	    Statement st = con.createStatement();
		
//	    String sql = "INSERT INTO hoadonthuoc (madonthuoc,tensp, soluong, hansudung, hdsudung, manguoidung) " +
//	             "VALUES ('" + t.getMadonthuoc() + "', '" + t.getTensp() + "', '" + t.getSoluong1() + "', '" +
//	             t.getHansudung() + "', '" + t.getHdsudung() + "', '" + t.getManguoidung1() + "')";
	    sql = "INSERT INTO hoadonthuoc (madonthuoc,tensp, soluong, hansudung, hdsudung, manguoidung) " +
	             "VALUES ('" + t.getMadonthuoc() + "', '" + t.getTensp() + "', '" + t.getSoluong1() + "', '" +
	             t.getHansudung() + "', '" + t.getHdsudung() + "', '" + t.getManguoidung1() + "')";
    
        
        int ketqua = st.executeUpdate(sql);
        
        System.out.println("Bạn đã thực thi  " + sql);
        System.out.println("Có  "+ketqua + "dòng bị thay đổi");

        JDBCtil.closeConnection(con);
        
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
       return 0;
	}

	@Override
	public int update(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int timkiem(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public hoadonthuocModel selectByid(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<hoadonthuocModel> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<hoadonthuocModel> selectBycondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
