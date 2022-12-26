package test.day0727;


//p392
class Powder{
	public void doPrinting()
	{
		System.out.println("Powder 재료로 출력한다");
	}
	public String toString()
	{
		return "재료는 Powder입니다";
	}
}
//////////////////////
class Plastic{
	public void doPrinting()
	{
		System.out.println("Plastic 재료로 출력한다");
	}
	public String toString()
	{
		return "재료는 Plastic입니다";
	}
}
////////////////////////////
class GenericPrinter<T>{
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString()
	{
		return material.toString();
	}
}
////////////////////////////////////
public class Ex4Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> g1=new GenericPrinter<>();
		g1.setMaterial(new Powder());
		Powder p=g1.getMaterial();
		System.out.println(p.toString());
		
		GenericPrinter<Plastic> g2=new GenericPrinter<>();
		g2.setMaterial(new Plastic());
		Plastic p2=g2.getMaterial();
		System.out.println(p2.toString());
	}

}








