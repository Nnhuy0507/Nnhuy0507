package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.sql.Date;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import Controller.qlthuocController;
import Model.danhmucspModel;
import Model.hoadonthuocModel;
import Model.quanlikhothuoc;
import Model.thongtinnguoidungModel;

public class qlthuoc {
		public hoadonthuocModel model;
		public quanlikhothuoc model2;
		public danhmucspModel model4;
		public thongtinnguoidungModel model3;
		public qlthuoc() {
		 JFrame frame = new JFrame("Thông tin");
		    frame.setSize(900, 700);
		    frame.setLocationRelativeTo(null);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    JPanel container = new JPanel(new CardLayout());

		    JPanel panel1 = createPanel1();
		    JPanel panel2 = createPanel2();
		    JPanel panel3 = createPanel3();
		    JPanel panel4 = createPanel4();

		    container.add(panel1, "panel1");
		    container.add(panel2, "panel2");
		    container.add(panel3, "panel3");
		    container.add(panel4, "panel4");

		    JMenuBar menuBar = new JMenuBar();
		    JMenu menu = new JMenu("Menu");

		    JMenuItem menuItem1 = new JMenuItem("Quản lí kho thuốc");
		    menuItem1.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel1");
		        }
		    });
		    menu.add(menuItem1);

		    JMenuItem menuItem2 = new JMenuItem("Danh mục nhóm thuốc");
		    menuItem2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel2");
		        }
		    });
		    menu.add(menuItem2);
		    
		    JMenuItem menuItem3 = new JMenuItem("Đơn thuốc");
		    menuItem3.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel3");
		        }
		    });
		    menu.add(menuItem3);
		    
		    JMenuItem menuItem4 = new JMenuItem("Người dùng ");
		    menuItem4.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel4");
		        }
		    });
		    menu.add(menuItem4);

		    menuBar.add(menu);
		    frame.setJMenuBar(menuBar);
		    frame.add(container);
		    frame.setVisible(true);
		    }
//		 ActionListener ac = new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//			};
		ActionListener ac = new qlthuocController(this);
public JTextField jt_solohang;
public JTextField jt_ngaynhapkho;
public JTextField jt_ngayhethan;
public JTextField jt_soluong;
public JTextField jt_nhacungcap;
public JTextField jt_manhom;
public JTextField jt_ghichu;
public JTextField jt_madonthuoc;
public JTextField jt_tensp;
public JTextField jt_hansudung;
public JTextField jt_cachsudung;
public JTextField jt_hovaten;
public JTextField jt_ngaysing;
public JTextField jt_sdt;
public JTextField jt_diachi;
public JTextField jt_tennhom;
private JTable jt_quanlikho;
private JTable jt_quanlinhom;
private JTable jt_donthuoc;
private JTable jt_thongtinnguoidung;
private JTextField jt_soluong1;
public JTextField jt_manguoidung;
public JTextField jt_manguoidung1;

		    private JPanel createPanel1() {
		    	JPanel panel1 = new JPanel();
		    	panel1.setLayout(new BorderLayout());
		    	panel1.setBackground(new Color(204, 229, 255));
		    	
		JPanel Jp_tren = new JPanel();
		    		Jp_tren.setLayout(new GridLayout(5,2,50,10));
		    		Border border = BorderFactory.createLineBorder(Color.gray, 2);
		    		Jp_tren.setBorder(border);

		    		
		    		JLabel jl_solohang = new JLabel("Số lô hàng ");
		    	    jt_solohang = new JTextField();

		    	    JLabel jl_ngaynhapkho = new JLabel("Ngày nhập kho ");
		    	    jt_ngaynhapkho = new JTextField();

		    	    JLabel jl_ngayhethan = new JLabel("Ngày hết hạn");
		    	    jt_ngayhethan = new JTextField();

		    	    JLabel jl_soluong = new JLabel("Số lượng ");
		    	    jt_soluong = new JTextField();

		    	    JLabel jl_nhacungcap = new JLabel("Nhà cung cấp ");
		    	    jt_nhacungcap = new JTextField();
		    	
		    	    Jp_tren.add(jl_solohang);
		    	    Jp_tren.add(jt_solohang);

		    	    Jp_tren.add(jl_ngaynhapkho);
		    	    Jp_tren.add(jt_ngaynhapkho);

		    	    Jp_tren.add(jl_ngayhethan);
		    	    Jp_tren.add(jt_ngayhethan);

		    	    Jp_tren.add(jl_soluong);
		    	    Jp_tren.add(jt_soluong);

		    	    Jp_tren.add(jt_nhacungcap);
		    	    Jp_tren.add(jl_nhacungcap);
		    	   // Jp_tren.add(jt_nhacungcap);

		    	    JPanel Jp_giua = new JPanel();
		    	    //Jp_giua.setForeground(new Color(71, 117, 49));
		    	    //Jp_giua.setBackground(new Color(204, 229, 255));
		    	    Jp_giua.setBackground(new Color(204, 204, 255));
		    		
		    		JButton jb_them = new JButton("Thêm");
		    		jb_them.addActionListener(ac);
		    		JButton jb_sua = new JButton("Sửa");
		    		jb_sua.addActionListener(ac);
		    		JButton jb_xoa = new JButton("Xóa");
		    		jb_xoa.addActionListener(ac);
		    		JButton jb_luu = new JButton("Lưu ");
		    		jb_luu.addActionListener(ac);
		    		
		    		//JTextField jt_tim = new JTextField();
		    		JButton jb_tim = new JButton("Tìm ");
		    		jb_tim.addActionListener(ac);
		    		
		    		
		    		Jp_giua.add(jb_them);
		    		Jp_giua.add(jb_sua);
		    		Jp_giua.add(jb_xoa);
		    		Jp_giua.add(jb_luu);
		    		
		    		//Jp_giua.add(jt_tim,BorderLayout.SOUTH);
		    		Jp_giua.add(jb_tim);
		    		
		    		JPanel Jp_duoi = new JPanel(new BorderLayout());
		    	
		    		Object[][] data = {
		                    {"", "", "","",""},      
		            };
		    		 String[] columnNames = {"Số lô hàng", "Ngày nhập kho", "Ngày hết hạn", "Số lượng", "Nhà cung cấp"};
		    		 JTable jt_quanlikho = new JTable(data, columnNames);
//		    		String[] columnNames = {"Số lô hàng", "Ngày nhập kho", "Ngày hết hạn", "Số lượng", "Nhà cung cấp"};
//		    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//		    		jt_quanlikho = new JTable(model);
//		    		Object[] data = {"", "", "","", "", ""};
//		    		model.addRow(data);
		    		
		    		JScrollPane jscoll = new JScrollPane(jt_quanlikho);
		    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		    		Jp_duoi.setBorder(border);
		    		
		    		Jp_duoi.add(jscoll,BorderLayout.CENTER);
		    		
		    		panel1.add(Jp_tren,BorderLayout.NORTH);
		    		panel1.add(Jp_giua,BorderLayout.CENTER);
		    		panel1.add(Jp_duoi,BorderLayout.SOUTH);
		    		
		    		panel1.setVisible(true);
					return panel1;
		    		}
		    
//panel2
		    private JPanel createPanel2() {
		    	JPanel panel2 = new JPanel();
		    	panel2.setLayout(new BorderLayout());
		        
//                 ActionListener ac = new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						
//					}
//				};
		        JLabel jl_donthuoc = new JLabel();
		        Font fontDT = new Font("Arial", Font.BOLD, 25);
		        jl_donthuoc.setFont(fontDT);
		        panel2.add(jl_donthuoc, BorderLayout.NORTH);

		        JPanel Jp_tren = new JPanel();
		        Jp_tren.setLayout(new GridLayout(7, 2, 50, 20));
		        Border border = BorderFactory.createLineBorder(Color.gray, 2);
		        Jp_tren.setBorder(border);
		        

		        Jp_tren.setLayout(new GridLayout(3,2,50,10));
	    		Border border1 = BorderFactory.createLineBorder(Color.gray, 2);
	    		Jp_tren.setBorder(border1);

	    		
	    		JLabel jl_manhom = new JLabel("Mã nhóm ");
	    		jt_manhom = new JTextField();
	    		
	    		JLabel jl_tennhom = new JLabel("Tên nhóm");
	    		jt_tennhom = new JTextField();
	    		
	    		JLabel jl_ghichu = new JLabel("Ghi chú");
	    		jt_ghichu = new JTextField();
	    		
	    		Jp_tren.add(jl_manhom);
	    		Jp_tren.add(jt_manhom);
	    		
	    		Jp_tren.add(jl_tennhom);
	    		Jp_tren.add(jt_tennhom);
	    		
	    		Jp_tren.add(jl_ghichu);
	    		Jp_tren.add(jt_ghichu);
	    		
	    		
	    		JPanel Jp_giua = new JPanel();
	    		//Jp_giua.setForeground(new Color(71, 117, 49));
	    		Jp_giua.setBackground(new Color(204, 204, 255));
	    		
	    		JButton jb_them = new JButton("Thêm");
	    		jb_them.addActionListener(ac);
	    		JButton jb_sua = new JButton("Sửa");
	    		jb_sua.addActionListener(ac);
	    		JButton jb_xoa = new JButton("Xóa");
	    		jb_xoa.addActionListener(ac);
	    		JButton jb_luu = new JButton("Lưu ");
	    		jb_luu.addActionListener(ac);
	    		JButton jb_tim = new JButton("Tìm ");
	    		jb_tim.addActionListener(ac);
	    		
	    		Jp_giua.add(jb_them);
	    		Jp_giua.add(jb_sua);
	    		Jp_giua.add(jb_xoa);
	    		Jp_giua.add(jb_luu);
	    		Jp_giua.add(jb_tim);
	    		
	    		JPanel Jp_duoi = new JPanel(new BorderLayout());
	    		
	    		String[] columnNames = {"Mã nhóm", "Tên nhóm","Ghi chú"};
	    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	    		jt_quanlinhom = new JTable(model);
	    		Object[] data = {"b", "b", "b","b", "b", "b"};
	    		model.addRow(data);
	    		
	    		JScrollPane jscoll = new JScrollPane(jt_quanlinhom);
	    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		Jp_duoi.setBorder(border);
	    		
	    		Jp_duoi.add(jscoll,BorderLayout.CENTER);
	    		
	    		panel2.add(Jp_tren,BorderLayout.NORTH);
	    		panel2.add(Jp_giua,BorderLayout.CENTER);
	    		panel2.add(Jp_duoi,BorderLayout.SOUTH);
	    		
	    		panel2.setVisible(true);
		        
		        return panel2;
		    
		}
//panel 3
		    private JPanel createPanel3() {
		    	JPanel panel3 = new JPanel();
		    	panel3.setLayout(new BorderLayout());
		        
//                 ActionListener ac = new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						
//					}
//				};
				JPanel Jp_tren = new JPanel();
	    		Jp_tren.setLayout(new GridLayout(6,2,50,10));
	    		Border border = BorderFactory.createLineBorder(Color.gray, 2);
	    		Jp_tren.setBorder(border);

	    		
	    		JLabel jl_madonthuoc = new JLabel("Mã đơn thuốc ");
	    		jt_madonthuoc = new JTextField();
	    		
	    		JLabel jl_tensp = new JLabel("Tên sp ");
	    		jt_tensp = new JTextField();
	    		
	    		JLabel jl_soluong = new JLabel("Số lượng ");
	    		jt_soluong1 = new JTextField();
	    		
	    		JLabel jl_hansudung = new JLabel("Hạn sử dụng");
	    		jt_hansudung = new JTextField();
	    		
	    		JLabel jl_cachsudung = new JLabel("Cách sử dụng");
	    		jt_cachsudung  = new JTextField();
	    		
	    		JLabel jl_manguoidung11 = new JLabel("Cách sử dụng");
	    		jt_manguoidung1  = new JTextField();
	    	
	    		Jp_tren.add(jl_madonthuoc);
	    		Jp_tren.add(jt_madonthuoc);
	    		
	    		Jp_tren.add(jl_tensp);
	    		Jp_tren.add(jt_tensp);
	    		
	    		Jp_tren.add(jl_soluong);
	    		Jp_tren.add(jt_soluong);
	    		
	    		Jp_tren.add(jl_hansudung);
	    		Jp_tren.add(jt_hansudung);
	    		
	    		Jp_tren.add(jl_cachsudung);
	    		Jp_tren.add(jt_cachsudung);
	    		
	    		Jp_tren.add(jl_manguoidung11);
	    		Jp_tren.add(jt_manguoidung1);
	    		
	    		JPanel Jp_giua = new JPanel();
	    		//Jp_giua.setForeground(new Color(71, 117, 49));
	    		Jp_giua.setBackground(new Color(204, 204, 255));
	    		
	    		JButton jb_them = new JButton("Thêm");
	    		jb_them.addActionListener(ac);
	    		JButton jb_sua = new JButton("Sửa");
	    		jb_sua.addActionListener(ac);
	    		JButton jb_xoa = new JButton("Xóa");
	    		jb_xoa.addActionListener(ac);
	    		JButton jb_luu = new JButton("Lưu ");
	    		jb_luu.addActionListener(ac);
	    		JButton jb_tim = new JButton("Tìm ");
	    		jb_tim.addActionListener(ac);
	    		
	    		Jp_giua.add(jb_them);
	    		Jp_giua.add(jb_sua);
	    		Jp_giua.add(jb_xoa);
	    		Jp_giua.add(jb_luu);
	    		Jp_giua.add(jb_tim);
	    		
	    		JPanel Jp_duoi = new JPanel(new BorderLayout());
	    		
	    		String[] columnNames = {"Mã đơn thuốc", "Tên sp", "Số lượng", "Hạn sử dụng", "Cách sử dụng","Mã người dùng"};
	    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	    		jt_donthuoc = new JTable(model);
	    		Object[] data = {"v", "v", "v","v", "v", "v"};
	    		model.addRow(data);
	    		
	    		JScrollPane jscoll = new JScrollPane(jt_donthuoc);
	    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		Jp_duoi.setBorder(border);
	    		
	    		Jp_duoi.add(jscoll,BorderLayout.CENTER);
	    		
	    		panel3.add(Jp_tren,BorderLayout.NORTH);
	    		panel3.add(Jp_giua,BorderLayout.CENTER);
	    		panel3.add(Jp_duoi,BorderLayout.SOUTH);
	    		
	    		panel3.setVisible(true);
				return panel3;
		    	
		    }
//panel 4		    
		    private JPanel createPanel4() {
		    	JPanel panel4 = new JPanel();
		    	panel4.setLayout(new BorderLayout());
		        
//                 ActionListener ac = new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						
//					}
//				};
				JPanel Jp_tren = new JPanel();
	    		Jp_tren.setLayout(new GridLayout(5,2,50,10));
	    		Border border = BorderFactory.createLineBorder(Color.gray , 2);
	    		Jp_tren.setBorder(border);

	    		
	    		JLabel jl_hovaten = new JLabel("Tên");
	    		jt_hovaten = new JTextField();
	    		
	    		JLabel jl_ngaysing = new JLabel("Ngày sinh ");
	    		jt_ngaysing = new JTextField();
	    		
	    		JLabel jl_sdt = new JLabel("Số điện thoại");
	    		jt_sdt = new JTextField();
	    		
	    		JLabel jl_diachi = new JLabel("Địa chỉ");
	    		jt_diachi = new JTextField();
	    		
	    		JLabel jl_manguoidung = new JLabel("Mã người dùng ");
	    		jt_manguoidung = new JTextField();
	   
	    		Jp_tren.add(jl_manguoidung);
	    		Jp_tren.add(jt_manguoidung);
	    		
	    		Jp_tren.add(jl_hovaten);
	    		Jp_tren.add(jt_hovaten);
	    		
	    		Jp_tren.add(jl_ngaysing);
	    		Jp_tren.add(jt_ngaysing);
	    		
	    		Jp_tren.add(jl_sdt);
	    		Jp_tren.add(jt_sdt);
	    		
	    		Jp_tren.add(jl_diachi);
	    		Jp_tren.add(jt_diachi);
	    		
	    		
	    		JPanel Jp_giua = new JPanel();
	    		//Jp_giua.setForeground(new Color(71, 117, 49));
	    		Jp_giua.setBackground(new Color(204, 204, 255));
	    		
	    		JButton jb_them = new JButton("Thêm");
	    		jb_them.addActionListener(ac);
	    		JButton jb_sua = new JButton("Sửa");
	    		jb_sua.addActionListener(ac);
	    		JButton jb_xoa = new JButton("Xóa");
	    		jb_xoa.addActionListener(ac);
	    		JButton jb_luu = new JButton("Lưu ");
	    		jb_luu.addActionListener(ac);
	    		JButton jb_tim = new JButton("Tìm ");
	    		jb_tim.addActionListener(ac);
	    		
	    		Jp_giua.add(jb_them);
	    		Jp_giua.add(jb_sua);
	    		Jp_giua.add(jb_xoa);
	    		Jp_giua.add(jb_luu);
	    		Jp_giua.add(jb_tim);
	    		
	    		JPanel Jp_duoi = new JPanel(new BorderLayout());
	    		
	    		String[] columnNames = {"Mã người dùng","Họ và tên", "Ngày sinh", "Số điện thoại", "Địa chỉ"};
	    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	    		jt_thongtinnguoidung = new JTable(model);
	    		Object[] data = {"a", "a", "a","a", "a", "a","a"};
	    		model.addRow(data);
	    		
	    		JScrollPane jscoll = new JScrollPane(jt_thongtinnguoidung);
	    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		Jp_duoi.setBorder(border);
	    		
	    		Jp_duoi.add(jscoll,BorderLayout.CENTER);
	    		
	    		panel4.add(Jp_tren,BorderLayout.NORTH);
	    		panel4.add(Jp_giua,BorderLayout.CENTER);
	    		panel4.add(Jp_duoi,BorderLayout.SOUTH);
	    		
	    		panel4.setVisible(true);
				return panel4;
		    	
		    }

			public void xoaForm() {
				jt_solohang.setText("");
				jt_ngaynhapkho.setText("");
				jt_ngayhethan.setText("");
				jt_soluong.setText("");
				jt_nhacungcap.setText("");
				
				
				jt_manhom.setText("");
				jt_tennhom.setText("");
				jt_ghichu.setText("");
				
				jt_madonthuoc.setText("");
				jt_tensp.setText("");
				jt_soluong1.setText("");
				jt_hansudung.setText("");
				jt_cachsudung.setText("");
				
				jt_manguoidung.setText("");
				jt_hovaten.setText("");
				jt_ngaysing.setText("");
				jt_sdt.setText("");
				jt_diachi.setText("");
			}


			
			public void them(thongtinnguoidungModel nguoidung) {
				this.model3.insert3(nguoidung);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_thongtinnguoidung.getModel();

	    		String hovaten = nguoidung.getHovaten()+"";	
                        model_table.addRow(new Object[] {
                        nguoidung.getManguoidung()+"",
	    				nguoidung.getHovaten()+"",
	    				nguoidung.getDiachi()+"",
	    				nguoidung.getSdt()+"",
	    				(nguoidung.getNgaysinh().getYear()+1900)+"-"+(nguoidung.getNgaysinh().getMonth()+1)+"-"+(nguoidung.getNgaysinh().getDay())});
}
			
			public void them(hoadonthuocModel donthuoc) {
				this.model.insert1(donthuoc);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_donthuoc.getModel();	
                        model_table.addRow(new Object[] {
                        donthuoc.getMadonthuoc()+"",
                        donthuoc.getTensp()+"",
                        donthuoc.getSoluong()+"",
                        donthuoc.getHdsudung()+"",
                        donthuoc.getManguoidung1()
	    				});
			}
			
			public void them(quanlikhothuoc kho) {
				this.model2.insert2(kho);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_quanlikho.getModel();	
                        model_table.addRow(new Object[] {
                        kho.getSolohang()+"",
                        kho.getNgaynhapkho()+"",
                        kho.getNgayhethan()+"",
                        kho.getSoluong()+"",
                        kho.getNhacungcap()
	    				});
			}
			
			public void them(danhmucspModel danhmuc) {
				this.model4.insert4(danhmuc);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_quanlinhom.getModel();	
                        model_table.addRow(new Object[] {
                        danhmuc.getManhom()+"",
                        danhmuc.getTennhom()+"",
                        danhmuc.getGhichu()
	    				});
			}
			
			
			public void sua(danhmucspModel danhmuc) {
				// TODO Auto-generated method stub
				
			}
			
			public void sua(quanlikhothuoc kho) {
				// TODO Auto-generated method stub
				
			}
			
			public void sua(thongtinnguoidungModel nguoidung) {
				// TODO Auto-generated method stub
				
			}
			
			public void sua(hoadonthuocModel donthuoc) {
				// TODO Auto-generated method stub
				
			}

			public void hienthithongtinDaChon(thongtinnguoidungModel nguoidung) {
				DefaultTableModel table_model =(DefaultTableModel) jt_thongtinnguoidung.getModel();
				int i_row = jt_thongtinnguoidung.getSelectedRow();
				
				String hovaten = String.valueOf(table_model.getValueAt(i_row, 0)+"");
    		    Date ngaysinh = Date.valueOf(table_model.getValueAt(i_row, 2)+"");
        		String sdt = String.valueOf(table_model.getValueAt(i_row, 3)+"");
        		String diachi = String.valueOf(table_model.getValueAt(i_row, 4)+"");
        		
        		this.jt_hovaten.setText(hovaten+"");
        		this.jt_ngaysing.setText(ngaysinh+"");
        		this.jt_sdt.setText(sdt+"");
        		this.jt_diachi.setText(diachi+"");
			}
			
			public void hienthithongtinDaChon(quanlikhothuoc kho) {
				DefaultTableModel table_model =(DefaultTableModel) jt_quanlikho.getModel();
				int i_row = jt_thongtinnguoidung.getSelectedRow();
				int solohang = Integer.valueOf(table_model.getValueAt(i_row, 0)+"");
        		Date ngaynhapkho = Date.valueOf(table_model.getValueAt(i_row, 1)+"");
        		Date ngayhethan = Date.valueOf(table_model.getValueAt(i_row, 2)+"");
        		int soluong = Integer.valueOf(table_model.getValueAt(i_row, 3)+"");
        		String nhacungcap = String.valueOf(table_model.getValueAt(i_row, 4)+"");
        		
        		this.jt_solohang.setText(solohang+"");
        		this.jt_ngaynhapkho.setText(ngaynhapkho+"");
        		this.jt_ngayhethan.setText(ngaynhapkho+"");
        		this.jt_soluong.setText(soluong +"");
        		this.jt_nhacungcap.setText(nhacungcap+"");
			}
			
			public void hienthithongtinDaChon(danhmucspModel danhmuc) {
				DefaultTableModel table_model =(DefaultTableModel) jt_quanlinhom.getModel();
				int i_row = jt_thongtinnguoidung.getSelectedRow();
        		String manhom = String.valueOf(table_model.getValueAt(i_row, 0)+"");
        		String tennhom = String.valueOf(table_model.getValueAt(i_row, 1)+"");
        		String ghichu = String.valueOf(table_model.getValueAt(i_row, 2)+"");
        		
        		this.jt_manhom.setText(tennhom+"");
        		this.jt_tennhom.setText(tennhom+"");
        		this.jt_ghichu.setText(ghichu+"");
     
			}
//            public Benhnhan getdsdonthuoc(int i_row) {
//            	
//            }
			public void hienthithongtinDaChon(hoadonthuocModel donthuoc) {
				DefaultTableModel table_model =(DefaultTableModel) jt_donthuoc.getModel();
				int i_row = jt_donthuoc.getSelectedRow();
		   		String madonthuoc = String.valueOf(table_model.getValueAt(i_row, 0)+"");
        		String tensp = String.valueOf(table_model.getValueAt(i_row, 1)+"");
        		String soluong1 = String.valueOf(table_model.getValueAt(i_row, 3)+"");
        		Date hansudung = Date.valueOf(table_model.getValueAt(i_row, 4)+"");
        		String hdsudung = String.valueOf(table_model.getValueAt(i_row, 5)+"");
        		String manguoidung1 = String.valueOf(table_model.getValueAt(i_row, 6)+"");
        		
        		this.jt_madonthuoc.setText(madonthuoc+"");
        		this.jt_tensp.setText(tensp+"");
        		this.jt_soluong1.setText(soluong1+"");
        		this.jt_hansudung.setText(hansudung+"");
        		this.jt_cachsudung.setText(hdsudung+""); 
        		this.jt_manguoidung1.setText(manguoidung1+"");

			}	

			public void thuchienxoa() {
				DefaultTableModel model_table =(DefaultTableModel) jt_donthuoc.getModel();	
               int i_row = jt_donthuoc.getSelectedRow();
               int luachon = JOptionPane.showConfirmDialog(jt_donthuoc, "Bạn có chắc chắn muốn xóa");
				if(luachon==JOptionPane.YES_NO_OPTION) {
//					this.model.delete1(dsdonthuoc);
				}
			}
}