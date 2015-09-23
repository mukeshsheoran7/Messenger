package com.sheoran.messenger.Messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.sheoran.messenger.Messenger.model.Message;
import com.sheoran.messenger.Messenger.model.Profile;

public class DatabaseClass {
	private static Map<Integer, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	
	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}
