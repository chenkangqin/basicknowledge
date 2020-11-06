package com.qin.parameterpass;

/**
 * @author chenkq
 * @version 1.0
 * @date 2020/11/6
 * java值传递测试
 */
public class ParameterPass {
    public static void main(String[] args) {
        int a = 1;
        testIntPass(a);
        Inner inner = new Inner();
        inner.setA(1);
        testObjectPass(inner);
        Inner inner2 = new Inner();
        inner2.setA(1);
        testObjectPassChange(inner2);
        System.out.println(a);
        System.out.println(inner.getA());
        System.out.println(inner2.getA());
    }

    /**
     * 没有发生值改变
     * no change
     * @param a
     */
    public static void testIntPass(int a){
        a = 2;
    }
    /**
     * 没有发生值改变
     * no change
     * @param a
     */
    public static void testObjectPass(Inner a){
        Inner inner = new Inner();
        inner.setA(2);
        a = inner;
        a.setA(3);
    }
    /**
     * 发生值改变
     * change
     * @param a
     */
    public static void testObjectPassChange(Inner a){
        a.setA(2);
    }

    static class Inner{
        int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }
}
