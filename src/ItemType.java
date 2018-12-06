/**
 * By Andrew Wilson.
 * code adapted from Oracle.
 */

/**.
 * enum for various item types
 */
public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  private final String code;

  ItemType(String code) {
    this.code = code;
  }

  /**.
   * gets the code of the item
   *
   * @return code
   */
  public String getCode() {
    return code;
  }
}
