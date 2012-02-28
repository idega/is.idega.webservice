/**
 * EGOVDKM_AuthConsumerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eGOVDKM_AuthConsumer;

public interface EGOVDKM_AuthConsumerType extends java.rmi.Remote {
    public void generateSAMLFromToken(java.lang.String token, java.lang.String ipAddress, localhost.eGovSAMLGenerator.webServices.generateSAMLFromToken.holders.__StatusHolder status, javax.xml.rpc.holders.StringHolder saml) throws java.rmi.RemoteException;
    public void generateSAMLFromCertificate(java.lang.String certificate, java.lang.String ipAddress, localhost.eGovSAMLGenerator.webServices.generateSAMLFromCertificate.holders.__StatusHolder status, javax.xml.rpc.holders.StringHolder saml) throws java.rmi.RemoteException;
}
