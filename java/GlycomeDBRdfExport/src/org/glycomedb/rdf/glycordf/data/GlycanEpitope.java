package org.glycomedb.rdf.glycordf.data;


public class GlycanEpitope  extends GlycanMotif 
{


    public GlycanEpitope(){}
    
    public GlycanEpitope(String a_uri)
    {
        this.setInstanceURI(a_uri);
    }

    public GlycanEpitope(String a_uri, boolean a_isInstance)
    {
        this.setInstanceURI(a_uri);
        this.setOntologyInstance(a_isInstance);
    }

    public String getInstanceURI()
    {
        return this.m_instanceURI;
    }

    public void setOntologyInstance(boolean a_isInstance)
    {
        this.m_ontologyInstance = a_isInstance;
    }

    public boolean isOntologyInstance()
    {
        return this.m_ontologyInstance;
    }

    public void setInstanceURI(String instanceURI)
    {
        this.m_instanceURI = instanceURI;
    }

}