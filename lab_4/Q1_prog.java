package lab_4;

class vechile{
    void displayType(){
        System.out.println("Generic vechiles");
    }
}
class car extends vechile{
    @Override
    void displayType(){
        System.out.println("Car");
    }
}


public class Q1_prog {
    public static void main(String[] args) {
        vechile v = new vechile();
        v.displayType(); }
}