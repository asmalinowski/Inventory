import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
class Tool {
    private int toolID;
    private String toolName;
    private int toolQuantity;
    private double toolPrice;
    
    public int getToolID() {
        return toolID;
    }
   
    public void setToolID(int toolID) {
        this.toolID = toolID;
    }
    
    public String getToolName() {
        return toolName;
    }
    
    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
    
    public int getToolQuantity() {
        return toolQuantity;
    }
    
    public void setToolQuantity(int toolQuantity) {
        this.toolQuantity = toolQuantity;
    }
    
    public double getToolPrice() {
        return toolPrice;
    }
    
    public void setToolPrice(double toolPrice) {
        this.toolPrice = toolPrice;
    }
    
  public Boolean saveData() {
  StringBuilder fileLine = new StringBuilder();
  FileWriter fstream = null; 
  try {
   fstream = new FileWriter("C:\\data\\hardware.dat", true);
  }
  catch (Exception e) {
   File file=new File("C:\\data");
   boolean exists = file.exists();
   if (!exists) {
    boolean success = (new File("C:\\data")).mkdir();
    if (success) {
     return saveData();
    }
   }
   System.err.println("Error: " + e.getMessage());
   return false;
  } 
  try {
   BufferedWriter out = new BufferedWriter(fstream);
   fileLine.append(String.valueOf(getToolID()));
   fileLine.append(",");
   fileLine.append(getToolName());
   fileLine.append(",");
   fileLine.append(String.valueOf(getToolQuantity()));
   fileLine.append(",");
   fileLine.append(String.valueOf(getToolPrice()));
   out.append(fileLine.toString());
   out.newLine();
   out.close();
  }
  catch (Exception e){
   System.err.println("Error: " + e.getMessage());
   return false;
  }
  return true;
 }
}    
