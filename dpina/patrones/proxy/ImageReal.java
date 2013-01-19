package dpina.patrones.proxy;

public class ImageReal implements Image {

	public ImageReal(String pathImage){
		loadImage(pathImage);
	}
	
	private void loadImage(String pathImage) {
		// TODO Auto-generated method stub
		//Carga intensiva en CPU
	}

	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		
	}
}
