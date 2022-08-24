public class singleTonPattern{
    public static void main(String[] args){
        singleObject obj = singleObject.getInstance();
        obj.showMessage();
    }
}