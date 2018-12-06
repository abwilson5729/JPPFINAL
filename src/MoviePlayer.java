/**
 * By Andrew Wilson.
 * code adapted from Oracle.
 */

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  /**
   * MoviePlayer type.
   *
   * @param name - name of the player
   * @param screen - screen parameters
   * @param monitorType - monitor type
   */
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  /**
   * toString method for output.
   *
   * @return - returns the product name from super, the screen specs and the monitor type
   */
  public String toString() {
    return super.toString() + "\n"
        + screen.toString() + "\n"
        + "Monitor Type : " + monitorType;
  }
}
