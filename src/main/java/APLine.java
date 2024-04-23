public class APLine
{
  public int aValue, bValue, cValue;
  public double slope;
  public void APLine(int a, int b, int c){
    aValue = a;
    bValue = b;
    cValue = c;
  }
  public double getSlope(){
    slope = -aValue/bValue;
  }
  public boolean isOnLine (int x, int y){
    if(aValue * x + bValue * y + cValue == 0){
      return true;
    } else {
      return false;
    }
  }
}
