package EvilJohn.Common;

import com.fourspaces.couchdb.Document;
import com.fourspaces.couchdb.ViewResults;

public class NullDBManager extends DBManager
{
	public NullDBManager() { super("", -1); }

	public ViewResults adHocView(String viewFunction) { return null; }
	public ViewResults execView(String viewName) { return null; }
	public ViewResults getAllDocuments() { return null; }
	public Document getDocumentById(String id) { return null; }
	public void saveDocument(Document document) { }
}
