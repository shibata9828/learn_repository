import sample.Sample2_05_2_Car ;

class Sample2_05_2_Drive {
	public static void main (String[] args) {
		
		//�V�i���I�@�F�Ԃ���ɓo�ꂳ����iSample2_05_2_Car�N���X�̃C���X�^���X���j
		
		Sample2_05_2_Car       car1       = new Sample2_05_2_Car() ;
		Sample2_05_2_FireTruck fireTruck1 = new Sample2_05_2_FireTruck() ;
		
		
		//�V�i���I�A�Fpaint���\�b�h�̋N��
		
		car1.paint( "BLACK" );
		fireTruck1.paint( "BLACK" );
		
		
		//�V�i���I�B�Fpaint���\�b�h�̋N��
		
		//����200km/h�܂ŉ���
		for(int i = 0 ; i < 200 ; i++){
			
			car1.accelerator();
			fireTruck1.accelerator();
			
		}
		
		
		//�V�i���I�C�F�e�t�B�[���h�̊m�F
		System.out.println("���V�i���I�C�F�e�t�B�[���h�̊m�F------") ;
		
		System.out.println("car1.color       �F"       + car1.getColor() ) ;
		System.out.println("car1.speed       �F"       + car1.getSpeed() ) ;
		System.out.println("fireTruck1.color �F" + fireTruck1.getColor() ) ;
		System.out.println("fireTruck1.speed �F" + fireTruck1.getSpeed() ) ;
		
	}
}
