import java.lang.reflect.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String className = args[0];
        String classMethod = args[1];
        String serviceName = args[2];

        try {

            //Get the class object based on the provided classname
            Class<?> targetClass = Class.forName(className);

            Class<?> serviceClass = Class.forName(serviceName);

            //Get a new instance of the class using reflection
            Object instance = targetClass.getDeclaredConstructor(serviceClass)
            .newInstance("context");

            //Get the method of the class
            Method method = targetClass.getMethod(classMethod);

            //Invoke the method on the object using reflection
            method.invoke(instance);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: "+className);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
