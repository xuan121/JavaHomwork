package com.bayamp.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringReverseTests {

        @Test
        public void postiveTest(){

                String inputString = "One Two Three Four";
                String expectedOutPut = "Four Three Two One";

                String actualOutPut = BayAmpUtils.reverse(inputString);

                //Valiations
                //System.out.println(actualOutPut);
                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

        @Test
        public void nullTest(){

                String inputString = null;
                String expectedOutPut = null;

                String actualOutPut = BayAmpUtils.reverse(inputString);

                //Valiations

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

        @Test
        public void emptySpaceTest(){

                String inputString = " ";
                String expectedOutPut = " ";

                String actualOutPut = BayAmpUtils.reverse(inputString);

                //Valiations

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

        @Test
        public void specialCharacterTest(){

                String inputString = "bayarea@$";
                String expectedOutPut = "bayarea@$";

                String actualOutPut = BayAmpUtils.reverse(inputString);

                //Valiations

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }


        @Test
        public void specialCharacterSenteceTest(){

                String inputString = "bayarea@$ california";
                String expectedOutPut = "california bayarea@$";

                String actualOutPut = BayAmpUtils.reverse(inputString);

                //Valiations

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

}