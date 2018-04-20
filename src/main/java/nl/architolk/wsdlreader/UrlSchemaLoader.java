package nl.architolk.wsdlreader;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import java.net.URL;

/**
 * This class was extracted from the soapUI code base by centeractive ag in October 2011.
 * The main reason behind the extraction was to separate the code that is responsible
 * for the generation of the SOAP messages from the rest of the soapUI's code that is
 * tightly coupled with other modules, such as soapUI's graphical user interface, etc.
 * The goal was to create an open-source java project whose main responsibility is to
 * handle SOAP message generation and SOAP transmission purely on an XML level.
 * <br/>
 * centeractive ag would like to express strong appreciation to SmartBear Software and
 * to the whole team of soapUI's developers for creating soapUI and for releasing its
 * source code under a free and open-source licence. centeractive ag extracted and
 * modifies some parts of the soapUI's code in good faith, making every effort not
 * to impair any existing functionality and to supplement it according to our
 * requirements, applying best practices of software design.
 * <p/>
 * Changes done:
 * - changing location in the package structure
 * - removal of dependencies and code parts that are out of scope of SOAP message generation
 * - minor fixes to make the class compile out of soapUI's code base
 */
class UrlSchemaLoader implements SchemaLoader, DefinitionLoader {
    private String baseURI;

    public UrlSchemaLoader(String baseURI) {
        this.baseURI = baseURI;
    }

    public XmlObject loadXmlObject(String wsdlUrl, XmlOptions options) throws Exception {
        return XmlUtils.createXmlObject(new URL(wsdlUrl), options);
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setProgressInfo(String info) {
        throw new SoapBuilderException("Not Implemented");
    }

    public boolean isAborted() {
        throw new SoapBuilderException("Not Implemented");
    }

    public boolean abort() {
        throw new SoapBuilderException("Not Implemented");
    }

    public void setNewBaseURI(String uri) {
        throw new SoapBuilderException("Not Implemented");
    }

    public String getFirstNewURI() {
        throw new SoapBuilderException("Not Implemented");
    }
}
