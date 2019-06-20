
package per.sun.dao;

import java.util.List;

import per.sun.modal.Platform;

public interface PlatformQuery {
	
	List<Platform> search();
	
	List<Platform> search(String str);
	
	List<Platform> search(String type,String choose);//(1,ptype),(2,pjibie),(3,all)
	
	List<Platform> search(Platform platform);

	Platform load(String pname);
}
