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

	public ViewResults adHocView(String viewFunction) {
		return database.adhoc(viewFunction);
	}

	public ViewResults execView(String viewName) {
		return database.view(viewName);
	}

	public ViewResults getAllDocuments() {
		return database.getAllDocuments();
	}

	public Document getDocumentById(String id)
	{
		return database.getDocument(id);
	}
	
	public void saveDocument(Document document)
	{
		database.saveDocument(document);
	}
}