package youTubeEgitim;

 abstract class  BaseCreditManager implements ICreditManager{

	
	public abstract  void Calculate() ;

	@Override
	public void Save() {
		System.out.println("kaydedildi");
		
	}

}
