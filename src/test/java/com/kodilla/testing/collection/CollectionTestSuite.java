package com.kodilla.testing.collection;
import org.junit.*;

import java.util.*;



public class CollectionTestSuite {

    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    ArrayList numbers = new ArrayList<Integer>();
    int size = numbers.size();


    @Test
        @Before
        public void testOddNumbersExterminatorEmptyList() {

            size = 0;
            exterminator.exterminate(CollectionTestSuite.this.numbers);

        }


        @After
        public void testOddNumbersExterminatorNormalList(){

                Random random = new Random();
            for(int i=0; i < 15; i++){
                numbers.add(random.nextInt(16));
            }
            exterminator.exterminate(CollectionTestSuite.this.numbers);
        }


}




