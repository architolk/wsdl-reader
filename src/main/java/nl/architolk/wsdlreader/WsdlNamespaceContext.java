package nl.architolk.wsdlreader;

import java.util.Iterator;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;

class WsdlNamespaceContext implements NamespaceContext {

  private static final String XS_NS_URI = "http://www.w3.org/2001/XMLSchema";
  private static final String DWS_NS_URI = "http://dotwebstack.org/wsdl-extension/";

  public String getNamespaceURI(String prefix) {
      if (prefix == null) throw new NullPointerException("Null prefix");
      else if ("xs".equals(prefix)) return WsdlNamespaceContext.XS_NS_URI;
      else if ("dws".equals(prefix)) return WsdlNamespaceContext.DWS_NS_URI;
      else if ("xml".equals(prefix)) return XMLConstants.XML_NS_URI;
      return XMLConstants.NULL_NS_URI;
  }

  // This method isn't necessary for XPath processing.
  public String getPrefix(String uri) {
      throw new UnsupportedOperationException();
  }

  // This method isn't necessary for XPath processing either.
  public Iterator getPrefixes(String uri) {
      throw new UnsupportedOperationException();
  }

}
