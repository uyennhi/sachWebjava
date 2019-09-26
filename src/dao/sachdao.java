package dao;

import java.util.ArrayList;

import bean.sachbean;

public class sachdao {
	public ArrayList<sachbean> getsach(){
		ArrayList<sachbean> ds = new ArrayList<sachbean>();
		ds.add(new sachbean("s1","csdl","nttnhi", (long)50000,"b1.jpg"));
		ds.add(new sachbean("s2","csdl","nttnhi", (long)50000,"b2.jpg"));
		ds.add(new sachbean("s3","csdl","nttnhi", (long)50000,"b3.jpg"));
		ds.add(new sachbean("s4","csdl","nttnhi", (long)50000,"b4.jpg"));
		ds.add(new sachbean("s5","csdl","nttnhi", (long)50000,"b5.jpg"));
		
		return ds;
	}
}
