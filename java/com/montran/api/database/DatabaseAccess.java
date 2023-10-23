package com.montran.api.database;
import java.util.*;
import com.montran.api.model.Message;

public class DatabaseAccess {
	
	private static Map<Integer,Message> messageMap = new HashMap<>() ;
	
	public static Map getMessages() {
		return messageMap;
	}
}
