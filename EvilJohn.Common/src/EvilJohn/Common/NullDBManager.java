package EvilJohn.Common;

import com.fourspaces.couchdb.Document;
import com.fourspaces.couchdb.ViewResults;

public class NullDBManager extends DBManager
{
	public NullDBManager() { super("", -1); }

	public ViewResults AdHocView(String viewFunction) { return null; }
	public ViewResults ExecView(String viewName) { return null; }
	public ViewResults GetAllDocuments() { return null; }
	public Document GetDocumentById(String id) { return null; }
	public void SaveDocument(Document document) { }
}
