package main.java.algorithms.factorial;

public class Algorithm {

	public int fact(int accumulator, int n){
		
		if( n == 1 )
			return accumulator;
		
		return fact(accumulator*n, n-1);	
	}
	
	public int factorial(int n){
		return fact(1, n);
	}


	public int simpleFactorial(int n){
		if(n>0){
			return simpleFactorial(n-1)*n;
		}else{
			return 1;
		}
	}


}
