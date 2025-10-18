package Oops;

public class Poly {
class Cricket {
	public void Cricket2025 () {
		System.out.println("Cricketers in 2025 of all formats");
	}
}

class Batsman extends Cricket {
    private String name;
    public Batsman(String name) {
        this.name = name;
    }
    public void Cricket2025 () {
        System.out.println("Batsman: " + name);
    }
}

class Boller extends Cricket {
		private String name;
		public Boller(String name) {
			this.name = name;
		}
		public void Cricket2025 () {
		System.out.println("Boller: " + name);
}
}

class fielder extends Cricket {
	
	private String name;
	public fielder(String name) {
		this.name = name;
	}
	public void Cricket2025 () {
		System.out.println("Fielder: " + name);
	}
}

class AllRounders extends Cricket {
	private String name;
	public AllRounders(String name) {
		this.name = name;
	}
	public void Cricket2025 () {
		System.out.println("AllRounders: " + name);
	}
}

public static void main(String[] args) {
	
	Poly poly = new Poly();
	Cricket myCricket = poly.new Cricket();
	Cricket IndiaBatsman = poly.new Batsman("S Gill");
	Cricket IndiaBoller = poly.new Boller("p Krishna");
	Cricket Indiafielder = poly.new fielder("Jadaja");
	Cricket IndiaAllRounders = poly.new AllRounders("NK Reddy");
	
	
	myCricket.Cricket2025();
	IndiaBatsman.Cricket2025();
	IndiaBoller.Cricket2025();
	Indiafielder.Cricket2025();
	IndiaAllRounders.Cricket2025();
	
}
 }
