package nl.architolk.wsdlreader;

import javax.xml.namespace.QName;

class SoapVersion12 implements SoapVersion {

    private final static QName envelopeQName = new QName(Constants.SOAP12_ENVELOPE_NS, "Envelope");
    private final static QName bodyQName = new QName(Constants.SOAP12_ENVELOPE_NS, "Body");
    private final static QName faultQName = new QName(Constants.SOAP11_ENVELOPE_NS, "Fault");
    private final static QName headerQName = new QName(Constants.SOAP12_ENVELOPE_NS, "Header");
    public final static SoapVersion12 instance = new SoapVersion12();

    private SoapVersion12() {
    }

    public String getEncodingNamespace() {
        return "http://www.w3.org/2003/05/soap-encoding";
    }

    public String getEnvelopeNamespace() {
        return Constants.SOAP12_ENVELOPE_NS;
    }

    public String toString() {
        return "SOAP 1.2";
    }

    public QName getBodyQName() {
        return bodyQName;
    }

    public QName getEnvelopeQName() {
        return envelopeQName;
    }

    public QName getHeaderQName() {
        return headerQName;
    }

    public static QName getFaultQName() {
        return faultQName;
    }

    public String getName() {
        return "SOAP 1.2";
    }

    public String getFaultDetailNamespace() {
        return getEnvelopeNamespace();
    }
}
