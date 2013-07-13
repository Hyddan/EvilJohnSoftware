package EvilJohn.Service.MetaPlay.Spiders;

public class HBONordicSpider extends Spider
{
	public HBONordicSpider()
	{
		super("HBONordic");
	}
	
	public void Crawl()
	{
		this.GetLastCrawlDate();
		
		//ToDo: implement crawl logic for HBO Nordic (Get everything with created/updated date newer than lastCrawlDate)
		
		this.SetLastCrawlDate();
	}

	public String GetName() {
		return this.name;
	}
}