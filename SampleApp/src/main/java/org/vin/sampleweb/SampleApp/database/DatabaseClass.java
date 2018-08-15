package org.vin.sampleweb.SampleApp.database;

import java.util.HashMap;
import java.util.Map;

import org.vin.sampleweb.SampleApp.model.Profile;
import org.vin.sampleweb.SampleApp.model.Message;

public class DatabaseClass {

	public static Map<Long, Message> messages= new HashMap<>();
	//public static Map<Long, Profiles> profiles= new HashMap<>();
	public static Map<String, Profile> profiles= new HashMap<>();//changed long to string because we are willing to lookup using names
	
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	//public static Map<Long, Profiles> getProfiles(){
	public static Map<String, Profile> getProfiles(){

		return profiles;
	}

	}