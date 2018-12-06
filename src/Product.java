import java.util.Date;

/**
 * By Andrew Wilson, code adapted from Oracle
 */

/**.
 * abstract class product, implements item, contains all info about the products who manufactured
 * it, its serial number, when it was manufactured and the name of the item
 */
public abstract class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;

  static int currentProductNumber;

  /**.
   * Gets the information for the product, name serial number and manufactured date
   */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductNumber++;
    manufacturedOn = new Date();
    //manufacturer = Item.MANUFACTURER;
  }

  /**.
   * Sets the serial number of the product
   */
  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;
  }

  /**.
   * Sets the name of the product
   */
  public void setName(String name) {
    this.name = name;
  }

  /**.
   * Returns the product name
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**.
   * Returns the date the product was manufactured
   *
   * @return manufacturedOn
   */
  public Date getManufacturedDate() {
    return manufacturedOn;
  }

  /**.
   * Returns the serial number of the product
   *
   * @return serialNumber
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  /**.
   * Returns all information about the product to be printed
   *
   * @return MANUFACTURER, serialNumber, manufacturedOn, and name
   */
  public String toString() {
    serialNumber++;
    return "Manufacturer : " + MANUFACTURER + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

  public int compareTo(Product product) {
    return name.compareTo(product.getName());
  }
}
