public class Cuboid {

  int xAxis;
  int yAxis;
  int zAxis;

  public Cuboid(int xAxis, int yAxis, int zAxis) {
    this.xAxis = xAxis;
    this.yAxis = yAxis;
    this.zAxis = zAxis;
  }

  public int getSurface() {
    int result = ((this.xAxis * this.yAxis) + (this.yAxis * this.xAxis) +
        (this.zAxis * this.xAxis)) * 2;
    return result;
  }

  public int getVolume() {
    return this.xAxis * this.yAxis * this.zAxis;
  }
}
