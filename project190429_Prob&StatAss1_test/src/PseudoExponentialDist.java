import java.util.Random;

public class PseudoExponentialDist extends Dist{
	public static final int REAPEAT = 10000;
	public int ramda;
	public double prob;
	public int[] recordEachInterval;
	
	public PseudoExponentialDist(int domain, int ramda) { //도메인 1000, 람다 4
		super(domain);
		this.ramda = ramda;
		this.prob = ramda/domain;
		recordEachInterval = new int[domain];
		
		for(int i=0;i<this.recordEachInterval.length;i++) {
			this.recordEachInterval[i] = 0;
		}
	}
	
	public void simulatePseudoExponentialDist() {
		 //0 ~ domain-1 중에서 난수 하나 뽑아서 그 난수가 람다보다 작다면 success!
		int i=0, j=0;
		int firstSuccess;
		int secondSuccess;
		
		for(i=0;i<REAPEAT;i++) {
			Random rnd = new Random();
			firstSuccess = 0;
			secondSuccess = 0;
			int tmp1, tmp2;
			for(j=0;j<domain;j++) {
				int isThisSuccess = rnd.nextInt(domain);
				//System.out.println(j + "th : " + isThisSuccess);
				if(isThisSuccess < ramda && firstSuccess == 0) { //관측이 성공 && 아직 성공 X
					firstSuccess = j;
					//tmp
				}
				
				else if(isThisSuccess < ramda && firstSuccess != 0) { //관측이 성공 && 이미 한 번 성공
					if(firstSuccess == 0)
						System.out.println("??? : " + secondSuccess + "  " + firstSuccess);
					secondSuccess = j;
					break;
				}
			}
			//System.out.println("세 번째 성공이 관측된 직후 : " + Success + "  " + secondSuccess + "  " + firstSuccess);
			if(secondSuccess - firstSuccess < 0) {
				System.out.println("At " + i + "th repeat, " +  j + "th try, Something went wrong");
				System.out.println(secondSuccess + " - " + firstSuccess + " = " + (secondSuccess - firstSuccess));
				//System.exit(0);
			}
			if(secondSuccess != 0) {
				//System.out.println("At " + i + "th repeat, " + (secondSuccess - firstSuccess));
				this.recordEachInterval[secondSuccess - firstSuccess]++;
			}
		}
		double m=0;
		double p=0;
		for(i=0;i<this.pointSet.length;i++) {
			this.pointSet[i].x = i;
			this.pointSet[i].value = (double)i/domain;
			this.pointSet[i].y = (double)(this.recordEachInterval[i])/REAPEAT;
			
			if(this.pointSet[i].y != 0) {
				//System.out.println("(" + pointSet[i].x + ", " + pointSet[i].y + ") : " + pointSet[i].value);
				m = m + (this.pointSet[i].value*this.pointSet[i].y);	
				//System.out.println((this.pointSet[i].value*this.pointSet[i].y) + "를 더해서 " + m + "이 되었다.");
				p += pointSet[i].y;
			}
		}
		//System.out.println(m);
		//System.out.println(p);
		
			
	}
}
