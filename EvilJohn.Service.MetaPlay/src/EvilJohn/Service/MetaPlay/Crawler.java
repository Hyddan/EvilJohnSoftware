package EvilJohn.Service.MetaPlay;

import EvilJohn.Service.MetaPlay.Spiders.*;
import java.util.*;

public class Crawler {
	public static void main(String[] args) {
		ArrayList<Spider> spiders = new ArrayList<Spider>();
		spiders.add(new WeLovePublicServiceSpider());
		
		for (Spider spider : spiders) {
			System.out.println(spider.GetName());
		}
	}
}