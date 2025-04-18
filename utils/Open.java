package utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Open {
  public static String file(String path) {
    try {
      String data = new String(Files.readAllBytes(Paths.get(path)));
      return data;
    } catch (IOException e) {
      return e.toString();
    }
  }
}
