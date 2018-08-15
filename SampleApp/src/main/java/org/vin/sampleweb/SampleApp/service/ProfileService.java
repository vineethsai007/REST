package org.vin.sampleweb.SampleApp.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vin.sampleweb.SampleApp.database.DatabaseClass;
import org.vin.sampleweb.SampleApp.model.Profile;



public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		  if (profiles.size()==0) 
		  {
		   profiles.put("Vineeth",new Profile(1L,"Vineeth", "ara" , "vineeth"));
		   profiles.put("Swathi",new Profile(2L,"Swathi", "a" , "motivator"));
		   
		  }
		  }
	
//	public ProfileService() {
	//	profiles.put("vineeth", new Profile(1L, "vineeth", "ara", "vineeth"));
//	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values()); 
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
	
}
