public class Sample2_07_1_Truck extends Sample2_07_1_AbstractTruck {
	
	//---�t�B�[���h------------------------------------------------------
	protected String color ;  //�h���F
	private   int    speed ;  //���݂̑��x
	
	//---�R���X�g���N�^--------------------------------------------------
	
	//�R���X�g���N�^�i�����Ȃ��j
	public Sample2_07_1_Truck(){
		this.color = "���o�^" ;  //�h���F
		this.speed = 0        ;  //���݂̑��x
	}
	
	//---���\�b�h------------------------------------------------
	
	//�����ۃ��\�b�h�̎���
	//paint���\�b�h�i�F��h��j���Z�b�g�ł���h���F�́uWHITE�v�uBLACK�v�uRED�v
	public void paint( String cl ){
		if( cl.equals( "WHITE" ) || cl.equals( "BLACK" )|| cl.equals( "RED" ) ){
			this.color = cl ;
		}
	}
	
	//�����ۃ��\�b�h�̎���
	//accelerator���\�b�h�i���݂̑��x��1km/h�グ��j��180km/h�ȏ�ɂ͂Ȃ�Ȃ��悤����
	public void accelerator(){
		if( this.speed < 180 ){
			this.speed++;
		}
	}
	
	//�����ۃ��\�b�h�̎���
	//brake���\�b�h�i���݂̑��x��1km/h������j��0km/h�ȉ��ɂ͂Ȃ�Ȃ��悤����
	public void brake(){
		if( this.speed > 0 ){
			this.speed--;
		}
	}
	
	//---getter/setter------------------------------------------------
	
	//color��getter
	public String getColor(){
		return this.color ;
	}
	
	//speed��getter/setter
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int s) {
		this.speed = s ;
	}
	
}
