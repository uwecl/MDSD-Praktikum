package WebGUI;

import repository.HTTP;
import repository.MediaStore;
import repository.Helper;

public class WebGUIImpl implements HTTP
{

	MediaStore mediaStore;
	
	// Implementing HTTPDownload from interface HTTP.
	@Override
	public void HTTPDownload(String url, int magicNumber)
	{
		Helper.assertNotNull(this.mediaStore);
		// TODO: Insert code here.
	}
	// Implementing HTTPUpload from interface HTTP.
	@Override
	public void HTTPUpload()
	{
		Helper.assertNotNull(this.mediaStore);
		// TODO: Insert code here.
	}
	
	// Setter methods.
	public void setMediaStore(MediaStore mediaStore){
		Helper.assertNull(this.mediaStore);
		this.mediaStore = mediaStore;
	}
}

