public class IceCream extends DessertItem {
	private int cost; 

	public IceCream(String name, int c){
		super(name);
		this.cost = c; 
	}

	public int getCost(){
		return this.cost; 
	}


}