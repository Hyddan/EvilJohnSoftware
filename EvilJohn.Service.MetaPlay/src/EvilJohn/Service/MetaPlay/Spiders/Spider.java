package EvilJohn.Service.MetaPlay.Spiders;

public abstract class Spider
{
	protected String name;
	
	public Spider(String name)
	{
	}
	
	public abstract void Crawl();
	public abstract String GetName();
}
