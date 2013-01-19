package dpina.patrones.proxy;

public class ImageProxy implements Image {

	private String pathImage;
	private ImageReal imageReal;
	
	public ImageProxy(String pathImage){
		this.pathImage=pathImage;
	}
	
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		imageReal= new ImageReal(pathImage);
		imageReal.showImage();
	}	
}
