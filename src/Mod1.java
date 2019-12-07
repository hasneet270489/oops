
public class Mod1 {
	
	String mod;
	int price;
	static String modelName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mod1 m = new Mod1();
       m.modelName="Swift";
       System.out.println(m.modelName);
       System.out.println(sf());
       
	}

	
	public static String sf() {
		Mod1.modelName="Maruti";
		System.out.println();
		return Mod1.modelName;
	}
}
