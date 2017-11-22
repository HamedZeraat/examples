package exceptions;

public class MyClass {
    public static void main(String[] args) {
        try {
            anotherMethod();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    private static void anotherMethod() throws Exception {
        try {
            //int a = 1 / 0;
            throw new Exception("exception one");
        }
        catch(Exception ex){
            //System.err.println(ex);
            throw new Exception("exception two");
        }
        finally {
            //System.out.println("Always does this");
            throw new Exception("another exception");
        }
    }
}
