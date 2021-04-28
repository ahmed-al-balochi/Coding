import java.io.*;
import java.util.*;

class Store extends javax.swing.JFrame{
    int StoreID;
    String StoreName, City, Province,Street ,Plot;
    public String toString(String in){
     String str = in;
     return str;
    }
    public int getStoreID() {
        return StoreID;
    }
    public String getStoreName() {
        return StoreName;
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

    public String getPlot() {
        return Plot;
    }

    public void setStoreID(int StoreID) {
        this.StoreID = StoreID;
    }

    public void setStoreName(String name) {
        this.StoreName = name;
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

    public void setPlot(String Plot) {
        this.Plot = Plot;
    }
}
class Fruit extends Store{
    int FruitID, FruitPrice[],Qty[];
    String Fruitname;

    @Override
    public String toString(String in){
     String str = in;
     return str;
    }
    public void setFruitID(int FruitID) {
        this.FruitID = FruitID;
    }

    public void setFruitname(String Fruitname) {
        this.Fruitname = Fruitname;
    }

    public int getFruitID() {
        return FruitID;
    }
    public void setFruitPrice(int[] FruitPrice) {
        this.FruitPrice = FruitPrice;
    }

    public void setQty(int[] Qty) {
        this.Qty = Qty;
    }

    public int[] getFruitPrice() {
        return FruitPrice;
    }

    public int[] getQty() {
        return Qty;
    }
    public String getFruitname() {
        return Fruitname;
    }
    public double Avg() {
        int length = FruitPrice.length;
        int sum = 0;
		for (int i = 0; i < FruitPrice.length; i++) {
			sum += FruitPrice[i];
		}
		double Avg = sum / length;
		System.out.println("Average of array : "+Avg);
        return Avg;
    }
    public void HighANDLowest() {
   System.out.println("Third largest number is:: "+FruitPrice[3]);
   System.out.println("fifth lowest number is:: "+FruitPrice[5]);
   }
}

class Seller extends Fruit{
    int SellerID;
    String SellerName;
    Store S;
    Fruit F;

    @Override
    public String toString(String in){
     String str = in;
     return str;
    }
    public void setSellerID(int SellerID) {
        this.SellerID = SellerID;
    }

    public void setName(String SellerName) {
        this.SellerName = SellerName;
    }

    public int getSellerID() {
        return SellerID;
    }
    public String getName() {
        return SellerName;
    }
    void File()throws IOException{
        try (FileWriter out = new FileWriter(getName()); BufferedWriter bw = new BufferedWriter(out)) {
            bw.write(getName());
            bw.write(getSellerID());
        }
}
}
public class Store extends Seller {

    /**
     * Creates new form Store
     */
    public Store() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        StID = new javax.swing.JTextField();
        StName = new javax.swing.JTextField();
        StCity = new javax.swing.JTextField();
        StProvince = new javax.swing.JTextField();
        SteStreet = new javax.swing.JTextField();
        StePlotNum = new javax.swing.JTextField();
        FrID = new javax.swing.JTextField();
        FrName = new javax.swing.JTextField();
        FrPrice = new javax.swing.JTextField();
        FrQty = new javax.swing.JTextField();
        SelID = new javax.swing.JTextField();
        SelrName = new javax.swing.JTextField();
        Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StID.setText("Enter ID:");
        StID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreIDActionPerformed(evt);
            }
        });

        StName.setText("Enter Name:");
        StName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreNameActionPerformed(evt);
            }
        });

        StCity.setText("Enter City:");
        StCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreCityActionPerformed(evt);
            }
        });

        FrID.setText("Enter ID:");

        FrName.setText("Enter Name:");
        FrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitNameActionPerformed(evt);
            }
        });

        FrPrice.setText("Enter Fruit Price:");
        FrPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitPriceActionPerformed(evt);
            }
        });

        FrQty.setText("Enter Fruit Qty:");
        FrQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitQtyActionPerformed(evt);
            }
        });

        SelID.setText("Enter SellerID:");
        SelID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerIDActionPerformed(evt);
            }
        });

        SelName.setText("Enter Seller Name:");
        SelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerNameActionPerformed(evt);
            }
        });

        Button.setText("Save");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        StProvince.setText("Enter Store Province:");
        StProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreProvinceActionPerformed(evt);
            }
        });

        StStreet.setText("Enter Store Street:");
        StStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreStreetActionPerformed(evt);
            }
        });

        StPlotNum.setText("Enter Store PlotNum:");
        StPlotNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StorePlotNumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StoreName)
                    .addComponent(FruitID)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StoreCity, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StoreProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StoreStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StorePlotNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FruitName)
                    .addComponent(FruitPrice)
                    .addComponent(FruitQty)
                    .addComponent(SellerID)
                    .addComponent(SellerName, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StoreID))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(StoreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(StoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StoreCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StoreProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StoreStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StorePlotNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FruitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(FruitName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(FruitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(FruitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SellerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(SellerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(SaveButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void StoreNameActionPerformed(java.awt.event.ActionEvent evt) {
    String str = StName.getStr();
    setStoreName(str);
    }

    private void StoreCityActionPerformed(java.awt.event.ActionEvent evt) {
    String str = StCity.getStr();
    setCity(str);
    }

    private void FruitNameActionPerformed(java.awt.event.ActionEvent evt) {
        String str = FrName.getStr();
    setName(str);
    }

    private void FruitPriceActionPerformed(java.awt.event.ActionEvent evt) {
    String str = FrPrice.getStr();
    int i=Integer.parseInt(str);
    }

    private void FruitQtyActionPerformed(java.awt.event.ActionEvent evt) {
    String str = FrQty.getStr();
    int i=Integer.parseInt(str);
    }

    private void SellerIDActionPerformed(java.awt.event.ActionEvent evt) {
    String str = SelID.getStr();
    int i=Integer.parseInt(str);
    }

    private void SellerNameActionPerformed(java.awt.event.ActionEvent evt) {
         String str = SelName.getStr();
    setName(str);
    }

    private void StoreProvinceActionPerformed(java.awt.event.ActionEvent evt) {
        String str = StProvince.getStr();
    setProvince(str);
    }

    private void StoreStreetActionPerformed(java.awt.event.ActionEvent evt) {
       String str = StStreet.getStr();
    setStreet(str);
    }

    private void StorePlotNumActionPerformed(java.awt.event.ActionEvent evt) {
      String str = StPlotNum.getStr();
    setPlotNum(str);
    }

    private void StoreIDActionPerformed(java.awt.event.ActionEvent evt) {
    String str = StID.getStr();
    int i=Integer.parseInt(str);
    setStoreID(i);
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StoreNameActionPerformed(evt);
        StoreCityActionPerformed(evt);
        FruitNameActionPerformed(evt);
        FruitPriceActionPerformed(evt);
        FruitQtyActionPerformed(evt);
        SellerIDActionPerformed(evt);
        SellerNameActionPerformed(evt);
        StoreProvinceActionPerformed(evt);
        StoreStreetActionPerformed(evt);
        StorePlotNumActionPerformed(evt);
        StoreIDActionPerformed(evt);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField FruitID;
    private javax.swing.JTextField FruitName;
    private javax.swing.JTextField FruitPrice;
    private javax.swing.JTextField FruitQty;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField SellerID;
    private javax.swing.JTextField SellerName;
    private javax.swing.JTextField StoreCity;
    private javax.swing.JTextField StoreID;
    private javax.swing.JTextField StoreName;
    private javax.swing.JTextField StorePlotNum;
    private javax.swing.JTextField StoreProvince;
    private javax.swing.JTextField StoreStreet;
    // End of variables declaration
}
