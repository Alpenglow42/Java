public class IllegalTriangleException extends Exception {


    //message constructor
//    public IllegalTriangleException(String message) {
//        super("IllegalTriangleException: " + message);
//    }
//
//    public IllegalTriangleException() {
//        super("IllegalTriangleException: This is an illegal triangle.");
//    }

    //public IllegalTriangleException(String message) {
       // super(message);
      //
   // }


    public IllegalTriangleException () {
            super("Invalid triangle sides: The sum of any two sides must be greater than the third side.");
        }

}//end of class


