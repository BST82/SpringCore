package com.sprinCore.standalone.collection;

import java.util.List;

public class LinkedListOrListPerson {
private List<String>friends;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}


@Override
public String toString() {
	return "Person :- "+this.friends;
}


}
