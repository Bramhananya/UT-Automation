package test.practice.entities;

public class RandomValue {

  private static ThreadLocal<Long> randomNumber = new ThreadLocal<>();
  private static ThreadLocal<Long> tenDigitRandomNumber = new ThreadLocal<>();
  private static ThreadLocal<String> randomText = new ThreadLocal<>();

  public long getRandomNumber() {
    return randomNumber.get();
  }

  public void setRandomNumber(long value) {
    randomNumber.set(value);
  }

  public String getRandomText() {
    return randomText.get();
  }

  public void setRandomText(String value) {
    randomText.set(value);
  }

  public void removeRandomNumber() {
    randomNumber.remove();
  }

  public void removeRandomText() {
    randomText.remove();
  }

  public long getTenDigitRandomNumber() {
    return tenDigitRandomNumber.get();
  }

  public void setTenDigitRandomNumber(long value) {
    tenDigitRandomNumber.set(value);
  }
}
