import java.util.ArrayList;

public class SparseMatrix<anyType> implements Matrixable<anyType>
{

   private ArrayList<Cell<anyType>> list;           
   private int numElements;                                   
   private int numRows;
   private int numCols; 
   
   public SparseMatrix (int r, int c)      
   {
      list = new ArrayList();       
      numElements = 0;
      numRows = r;
      numCols = c;     
   }    
               
   public int numRows()
   {
      return numRows;
   }
   public int numColumns()
   {
      return numCols;
   }
   public anyType get(int r, int c) 
   {

   }
   public anyType set(int r, int c, anyType x) 
   {

   }
   public void add(int r, int c, anyType x) 
   {

   } 
   public anyType remove(int r, int c)
   {

   }
   public int size()
   {
      
   }
}