//Part -1: Search at least three interfaces (other than example given below)
//in JAVA  docs at http://docs.oracle.com/javase/7/docs/api/
//and list itsall methods like this: EventListener and its method is handleEvent,
//Part -2: Then make a class that implements any of the interfaces you found in Q5
//Part -1, try to execute program without implementing any of the interface’s method and list down the error you receive.

java.text;
java.awt.image;
java.sql;

public interface AttributedCharacterIterator extends CharacterIterator{
int getRunLimit();
}
public interface SQLInput{
Array readArray();
}
public interface BufferedImageOp{
RenderingHints getRenderingHints();
}
class Test implements SQLInput{

}

public class TaskFive{
    public static void main(String []args){
        Test test = new Test();
    }
}
