package EvilJohn.Common;

public class DBManagerFactory
{
	public static DBManager Create(String dbUrl, String databaseName)
	{
		if(-1 < dbUrl.indexOf("localhost"))
		{
			return new CouchDBManager(dbUrl, databaseName);
		}
		
		return new NullDBManager();
	}
}
