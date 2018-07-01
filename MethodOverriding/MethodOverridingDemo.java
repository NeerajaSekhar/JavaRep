public class MethodOverridingDemo 

{
	public static void main(String[] args) {
		
	Plant p = new Plant();
	FloweringPlant f = new FloweringPlant();
	Mosses m = new Mosses();
	Orchid o = new Orchid();
	
	System.out.println("PLANTS");
	p.colors();
	p.smell();
	p.size();
	p.lifeSpan();
	
	
	System.out.println("\nMOSSES");	
	m.size();
	m.colors();
	m.smell();
	m.lifeSpan();	
	
	System.out.println("\nFLOWERING PLANTS");	
	f.smell();
	f.size();
	f.colors();
	f.lifeSpan();
	
	System.out.println("\nORCHIDS");	
	o.colors();
	o.size();
	o.smell();
	o.lifeSpan();
	

	}

}
