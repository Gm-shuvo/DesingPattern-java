public class singleObject{
    private static singleObject instance = new singleObject();
    //create private constructor that can not instantiated
    private singleObject(){

    }
    //only available calling this
    public static singleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Message");
    }
}