package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

        ArrayList even = new ArrayList<Integer>();

        public void exterminate(ArrayList<Integer> numbers) {
            int n = numbers.size();

            for ( int i=0; i<n; i++){
            int variable = numbers.get(i);
                if (variable % 2 == 0) {
                even.add(variable);
                }

                if(n==0){
                    System.out.println("The list is empty.");
                }

            }
        }


}


