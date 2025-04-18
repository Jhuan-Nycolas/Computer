import hardware.Bit;
import hardware.memory;

public class computer {
  public computer(int space) {
    Bit[][] diskspace = {};

    for (int count = 0; count <= 10; count++) {
      Bit[] mem = {};

      int[] listcounter = { 1, 2, 3, 4, 5, 6, 7, 8 };
      for (int counter : listcounter) {
        Bit[] list = memory.newM(4);
        Bit.append(list, mem);
      }
    }
  }
}
