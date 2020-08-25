package vn.edu.vtc.bl;

import org.junit.Assert;
import org.junit.Test;

public class StaffBLTest {
    @Test
    public void getMD5Test1() {
        try {
            String result = StaffBL.getMd5("Nhatnl3004");
            String expected = "df7ac565f8308523e45b3b528513d8bd";
            Assert.assertEquals(result,expected);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void getMD5Test2() {
        try {
            String result = StaffBL.getMd5("Nhatnl19024");
            String expected = "80be2a761fe62ab3f023e3f77dc9b8dd";
            Assert.assertEquals(result,expected);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    @Test
    public void getMD5Test3() {
        try {
            String result = StaffBL.getMd5("cuongDeeptry1");
            String expected = "38ed25b6ec4c911283f7da1626e9cead";
            Assert.assertEquals(result,expected);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    @Test
    public void getMD5Test4() {
        try {
            String result = StaffBL.getMd5("cuongDeeptry2");
            String expected = "7a98924465e161165a7fa692b11649f1";
            Assert.assertEquals(result,expected);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
