
public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
//		PseudoExponentialDist ped = new PseudoExponentialDist(1000, 100);
//		ped.simulatePseudoExponentialDist();
//		ped.showData();
		
//		PseudoErlangK2Dist pek = new PseudoErlangK2Dist(10, 1);
//		pek.simulatePseudoErlangK2Dist();
//		pek.showData();
		
		PseudoPoissonDist ppd = new PseudoPoissonDist(10000, 5000);
		ppd.simulate();
		ppd.showData();
		
		System.out.println("");
	}

}
