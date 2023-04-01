package sec;

public class ConstructorDemo {


    public ConstructorDemo(){
        System.out.println("No arg constructor");
    }

    public ConstructorDemo(String name){
        this();
        System.out.println("arg constructor");
    }


public static void main(String[] args){
        ConstructorDemo constructordemo=new ConstructorDemo("java");
}


}
