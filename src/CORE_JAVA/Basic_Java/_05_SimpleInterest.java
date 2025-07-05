package Basic_Java;

public class _05_SimpleInterest
{
	public static void main( String args[ ] )
	{
		double a, p, r ,n ,ci;

		p = 1000;//principal amount
		r = 10;//rate of interest
		n = 3;//time in year

  	    a = p * Math.pow(( 1 + ( r / 100.0 ) ), n );//final ammount after interest
  	    ci = a - p;//compoud interest

     	System.out.println( " Amount = " + String.format("%.2f", a));
		System.out.println( " Compound interest = "  + String.format("%.2f", ci) );
    }
}
