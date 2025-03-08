package in.prakashbabu;

import java.util.Stack;

public class Student {
	int sid;
	String name;
	Student(int sid,String name){
	this.sid = sid;
	this.name = name;
	}
	public String toString(){
	return "("+sid+","+name+")";
	}

}
