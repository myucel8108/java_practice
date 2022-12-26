package test.day0725;

class Super4
{
	private String sangpum;
	private String ipgoday;
	
	public Super4() {
		
	}

	public Super4(String sangpum, String ipgoday) {
		super();
		this.sangpum = sangpum;
		this.ipgoday = ipgoday;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public void setIpgoday(String ipgoday) {
		this.ipgoday = ipgoday;
	}

	@Override
	public String toString() {
		return "Super4 [sangpum=" + sangpum + ", ipgoday=" + ipgoday + "]";
	}
}
//////////////////////////
class Shop extends Super4
{
	private String color;
	private int price;
	
	public Shop() {
		super();
	}

	public Shop(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public Shop(String sangpum, String ipgoday, String color, int price) {
		super(sangpum, ipgoday);
		this.color = color;
		this.price = price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shop [color=" + color + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
}

public class Ex4Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop []s=new Shop[3];
		s[0]=new Shop();
		s[1]=new Shop("흰색", 23000);
		s[2]=new Shop("반바지", "2022-07-25", "노랑색", 12000);
		
		System.out.println("초기값 출력");
		for(Shop shop:s)
			System.out.println(shop);//toString호출
		System.out.println();
		System.out.println("** 값 변경후 다시 출력**");
		s[0].setSangpum("자켓");
		s[0].setIpgoday("2022-10-10");
		s[0].setColor("회색");
		s[0].setPrice(34000);
		
		s[1].setSangpum("블라우스");
		s[1].setIpgoday("2022-08-01");
		
		for(Shop shop:s)
			System.out.println(shop);//toString호출
	}

}













