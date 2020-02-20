package lambda.espression;

public class RefAndConstrMethod {

    public static void m2(){
        System.out.println("Reference Method - Static Methode");
    }

    public  void m3(){
        System.out.println("Reference Method - instance Method");
    }

    public static void main(String[] args){
        System.out.println("############## Reference Method ##############");
        IAM ia = RefAndConstrMethod::m2;
        ia.m1();

        IAM ia2  = new RefAndConstrMethod()::m3;
        ia2.m1();

        System.out.println("############## Reference Constructor ##############");
        IBM ib = Sample::new;
        ib.get();
    }

}
class Sample {
    public Sample() {
        System.out.println("Construtor Sample class ");
    }
}
interface IAM{
    void m1();
}
interface IBM {
    Sample get();
}

