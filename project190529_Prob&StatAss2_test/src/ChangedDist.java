
public class ChangedDist extends Dist{
	public int a, b;
	public Dist originDist;
	public PseudoNormalDist pnd;
	
	public ChangedDist(Dist dist, int a, int b, int sd) {
		super(dist.domain);
		
		this.a = a;
		this.b = b;
		this.originDist = new Dist(originDist);
		this.pnd = new PseudoNormalDist(10000, sd);
	}
	
	public void simulate(Dist dist) {
		for(int i=0;i<pointSet.length;i++) {
			pointSet[i].x = a*originDist.pointSet[i].x + b + pnd.getRandomNorVal();
			pointSet[i].y = originDist.pointSet[i].y;
		}
	}
}
