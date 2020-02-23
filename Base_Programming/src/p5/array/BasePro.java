package p5.array;
public class BasePro
{
    public static void main(String[] args) {

        //copy of array(inbuilt)
        int ar[]={'1','2','3','4','5'};
        int br[]=ar.clone();
        for(int a:br)
        {
           System.out.print(a-48+" ");//a-ASII value(48) because 1 is 49...
        }
        //copy of array
        int ar1[]={'1','2','3','4','5'};
       // int br1[ar1.length];
        for(int a:br)
        {
           System.out.print(a-48+" ");//a-ASII value(48) because 1 is 49...
        }
    }
}