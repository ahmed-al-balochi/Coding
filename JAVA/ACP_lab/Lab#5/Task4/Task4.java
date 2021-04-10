import java.io.*;
import java.util.*;

class Graph implements Serializable{
    int matrix[][];
    Graph(){
         matrix = new int[5][5];
    }
    void setMatrix(){
        int i = 0, j = 0;
        for(i =0; i<5;i++){
            for(j =0; j<5;j++){
                matrix[i][j]=i+j;
                //System.out.print(" "+matrix[i][j]);
            }
        }
    }
}

class Serial{
    void SerializeFile(){
        Graph g = new Graph();
        g.setMatrix();
        try {
         FileOutputStream fileOut = new FileOutputStream("Out.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(g);
         out.close();
         fileOut.close();
         System.out.printf("\nSerialized data is saved in Out.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
    }
    void DeSerializeFile(){
        Graph g = new Graph();
      try {
         FileInputStream fileIn = new FileInputStream("Out.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         g = (Graph) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Graph class not found");
         c.printStackTrace();
         return;
      }

      System.out.println("\n\nDeserialized Graph...");
        int i = 0, j = 0;
        for(i =0; i<5;i++){
            for(j =0; j<5;j++){
                g.matrix[i][j]=i+j;
                System.out.print(" "+g.matrix[i][j]);
            }
        }
    }
}
public class Task4{
    public static void main (String []args) throws IOException{
        Serial s = new Serial();
        s.SerializeFile();
        s.DeSerializeFile();
    }
}
