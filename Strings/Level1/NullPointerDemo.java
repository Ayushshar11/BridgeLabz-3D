package Strings.Level1;

class NullPointerDemo {
    static void generate(){
        String text=null;
        System.out.println(text.length());
    }
    static void handle(){
        try{
            String text=null;
            System.out.println(text.length());
        }catch(NullPointerException e){
            System.out.println("Handled: "+e);
        }
    }
    public static void main(String[] args){
        //generate(); // Uncomment to see abrupt stop
        handle();
    }
}
