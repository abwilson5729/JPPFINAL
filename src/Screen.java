/**
 * By Andrew Wilson.
 * code adapted from Oracle.
 */

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * Screen with various parameters.
   *
   * @param resolution - resolution of the screen used
   * @param refreshrate - refresh rate of the screen
   * @param responsetime - response time of the screen
   */
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshrate;
  }

  public int getResponseTime() {
    return responsetime;
  }

  /**
   * toString for output.
   *
   * @return - resolution, refreshrate and responsetime of the screen
   */
  public String toString() {
    return "Screen : Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshrate + "\n"
        + "Response time : " + responsetime;
  }
}

