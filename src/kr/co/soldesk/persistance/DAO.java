package kr.co.soldesk.persistance;

import java.util.List;

public interface DAO {
	public List selectAll();
	public void insertOne(Object obj);
	public void updateOne(Object obj);
	public void deleteOne(int no);
	
	
	
}
