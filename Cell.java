public class Cell<anyType>
{
   private int row;
   private int col;
   private anyType value;
   
   public Cell(int r, int c, anyType v)
   {
      row = r;
      col = c;
      value = v;
   }
   
   public int getRow()
   {
      return row;
   }
   
   public int getColumn()
   {
      return col;
   }
   
   public anyType getValue()
   {
      return value;
   }
   
}