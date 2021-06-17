package model;

import java.util.List;

public interface GenericDao<T> {

	public <E> T find(E id);

	public List<T> list();

	public void insert(T Entity);

	public void update(T Entity);

	public void delete(T Entity);
}