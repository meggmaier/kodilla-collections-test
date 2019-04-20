package com.kodilla.testing.collection;
import org.junit.*;

import java.util.*;



public class CollectionTestSuite {


    @Test
        public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> emptyList = exterminator.getOdd();

        //When
        ArrayList<Integer> oddsExterminated = exterminator.exterminate(numbers);

        //Then
        Assert.assertEquals(emptyList, oddsExterminated);


        }


     @Test
        public void testOddNumbersExterminatorNormalList(){

         //Given
         OddNumbersExterminator exterminator = new OddNumbersExterminator();
         ArrayList<Integer> numbers = new ArrayList<>();
         ArrayList<Integer> even = exterminator.getEven();
         for (int i = 0; i <5; i++){
                numbers.add(i);
            }

         //When
         ArrayList<Integer> oddsExterminated = exterminator.exterminate(numbers);

         //Then
         Assert.assertEquals(even, oddsExterminated);


     }


}




