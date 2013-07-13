package EvilJohn.Service.MetaPlay.Spiders;

import java.util.Date;

public class WeLovePublicServiceSpider extends Spider
{
	public WeLovePublicServiceSpider()
	{
		super("WeLovePublicService");
	}
	
	public void Crawl()
	{
		Date lastCrawled = this.GetLastCrawlDate();
		
		if(null != lastCrawled)
		{
			//ToDo: implement crawl logic for We Love Public Service (Get everything with created/updated date newer than lastCrawlDate)
		}
		
		this.SetLastCrawlDate();
	}

	public String GetName() {
		return this.name;
	}
}
