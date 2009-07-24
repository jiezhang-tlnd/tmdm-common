package com.amalto.connector.jdbc.eis.extractor;

import org.apache.log4j.Logger;

import com.amalto.connector.jdbc.eis.common.BasicPrintStreamed;

/**
 * Implementation of {@link UpdateRowcountHandler} that writes the rowcount
 * to the object's print streams.
 *
 */
public class PrintStreamedUpdateRowcountHandler
  extends BasicPrintStreamed
  implements UpdateRowcountHandler
{
  
  //----------------------------------------------------------------------------
  // Static variables
  //----------------------------------------------------------------------------
  
  private static Logger logger = Logger.getLogger(PrintStreamedUpdateRowcountHandler.class);
  
  //----------------------------------------------------------------------------
  // Static methods
  //----------------------------------------------------------------------------
  
  //----------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------
  
  //----------------------------------------------------------------------------
  // Instance variables
  //----------------------------------------------------------------------------

  //----------------------------------------------------------------------------
  // Constructors
  //----------------------------------------------------------------------------
  
  /**
   * Constructs a new instance of
   * <code>PrintStreamedUpdateRowcountHandler</code>.
   */
  public PrintStreamedUpdateRowcountHandler()
  {
  }
  
  //----------------------------------------------------------------------------
  // Interface implementations
  //----------------------------------------------------------------------------
  //----------------------------------------------------------------------------
  // Implementation of interface UpdateRowcountHandler
  //----------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  public void handleRowcount(final int rowCount)
  {
    this.println("");
    this.println(rowCount + " row(s)");
    this.println("");
  }
  
  //----------------------------------------------------------------------------
  // Extends overrides
  //----------------------------------------------------------------------------
  //----------------------------------------------------------------------------
  // Override of class Class1
  //----------------------------------------------------------------------------
  
  
  //----------------------------------------------------------------------------
  // Public methods exposed by this class
  //----------------------------------------------------------------------------
  
  //----------------------------------------------------------------------------
  // Protected abstract methods
  //----------------------------------------------------------------------------
  
  //----------------------------------------------------------------------------
  // Protected methods for use by subclasses
  //----------------------------------------------------------------------------
  
  //----------------------------------------------------------------------------
  // Other methods
  //----------------------------------------------------------------------------
  
  //----------------------------------------------------------------------------
  // Member classes
  //----------------------------------------------------------------------------
  
}
