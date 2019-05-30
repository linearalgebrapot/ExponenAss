
public class ChangedDist extends Dist{
	public int a, b;
	public Dist originDist;
	public PseudoNormalDist pnd;
	
	public ChangedDist(Dist dist, int a, int b, int sd) {
		super(dist.domain);
		
		this.a = a;
		this.b = b;
		System.out.println("ok1 in cd cons");
		this.originDist = new Dist(originDist);
		System.out.println("ok2 in cd cons");
		this.pnd = new PseudoNormalDist(10000, sd);
		System.out.println("ok3 in cd cons");
	}
	
	public void simulate(Dist dist) {
		for(int i=0;i<pointSet.length;i++) {
			pointSet[i].value = a*originDist.pointSet[i].value + b + pnd.getRandomNorVal();
			pointSet[i].y = originDist.pointSet[i].y;
		}
	}
}
