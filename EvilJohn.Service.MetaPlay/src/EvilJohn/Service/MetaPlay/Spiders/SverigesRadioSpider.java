package EvilJohn.Service.MetaPlay.Spiders;

public class SverigesRadioSpider extends Spider
{
	public SverigesRadioSpider()
	{
		super("SverigesRadio");
	}
	
	public void Crawl()
	{
		this.GetLastCrawlDate();
		
		//ToDo: implement crawl logic for Sveriges Radio (Get everything with created/updated date newer than lastCrawlDate)
		
		this.SetLastCrawlDate();
	}

	public String GetName() {
		return this.name;
	}
}