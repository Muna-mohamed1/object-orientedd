public class era  {

    int instanceVar = 6;
    static int staticVar = 15;


    public void instanceMethod() {
        int localVar = 10;
        System.out.println("Local Variable in instanceMethod: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void staticMethod() {
        int localVar = 20;
        System.out.println("Local Variable in staticMethod: " + localVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        era obj = new era();

        obj.instanceMethod();
        staticMethod();
    }
}



