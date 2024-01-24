package common;

import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class AssertResponse {
    public static void VerifyMsg(String ExpectedText,String ActualResponse){

        assertTrue(ExpectedText.contains(ActualResponse));
    }
    public static void VerifyMsg(double ExpectedResponse,double ActualResponse){

        Assert.assertEquals(ExpectedResponse,ActualResponse,0);
    }



}
