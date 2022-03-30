package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	List<String> friends;
	Set<String> phones;
	Map<String, String> courses;
	Properties props;

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(List<String> friends, Set<String> phones, Map<String, String> courses, Properties props) {
		super();
		this.friends = friends;
		this.phones = phones;
		this.courses = courses;
		this.props = props;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", phones=" + phones + ", courses=" + courses + ", props=" + props + "]";
	}
	

}
