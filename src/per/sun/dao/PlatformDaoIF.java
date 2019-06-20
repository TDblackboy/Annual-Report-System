package per.sun.dao;

import java.util.List;

import per.sun.modal.Platform;

public interface PlatformDaoIF {
	void add(Platform platform,int i);
	void delete(int pid);
	void update(Platform platform,int i);
	Platform load(int pid);
	List<Platform> load();
	//userid”≥…‰pid
	int seek(String name);
}
