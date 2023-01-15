package test.practice.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;

public class TestEncode {
  static String USER_DIR = System.getProperty("user.dir");
  public static void main(String[] args) throws IOException {
   

    File source = new File(USER_DIR + PropertyStorage.getGeneratedReportDir());
    Path dest = Paths.get(USER_DIR + PropertyStorage.getFirstRunReportDir());
    copyFileUsingApacheCommonsIO(source, dest);
  }

  private static void copyFileUsingApacheCommonsIO(File source, Path dest) throws IOException {
    if (Files.exists(dest)) {
      FileUtils.cleanDirectory(new File(USER_DIR+PropertyStorage.getFirstRunReportDir()));
    } else {
      new File(USER_DIR+PropertyStorage.getFirstRunReportDir()).mkdir();
    }
    File dest1 = new File(USER_DIR+PropertyStorage.getFirstRunReportDir());
    FileUtils.copyFileToDirectory(source, dest1);
  }
}
