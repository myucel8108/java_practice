package test.day0805;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.DbConnect;

public class Ex5MysqlSearchSangpum {

	DbConnect db=new DbConnect();
	
	public void searchSangpum(String sangpum)
	{
		String sql="select * from shop where sang like ?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		
		conn=db.getMysqlConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1, "%"+sangpum+"%");
			//실행
			rs=pstmt.executeQuery();
			
			System.out.println("\t\""+sangpum+"\" 상품 검색 결과");
			System.out.println();
			System.out.println("카테고리     상품명      색상     사이즈      단가     입고일");
			System.out.println("=============================================================");
			while(rs.next())
			{
				String s=rs.getString("sang");
				String c=rs.getString("category");
				String color=rs.getString("color");
				String ssize=rs.getString("ssize");
				int p=rs.getInt("price");
				String day=rs.getString("ipgoday");
				System.out.printf("%10s%10s%10s%6s%8d%15s\n",c,s,color,ssize,p,day);
				
				count++;				
			}
			
			System.out.println("=============================================================");
			System.out.println("총 "+count+"개의 상품이 검색되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(conn, pstmt, rs);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5MysqlSearchSangpum ex=new Ex5MysqlSearchSangpum();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("검색할 상품명을 입력하세요(종료:q)");
			String sangpum=sc.nextLine();
			if(sangpum.equalsIgnoreCase("q")) {
				System.out.println("종료합니다!!!");
				break;
			}
			
			ex.searchSangpum(sangpum);
		}
	}

}
