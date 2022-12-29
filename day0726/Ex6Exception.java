package test.day0726;

public class Ex6Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,6,8,10};
		for(int i=0;i<=arr.length;i++) {
			try {
				System.out.println(arr[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("배열 범위를 벗어났어요!:"+e.getMessage());
				//e.printStackTrace();//에러 추적-라인번호 출력
			}
		}
		
		System.out.println("**정상종료 **");
	}

}
