package MediaManager;

import repository.MediaStore;
import repository.Sound;
import repository.AudioDB;
import repository.Helper;

public class MediaManagerImpl implements MediaStore{

	Sound sound;
	AudioDB audioDB;
	
	// Implementing download from interface MediaStore.
	@Override
	public void download(String url){
		Helper.assertNotNull(this.sound);
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here.
	}
	// Implementing upload from interface MediaStore.
	@Override
	public void upload(){
		Helper.assertNotNull(this.sound);
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here.
	}
	
	// Setter methods.
	public void setSound(Sound sound){
		Helper.assertNull(this.sound);
		this.sound = sound;
	}
	public void setAudioDB(AudioDB audioDB){
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
}

