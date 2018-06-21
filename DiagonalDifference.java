public class DiagonalDifference{
	public static void main(String[] args) {
		int x[][]= {{11,2,4},{4,5,6},{10,8,-12}};
		int d1=0,d2=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
				if(i==j) {
					d1=d1+x[i][j];
					
				}
			if(i+j==2) {
			d2=d2+x[i][j];
		}

}
		}
		System.out.println(Math.abs(d1-d2));
	}
}

	    
	    

