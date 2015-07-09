package frd.dds.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import frd.dds.domain.Client;


public class ClientCache {
	
	public static Map<Long,Client> clients = new HashMap<Long,Client>();

	static{
		for(int i = 0; i<10; i++){
			Client c = new Client();
			clients.put(c.getId(), c);
		}
	}
	
	public static Client get(Long id){
		if(clients.containsKey(id))
			return clients.get(id);
		return null;
	}
	
	public static boolean add(Client c){
		boolean result = clients.containsKey(c.getId());
		clients.put(c.getId(), c);
		return result;
	}
	
	public static boolean remove(Long id){
		boolean result = clients.containsKey(id);
		if(result)
			clients.remove(id);
		return result;
	}

	public static ArrayList<Client> getAll() {
		return new ArrayList<Client>(clients.values());
	}
	
}
