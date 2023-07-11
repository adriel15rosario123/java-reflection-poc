public class Controller {
    
    private String context;

    public Controller(String context) {
        this.context = context;
    }

    public void PrintHelloWorld(){
        System.out.println(this.context);
    }

}
