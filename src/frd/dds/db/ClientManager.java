package frd.dds.db;

import frd.dds.cache.ClientCache;
import frd.dds.domain.Client;

public class ClientManager {
	
	public static Client createClient(String name, String address){
		Client c = new Client(name, address);
		ClientCache.add(c);
		return c;
	}

}
