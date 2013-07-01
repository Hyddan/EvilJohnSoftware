package EvilJohn.Common;

import com.fourspaces.couchdb.*;

public abstract class DBManager
{
	protected int dbPort;
	protected String dbUrl;
	
	public DBManager(String dbUrl, int dbPort)
	{
		this.dbPort = dbPort;
		this.dbUrl = dbUrl;
	}

	public abstract ViewResults adHocView(String viewFunction);
	public abstract ViewResults execView(String viewName);
	public abstract ViewResults getAllDocuments();
	public abstract Document getDocumentById(String id);
	public abstract void saveDocument(Document document);
}