 class HelloWorld {

    // Java Recursion
    //

    //    int[][] myNumbers = {{ 1,2,3,4 },{5,6,7}};
    //    for(int i=0;i<myNumbers.length;i++)
    //    {
    //         for(int j=0;j<myNumbers[i].length;j++)
    //         {
    //             System.out.println(myNumbers[i][j]);
    //         }
    //    }

    // static void myMethod(String fname)
    // {
    //     System.out.println(fname + " Refsnes");
    // }

    // static int myMethod(int x){
    //     return 5 + x;
    // }

    // static void checkAge(int age)
    // {
    //     if(age < 18){
    //         System.out.println("Access denied - You are not old enough");
    //     }else{
    //         System.out.println("Access granted - You are old enough!");
    //     }
    // }

    // static int plusMethodInt(int x,int y){
    //     return x + y;
    // }

    // static double plusMethodDouble(double x, double y)
    // {
    //     return x + y;
    // }
  

    // int x = 5;
    // int x = 10;

    // static void myStaticMethod()
    // {
    //     System.out.println("Static methods can be called without creating objects");
    // }

    // public void myPublicMethod()
    // {
    //     System.out.println("Public methods must can be called by creating objects");
    // }


    public void fullThrottle()
    {
        System.out.println("The car is going as far as it can!");
    }

    public void speed(int maxSpeed)
    {
        System.out.println("Max speed is " + maxSpeed);
    }
    
    public static void main(String args[]){

        HelloWorld myObj = new HelloWorld();

        myObj.fullThrottle();
        myObj.speed(200);


        // myStaticMethod();

        // HelloWorld myObj = new HelloWorld();
        // myObj.myPublicMethod();

        // HelloWorld myObj = new HelloWorld();
        // myObj.x = 25;
        // System.out.println(x);

        // HelloWorld myObj1 = new HelloWorld();
        // HelloWorld myObj2 = new HelloWorld();

        // System.out.println(myObj1.x);
        // System.out.println(myObj2.x);

        // HelloWorld myObj = new HelloWorld();
        // System.out.println(myObj.x);
            
        // int result =  sum(10);
        // System.out.println(result);
        // int result = sum(10);
        // System.out.println(result);

        // int result = sum(5,10);
        // System.out.println(result);

        // int myNum1 = plusMethodInt(8,5);
        // double myNum2 = plusMethodDouble(4.3,6.26);

        // System.out.println("int: " + myNum1);
        // System.out.println("double: " + myNum2);

        // checkAge(20);
        // System.out.println(myMethod(3));
        // myMethod("Liam");
        // myMethod("Jenny");
        // myMethod("Anja");
    
    }

    // public static int sum(int start,int end)
    // {
    //     if(end > start)
    //     {
    //         return end + sum(start,end - 1);
    //     }
    //     else
    //     {
    //         return end;
    //     }
        
    // }

    // public static int sum(int k){
    //     if(k > 0)
    //     {
    //         return k + sum(k - 1);
    //     }
    //     else
    //     {
    //         return 0;
    //     }
    // }

    // public static int sum(int k){
    //     if(k > 0)
    //     {
    //         return k + sum(k-1);
    //     }
    //     else
    //     {
    //         return 0;
    //     }
    // }

}   