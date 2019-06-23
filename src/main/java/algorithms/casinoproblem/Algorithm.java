package main.java.algorithms.casinoproblem;

public class Algorithm {

    public int countRounds(int n, int k) {
        int rounds=0;
        int wonChips=1;
        if(k==0 || n==1){
            return n-1;
        }
        do{
             if(isALLinPossible(n, k, wonChips)){
                k--;
                wonChips=wonChips*2;
                rounds++;
            }else{
                wonChips=wonChips+1;
                 rounds++;
            }
        }
        while( n != wonChips);
     return rounds;
    }

    private boolean isALLinPossible(int n, int k, int wonChips) {
        if(wonChips*2 == n && k!=0) {
            return true;
        }
        if(n - ((wonChips*2)+1) == n/2 ) {
            return true;
        }

        return false;
    }
}
