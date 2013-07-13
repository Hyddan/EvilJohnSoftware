package EvilJohn.Common;

import com.fourspaces.couchdb.*;

public class CouchDBManager extends DBManager
{
	private Session session;
	private Database database;
	
	public CouchDBManager(String dbUrl, String databaseName)
	{
		super(dbUrl, 5984);
		this.session = new Session(this.dbUrl, this.dbPort);
		this.database = session.getDatabase(databaseName);
	}

	public ViewResults AdHocView(String viewFunction) {
		return database.adhoc(viewFunction);
	}

	public ViewResults ExecView(String viewName) {
		return database.view(viewName);
	}

	public ViewResults GetAllDocuments() {
		return database.getAllDocuments();
	}

	public Document GetDocumentById(String id)
	{
		return database.getDocument(id);
	}
	
	public void SaveDocument(Document document)
	{
		database.saveDocument(document);
	}
}