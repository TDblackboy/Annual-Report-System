package per.sun.dao;

import java.util.List;

import per.sun.modal.User;

public interface UserDaoIF {
	void add(User user);
	void deleted(int userId);
	void update(User user);
	User load(int userId);
	List<User> load();
	User load(String name);
}
