package mono;

import mono.service.FileService;
import mono.util.Util;

public class Main {

  private static final String SAMPLE_2_FILE = "sample2.txt";

  public static void main(String[] args) {

    FileService.write(SAMPLE_2_FILE, "This is sample 2")
        .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    FileService.read(SAMPLE_2_FILE)
        .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    FileService.delete(SAMPLE_2_FILE)
        .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

  }
}
