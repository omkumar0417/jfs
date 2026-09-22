package lecture_2_20aug_polymorphism;

public class poly {
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public  void sum(int a, float b){
        System.out.println( a+b);
    }
    public void sum(float a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        poly p=new poly();
        p.sum(2,3);
        p.sum(2,3.1f);
        p.sum(2.1f,1);



    }
}
