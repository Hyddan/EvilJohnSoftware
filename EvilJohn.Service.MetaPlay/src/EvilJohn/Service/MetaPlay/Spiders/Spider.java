package EvilJohn.Service.MetaPlay.Spiders;

import com.fourspaces.couchdb.Document;
import EvilJohn.Common.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Spider
{
	protected DBManager dbManager;
	protected SimpleDateFormat lastCrawlDateFormat;
	protected String name;
	
	public Spider(String name)
	{
		this.dbManager = DBManagerFactory.Create("localhost", "episodes");
		this.lastCrawlDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		this.name = name;
	}
	
	public abstract void Crawl();
	public abstract String GetName();
	
	public Date GetLastCrawlDate()
	{
		Date lastCrawled = null;
		
		try
		{
			lastCrawled = this.lastCrawlDateFormat.parse(this.dbManager.GetDocumentById("lastCrawlDates").getString(this.GetName()));
		}
		catch (Exception ex)
		{
			try
			{
				lastCrawled = this.lastCrawlDateFormat.parse("2000-01-01T00:00:00Z");
			}
			catch (ParseException pex)
			{
			}
		}
		
		return lastCrawled;
	}
	
	public void SetLastCrawlDate()
	{
		Document _lastCrawlDates = this.dbManager.GetDocumentById("lastCrawlDates");
		_lastCrawlDates.put(this.GetName(), this.lastCrawlDateFormat.format(Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT")).getTime()));
		this.dbManager.SaveDocument(_lastCrawlDates);
	}
}