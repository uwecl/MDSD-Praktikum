package DBCache;

import repository.AudioDB;
import repository.Helper;

public class DBCacheImpl implements AudioDB{

	AudioDB audioDB;
	
	// Implementing queryDB from interface AudioDB.
	@Override
	public void queryDB(){
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here.
	}
	// Implementing addFile from interface AudioDB.
	@Override
	public void addFile(){
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here.
	}
	
	// Setter methods.
	public void setAudioDB(AudioDB audioDB){
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
}

