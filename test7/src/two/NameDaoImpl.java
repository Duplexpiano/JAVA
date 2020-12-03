package two;

import java.util.*;
import java.util.ListIterator;

public class NameDaoImpl implements NameDao {

	// 将数组中的字符串放入列表
	@Override
	public List<String> getNameFromArray(String[] names) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		ListIterator it = nameList.listIterator();

		for (String name : names) {
			it.add(name);
		}

		return nameList;
	}

	// 在列表中搜索到与name相同的项目，就返回该name所在的序号，找不到返回-1。
	@Override
	public int searchName(List nameList, String name) {
		// TODO Auto-generated method stub
		ListIterator it = nameList.listIterator();
		while (it.hasNext()) {
			if (it.next() == name) {
				return it.nextIndex() - 1;
			}
		}
		return -1;
	}

	// 根据指定id，从列表中移除指定的项目，如果id指定错误(负数或者超出列表最大值)抛出IllegalArgumentException异常，移除成功返回true
	@Override
	public boolean removeFromList(List<String> nameList, int id) {
		// TODO Auto-generated method stub
		ListIterator it = nameList.listIterator();

		while(it.hasNext()) {
			if(it.next() == nameList.get(id)) {
				
				it.remove();
				return true;
			}
		}
		
		if (id < 0 || id > nameList.size())
			throw new IllegalArgumentException();

		if (nameList.remove(id) != null) {
			return true;
		}

		return false;
	}
}
