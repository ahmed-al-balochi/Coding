

import java.io.*;
import java.util.*;

class FruitStore {
    int StoreID;
    String name, City, Province,Street ,PlotNum;
    public String toString(String in){
     String str = in;
     return str;
    }
    public int getStoreID() {
        return StoreID;
    }
    public String getName() {
        return name;
    }

    public String getCity() {
        return City;
    }

    public String getProvince() {
        return Province;
    }

    public String getStreet() {
        return Street;
    }

    public String getPlotNum() {
        return PlotNum;
    }

    public void setStoreID(int StoreID) {
        this.StoreID = StoreID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public void setPlotNum(String PlotNum) {
        this.PlotNum = PlotNum;
    }
}
class Fruit extends FruitStore{
    int[] FruitID;
    double[] FruitPrice;
    int[] Qty;
    String[] Fruitname;

    Fruit(){
        FruitID=new int[50];
        FruitPrice=new double[50];
        Qty=new int[50];
        Fruitname=new String[50];
    }
    @Override
    public String toString(String in){
     String str = in;
     return str;
    }
    public void setFruitID(int... FruitID) {
        this.FruitID = FruitID;
    }

    public void setFruitname(String... Fruitname) {
        this.Fruitname = Fruitname;
    }

    public int[] getFruitID() {
        return FruitID;
    }
    public void setFruitPrice(double... FruitPrice) {
        this.FruitPrice = FruitPrice;
    }

    public void setQty(int... Qty) {
        this.Qty = Qty;
    }

    public double[] getFruitPrice() {
        return FruitPrice;
    }

    public int[] getQty() {
        return Qty;
    }
    public String[] getFruitname() {
        return Fruitname;
    }
    public double avg() {
        int length = FruitPrice.length;
        double sum = 0;
		for (int i = 0; i < FruitPrice.length; i++) {
			sum += FruitPrice[i];
		}
		double avg = sum / length;
		System.out.println("Average of Fruits: "+avg);
        return avg;
    }
    public void highest() {
        double temp;
        int size;
        size = FruitPrice.length;

   for(int i = 0; i<size; i++ ){
      for(int j = i+1; j<size; j++){
         if(FruitPrice[i]>FruitPrice[j]){
            temp = FruitPrice[i];
            FruitPrice[i] = FruitPrice[j];
            FruitPrice[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is: "+FruitPrice[size-3]);
   System.out.println("Fifth lowest number is: "+FruitPrice[size-5]);
   }

   public String FilePrp(){
       String str="";
       int length = FruitID.length;
       for(int i=0;i<length ;i++){
       str += "Fruit Name: "+Fruitname[i]+"\tFruitID: "+FruitID[i]+"\tFruit Price: "+FruitPrice[i]+"\tFruit Qty: "+Qty[i]+"\n";
       }
       return str;
   }
   public void displayFruit(){
       int length = FruitID.length;
       for(int i=0;i<length ;i++)
       System.out.println("Fruit Name: "+Fruitname[i]+"\tFruitID: "+FruitID[i]+"\tFruit Price: "+FruitPrice[i]+"\tFruit Qty: "+Qty[i]);
   }
}

class Seller extends Fruit{
    int SellerID;
    String SellerName;

    Seller(int sellerId, String sellerName){
        this.SellerID = sellerId;
        this.SellerName= sellerName;
    }
    @Override
    public String toString(String in){
     String str = in;
     return str;
    }
    public void setSellerID(int SellerID) {
        this.SellerID = SellerID;
    }

    @Override
    public void setName(String SellerName) {
        this.SellerName = SellerName;
    }

    public int getSellerID() {
        return SellerID;
    }

    @Override
    public String getName() {
        return SellerName;
    }
    void MakeFile()throws IOException{
        FileWriter out = new FileWriter("MidTermExam_2028.txt");
        BufferedWriter bw = new BufferedWriter(out);
        int length = FruitID.length;
    //process
    String aLine="Seller Name: "+getName()+"\tSellerID: "+getSellerID()+"\n\n"+FilePrp()+"\n";
    bw.write(aLine);

    bw.close();
    out.close();
    }
}

public class MidTermExam_2028{
    public static void main(String []args)throws IOException{
        int arr[];
        Seller sell1 = new Seller(2028,"Ahmed Al Balochi");

        sell1.setFruitname("Apple","Blackberry","Banana","Strawberry","Grapes","Mango","Peach");
        sell1.setFruitID(1,2,3,4,5,6,7);
        sell1.setFruitPrice(5,6.9,6.4,2.9,14,9,7);
        sell1.setQty(12,24,30,45,28,14,18);
        sell1.displayFruit();
        sell1.avg();
        sell1.highest();
        sell1.MakeFile();
    }
}
