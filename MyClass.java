public class MyClass {
   private int myNumber;
   private String myString;

   // Default constructor
   public MyClass() {
      myNumber = 0;
      myString = "Default";
   }

   public int getMyNumber() {
      return myNumber;
   }

   public String getMyString() {
      return myString;
   }

   public static void main(String[] args) {
      MyClass obj = new MyClass();
      System.out.println("MyNumber: " + obj.getMyNumber());
      System.out.println("MyString: " + obj.getMyString());
   }
}
