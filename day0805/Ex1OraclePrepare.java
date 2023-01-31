package test.day0805;
//Statement : sql을 완벽하게 만든후 execute할때 sql을 실행
//PreparedSatement : sql을 value을 미완성으로 만든후 statement생성시 sql을 검사
//    => ? 자리에 바인딩으로 모든 값을 준후에 마지막에 execute(sql파라미터 없음)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbConnect;

public class Ex1OraclePrepare {
	DbConnect db=new DbConnect();

	public void selectBuseo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("조회할 부서를 입력해주세요");
		String buseo=sc.nextLine();
		//인원수 검색
		int inwon=this.getBuseoCount(buseo);
		if(inwon==0) {
			System.out.println(buseo+" 부서는 없습니다");
			return;//메서드 종료
		}

		System.out.println("총 "+inwon+"명 직원 검색됨");
		String sql="select * from sawon where buseo=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//db연결
		conn=db.getOracleConnection();
		
		try {
			pstmt=conn.prepareStatement(sql);
			//?갯수만큼 바인딩
			pstmt.setString(1, buseo);
			//실행
			rs=pstmt.executeQuery();
			
			//제목부터 출력
			System.out.println("번호\t이름\t부서\t급여\t나이\t입사일");
			System.out.println("================================================");
			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String b=rs.getString("buseo");
				int pay=rs.getInt("pay");
				int age=rs.getInt("age");
				Timestamp ipsa=rs.getTimestamp("ipsaday");
				
				System.out.print(num+"\t");
				System.out.print(name+"\t");
				System.out.print(b+"\t");
				System.out.print(NumberFormat.getCurrencyInstance().format(pay)+"\t");
				System.out.print(age+"\t");
				
				System.out.println(new SimpleDateFormat("yyyy-MM-dd EEE").format(ipsa));			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(conn, pstmt, rs);
		}

	}

	public int getBuseoCount(String buseo)
	{
		int inwon=0;
		String sql="select count(*) from sawon where buseo=?";

		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//db연결
		conn=db.getOracleConnection();
		
		try {
			//pstmt
			pstmt=conn.prepareStatement(sql);//실행X 검사 O
			
			//? 갯수만큼 값을 넣어줘야 한다:바인딩
			//? 는 첫번째부터 차례대로 1,2,3...
			pstmt.setString(1, buseo);
			//실행
			rs=pstmt.executeQuery();
			if(rs.next())
				inwon=rs.getInt(1);//어차피 컬럼이 하나뿐이라 인덱스로 가져옴
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(conn, pstmt, rs);
		}		
		
		return inwon;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1OraclePrepare ex=new Ex1OraclePrepare();
		ex.selectBuseo();				
	}

}







