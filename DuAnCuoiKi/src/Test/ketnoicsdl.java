package Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Dao.donthuocDao;
import Model.hoadonthuocModel;

public class ketnoicsdl {
private static String sql;

public static void main(String[] args) {
	
	hoadonthuocModel donthuoc = new hoadonthuocModel("24be", "n","111", "2000-12-4", "2222","TN");
	
       
    donthuocDao.getInstance().insert(donthuoc);
}
}
