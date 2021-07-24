package test;

public class Test {
    public  static void main(String[] args) {
        int  i=2;
        System.out.println("i=i++的结果是"+(i=i++));
        i=2;
        System.out.println("i=i++ +i的结果是"+(i=i++ +i));
        i=2;
        System.out.println("i=i+++i的结果是"+(i=i+++i));

    }

}
