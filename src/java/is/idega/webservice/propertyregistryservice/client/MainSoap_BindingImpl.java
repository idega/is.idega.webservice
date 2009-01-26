/**
 * MainSoap_BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.webservice.propertyregistryservice.client;

public class MainSoap_BindingImpl implements is.idega.webservice.propertyregistryservice.client.MainSoap_PortType{
    public java.lang.String getCompanies() throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String login(java.lang.String company, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String pingServer() throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.GetDataResponseGetDataResult getData(java.lang.String sessionId, java.lang.String tableName, java.lang.String filter, boolean returnTree) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.GetDataOrderResponseGetDataOrderResult getDataOrder(java.lang.String sessionId, java.lang.String tableName, java.lang.String filter, java.lang.String orderBy, boolean returnTree) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.SaveDataResponseSaveDataResult saveData(java.lang.String sessionId, java.lang.String tableName, is.idega.webservice.propertyregistryservice.client.SaveDataDsChanges dsChanges) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.OpenQueryResponseOpenQueryResult openQuery(java.lang.String sessionId, java.lang.String queryString) throws java.rmi.RemoteException {
        return null;
    }

    public int getID(java.lang.String sessionId, java.lang.String strTableName) throws java.rmi.RemoteException {
        return -3;
    }

    public is.idega.webservice.propertyregistryservice.client.GetCubeResponseGetCubeResult getCube(java.lang.String sessionId, java.lang.String queryString) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.TMUser getUser(java.lang.String sessionId) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.Query[] getQueries(java.lang.String sessionId, java.lang.String queryType, java.lang.String yfirFlokkur, java.lang.String undirFlokkur) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.QueryInfo getQueryInfo(java.lang.String sessionId, java.lang.String queryId, boolean fieldInfo) throws java.rmi.RemoteException {
        return null;
    }

    public byte[] genReport(java.lang.String sessionId, java.lang.String queryId, java.lang.String type, is.idega.webservice.propertyregistryservice.client.ParamInfo[] param) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String genReportFilePath(java.lang.String sessionId, java.lang.String queryId, java.lang.String type, is.idega.webservice.propertyregistryservice.client.ParamInfo[] param) throws java.rmi.RemoteException {
        return null;
    }

    public is.idega.webservice.propertyregistryservice.client.GenDataSetResponseGenDataSetResult genDataSet(java.lang.String sessionId, java.lang.String queryId, java.lang.String filter, is.idega.webservice.propertyregistryservice.client.ParamInfo[] param, is.idega.webservice.propertyregistryservice.client.ResultField[] resultParam) throws java.rmi.RemoteException {
        return null;
    }

}
