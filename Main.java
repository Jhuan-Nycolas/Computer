import utils.Open;

public class Main {
  public static void main(String[] args) {
    String tmpdata = Open.file(args[0]);

    int data = Integer.parseInt(tmpdata.trim());

    System.out.println(data);
  }
}
