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

	public abstract ViewResults AdHocView(String viewFunction);
	public abstract ViewResults ExecView(String viewName);
	public abstract ViewResults GetAllDocuments();
	public abstract Document GetDocumentById(String id);
	public abstract void SaveDocument(Document document);
}