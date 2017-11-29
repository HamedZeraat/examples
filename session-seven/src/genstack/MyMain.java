package genstack;

public class MyMain {
    public static void main(String[] args) {
        final int TEN = 10;

        Stack<String> mystack = new GenericStack<>();

        try {
            mystack.pop();
        }
        catch (Exception ex){
            System.out.println("Pop went wrong = good");
        }

        try {
            String item = mystack.top();
        }
        catch (Exception ex){
            System.out.println("Top went wrong = good");
        }

        for (int i=1; i <= TEN; i++){
            mystack.push("" + i);
        }

        System.out.println("Top = " + mystack.top());

        while(! mystack.isEmpty()){
            System.out.println(mystack.pop());
        }

        System.out.println("Is the stack empty? " + mystack.isEmpty());
    }
}
