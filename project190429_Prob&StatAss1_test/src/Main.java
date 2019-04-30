
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PseudoExponentialDist ped = new PseudoExponentialDist(100000, 30);
		
		//ped.simulatePseudoExponentialDist();
		//ped.showData();
		PseudoErlangK2Dist pek = new PseudoErlangK2Dist(1000, 20);
		pek.simulatePseudoErlangK2Dist();
		pek.showData();
		
		System.out.println("");
	}

}
