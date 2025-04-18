package computer;

public class Bit {
  public static Boolean isBin(int num) {
    if (num > 1) {
      return false;
    } else {
      return true;
    }
  }

  public static Bit[][] append(Bit[] list, Bit[] self) {
    Bit[][] ls = { self, list };

    return ls;
  }

  public static int and(int a, int b) {
    if (isBin(a) && isBin(b)) {
      if (a == 1 && b == 1) {
        return 1;
      } else {
        return 0;
      }
    } else {
      return -1;
    }
  }

  public static int or(int a, int b) {
    if (isBin(a) && isBin(b)) {
      if (a == 1 || b == 1) {
        return 1;
      } else {
        return 0;
      }
    } else {
      return -1;
    }
  }

  public static int not(int a) {
    if (isBin(a)) {
      if (a == 1) {
        return 0;
      } else {
        return 1;
      }
    } else {
      return -1;
    }
  }

  public static int xor(int a, int b) {
    if (isBin(a) && isBin(b)) {
      if (a == 1 && b == 0 || a == 0 && b == 1) {
        return 1;
      } else {
        return 0;
      }
    } else {
      return -1;
    }
  }
}
