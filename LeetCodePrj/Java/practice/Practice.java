package practice;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class Practice {

    @Test
    public void testChangeRef() {
        ListNode b = new ListNode(2);
        System.out.println("b --> " + b);
        changeRef(b);
        System.out.println(b.val);
    }

    private void changeRef(ListNode i) {
        System.out.println("i --> " + i);
        i.val = 0;
    }

    @Test
    public void testChangePrimitive() {
        int a = 0;
        changePrimitive(a);
        System.out.println(a);
    }

    private void changePrimitive(int i) {
        i = 1;
    }

    @Test
    public void testSwapInteger() {
        Integer a = 1;
        Integer b = -1;
        try {
            swapInteger(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.valueOf(1));
    }

    private void swapInteger(Integer a, Integer b) throws Exception {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        Integer tmp = new Integer(a);
        field.set(a, b);
        field.set(b, tmp);
    }

    private class TestObject{
        Integer a;
        int b;
    }

    @Test
    public void testChangeObject() {
        TestObject testObject = new TestObject();
        testObject.a = 0;
        testObject.b = 0;
        changeObject(testObject);
        System.out.println(testObject.a);
        System.out.println(testObject.b);
    }

    private void changeObject(TestObject obj) {
        obj.a = 1;
        obj.b = 2;
    }
}
