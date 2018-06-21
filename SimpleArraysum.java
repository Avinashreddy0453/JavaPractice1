
public class SimpleArraysum {
	int m1() {
		int[]x= {2,7,23,56,12,12};
		int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
	}
      return sum;  
	}
	public static void main(String[] args) {
		SimpleArraysum s=new SimpleArraysum();
		
		System.out.println(s.m1());
    }

		
}

 
