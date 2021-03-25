public class TaskOne{
    public static void main(String []args){
        String s= null;
        String n= "Ahmed";
        int A;
        int arr[] = {1,2,3,4,5};
        try{
            A = 100/0;
        }catch(ArithmeticException e){System.out.println(e);} //Arithmetic Exception

        try{
            arr[10] = 10;
        }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);} //Array Index Out Of Bounds Exception

        try{
            System.out.println(s.length());
        }catch(NullPointerException e){System.out.println(e);} //Null Pointer Exception

        try{
            int i = Integer.parseInt(n);
        }catch(NumberFormatException e){System.out.println(e);} //Number Format Exception
    }
}
