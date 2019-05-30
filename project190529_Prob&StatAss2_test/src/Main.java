
public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
//		PseudoExponentialDist ped = new PseudoExponentialDist(1000, 100);
//		ped.simulatePseudoExponentialDist();
//		ped.showData();
		
//		PseudoErlangK2Dist pek = new PseudoErlangK2Dist(10, 1);
//		pek.simulatePseudoErlangK2Dist();
//		pek.showData();
		
		PseudoPoissonDist ppd = new PseudoPoissonDist(1000, 50);
		ppd.simulate();
		ppd.showData();
		System.out.println("--------------------------");
		ChangedDist cd = new ChangedDist(ppd, 1, 0, 5);
		System.out.println("ok1");
		cd.simulate();
		System.out.println("ok2");
		cd.showData();
		System.out.println("상관계수 : " + Dist.getCorrelationCoefficient(ppd, cd));
		
		System.out.println("");
	}

}
