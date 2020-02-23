package p5.array;

public class ElementBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Element base Arithmetic opration...

		int ar[]={'1','2','3','4','5'};
		int sum =1,sub=0;
		for (int i = 0; i < ar.length; i++) {
			if (i%2==0) {
				sum=sum+i;			
			} else {
                 sub=sub+i;
			}
			
		}
		System.out.println(sum+" "+sub);
	}

}
