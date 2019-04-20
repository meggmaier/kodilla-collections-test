package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

        private ArrayList even = new ArrayList<Integer>();
        private ArrayList odd = new ArrayList<Integer>();

        public ArrayList<Integer> getEven(){
            return even;
        }
        public ArrayList<Integer> getOdd() {
            return odd;
        }

        public ArrayList exterminate(ArrayList<Integer> numbers) {
            int n = numbers.size();

            for (int i = 0; i < n; i++) {
                int variable = numbers.get(i);
                if (variable % 2 == 0) {
                    even.add(variable);
                } else {odd.add(variable);
                }
            }
             if(n==0) {
                 System.out.println("The list is empty.");
                    }
             return even;

        }


}





