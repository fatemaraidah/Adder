package adder;
class Adder extends Arithmetic {
    @Override
    int add(int a, int b) {
        return a + b;
    }
     public static void main(String[] args) {
         Adder obj = new Adder();
         System.out.println("My class is: Arithmetic");
         System.out.print(obj.add(30, 12));
         System.out.print(" "+obj.add(5, 8));
         System.out.println(" "+obj.add(15, 5));        
     }
    
}

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}
