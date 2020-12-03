package two;

import java.util.*;

public interface NameDao {

	public List getNameFromArray(String[] names);

	public int searchName(List nameList, String name);

	public boolean removeFromList(List<String> nameList, int id);

}
