/**
 * By Andrew Wilson.
 * code adapted from Oracle.
 */

import java.util.Date;

/**
 * Interface for items.
 */
public interface Item {

  public static final String MANUFACTURER = "OracleProduction";

  public void setProductionNumber(int number);

  public void setName(String name);

  public String getName();

  public Date getManufacturedDate();

  public int getSerialNumber();
}
