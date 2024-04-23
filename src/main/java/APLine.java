public class APLine
{
  private int aValue, bValue, cValue;
  public APLine(int a, int b, int c){
    aValue = a;
    bValue = b;
    cValue = c;
  }
  public double getSlope(){
    return = -(double)aValue/bValue;
  }
  public boolean isOnLine (int x, int y){
    return aValue * x + bValue * y + cValue == 0;
  }
}
