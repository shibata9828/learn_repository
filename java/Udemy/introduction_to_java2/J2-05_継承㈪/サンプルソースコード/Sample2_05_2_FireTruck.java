import sample.Sample2_05_2_Car ;

class Sample2_05_2_FireTruck extends Sample2_05_2_Car {
	
	//---�t�B�[���h------------------------------------------------------
	//���Ȃ�
	
	//---�R���X�g���N�^--------------------------------------------------
	//���Ȃ�
	
	//---���\�b�h--------------------------------------------------------
	
	//paint���\�b�h�i�F��h��j���Z�b�g�ł���h���F�́uRED�v�̂�
	public void paint( String cl ){
		if( cl.equals( "RED" ) ){
			super.color = cl ;
		}
	}
	
	//accelerator���\�b�h�i���݂̑��x��1km/h�グ��j��80km/h�ȏ�ɂ͂Ȃ�Ȃ��悤����
	public void accelerator(){
		if( super.getSpeed() < 80 ){
			super.setSpeed( super.getSpeed() + 1 ) ;
		}
	}
	
}
