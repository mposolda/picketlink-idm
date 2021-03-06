//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-619 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.19 at 09:03:04 PM CST 
//


package org.picketlink.idm.integration.jboss5.jaxb2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.picketlink.idm.integration.jboss5.jaxb2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PicketlinkIdmDeployer_QNAME = new QName("urn:picketlink:idm:deployer:v1_0", "picketlink-idm-deployer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.picketlink.idm.integration.jboss5.jaxb2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HibernateInitializerType }
     * 
     */
    public HibernateInitializerType createHibernateInitializerType() {
        return new HibernateInitializerType();
    }

    /**
     * Create an instance of {@link InitializerType }
     * 
     */
    public InitializerType createInitializerType() {
        return new InitializerType();
    }

    /**
     * Create an instance of {@link OptionsType }
     * 
     */
    public OptionsType createOptionsType() {
        return new OptionsType();
    }

    /**
     * Create an instance of {@link HibernateDeployerType }
     * 
     */
    public HibernateDeployerType createHibernateDeployerType() {
        return new HibernateDeployerType();
    }

    /**
     * Create an instance of {@link OptionType }
     * 
     */
    public OptionType createOptionType() {
        return new OptionType();
    }

    /**
     * Create an instance of {@link PicketlinkIDMDeployerType }
     * 
     */
    public PicketlinkIDMDeployerType createPicketlinkIDMDeployerType() {
        return new PicketlinkIDMDeployerType();
    }

    /**
     * Create an instance of {@link SqlInitializerType }
     * 
     */
    public SqlInitializerType createSqlInitializerType() {
        return new SqlInitializerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PicketlinkIDMDeployerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:picketlink:idm:deployer:v1_0", name = "picketlink-idm-deployer")
    public JAXBElement<PicketlinkIDMDeployerType> createPicketlinkIdmDeployer(PicketlinkIDMDeployerType value) {
        return new JAXBElement<PicketlinkIDMDeployerType>(_PicketlinkIdmDeployer_QNAME, PicketlinkIDMDeployerType.class, null, value);
    }

}
