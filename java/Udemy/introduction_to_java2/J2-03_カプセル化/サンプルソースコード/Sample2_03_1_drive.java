class Sample2_03_1_drive {
	public static void main (String[] args) {
		
		//�V�i���I�@�F�Ԃ���ɓo�ꂳ����iSample2_03_1_car�N���X�̃C���X�^���X���j
		
		Sample2_03_1_car chocoCar = new Sample2_03_1_car();
		Sample2_03_1_car mocoCar  = new Sample2_03_1_car( "�N�[�y"   , "���R" , "RED"   , 100 , true );
		Sample2_03_1_car pochiCar = new Sample2_03_1_car( "�g���b�N" , "�|�`" , "WHITE" , 80  , true );
		
		
		//�V�i���I�A�F�e�C���X�^���X�̃t�B�[���h�̏�Ԃ��m�F�i�C���X�^���X������j
		System.out.println("���V�i���I�A�F�e�C���X�^���X�̃t�B�[���h�̏�Ԃ��m�F�i�C���X�^���X������j------") ;
				
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.getCarModel()�F" + chocoCar.getCarModel() ) ;
		System.out.println("chocoCar.getOwner()   �F" + chocoCar.getOwner()    ) ;
		System.out.println("chocoCar.getColor()   �F" + chocoCar.getColor()    ) ;
		System.out.println("chocoCar.getSpeed()   �F" + chocoCar.getSpeed()    ) ;
		System.out.println("chocoCar.getRight()   �F" + chocoCar.getRight()    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.getCarModel() �F" + mocoCar.getCarModel() ) ;
		System.out.println("mocoCar.getOwner()    �F" + mocoCar.getOwner()    ) ;
		System.out.println("mocoCar.getColor()    �F" + mocoCar.getColor()    ) ;
		System.out.println("mocoCar.getSpeed()    �F" + mocoCar.getSpeed()    ) ;
		System.out.println("mocoCar.getRight()    �F" + mocoCar.getRight()    ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.getCarModel()�F" + pochiCar.getCarModel() ) ;
		System.out.println("pochiCar.getOwner()   �F" + pochiCar.getOwner()    ) ;
		System.out.println("pochiCar.getColor()   �F" + pochiCar.getColor()    ) ;
		System.out.println("pochiCar.getSpeed()   �F" + pochiCar.getSpeed()    ) ;
		System.out.println("pochiCar.getRight()   �F" + pochiCar.getRight()    ) ;
		
		
		//�V�i���I�B�F�e�C���X�^���X�̃��\�b�h�����s
		chocoCar.paint( "BLACK" ) ;        //chocoCar�Fpaint���\�b�h�N���i�ݒ萬���j
		mocoCar.paint(  "GOLD"  ) ;        //mocoCar �Fpaint���\�b�h�N���i�ݒ莸�s�j
		pochiCar.rightOn() ;               //pochiCar�FrightOn���\�b�h�N���itrue�Őݒ�j
		
		for(int i = 0 ; i < 100 ; i++){
			chocoCar.accelerator() ;       //chocoCar�Faccelerator���\�b�h�N���i���x��100km/h�㏸�j
			mocoCar.accelerator() ;        //mocoCar �Faccelerator���\�b�h�N���i���x���ő�l180km/h�ɂȂ�j
			pochiCar.brake() ;             //pochiCar�Fbrake���\�b�h�N���i���x���ŏ��l0km/h�ɂȂ�j
		}
		
		//�V�i���I�C�F�e�C���X�^���X�̃t�B�[���h�̏�Ԃ��m�F�i���\�b�h���s��j
		System.out.println("���V�i���I�C�F�e�C���X�^���X�̃t�B�[���h�̏�Ԃ��m�F�i���\�b�h���s��j------") ;
				
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.getCarModel()�F" + chocoCar.getCarModel() ) ;
		System.out.println("chocoCar.getOwner()   �F" + chocoCar.getOwner()    ) ;
		System.out.println("chocoCar.getColor()   �F" + chocoCar.getColor()    ) ;
		System.out.println("chocoCar.getSpeed()   �F" + chocoCar.getSpeed()    ) ;
		System.out.println("chocoCar.getRight()   �F" + chocoCar.getRight()    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.getCarModel() �F" + mocoCar.getCarModel() ) ;
		System.out.println("mocoCar.getOwner()    �F" + mocoCar.getOwner()    ) ;
		System.out.println("mocoCar.getColor()    �F" + mocoCar.getColor()    ) ;
		System.out.println("mocoCar.getSpeed()    �F" + mocoCar.getSpeed()    ) ;
		System.out.println("mocoCar.getRight()    �F" + mocoCar.getRight()    ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.getCarModel()�F" + pochiCar.getCarModel() ) ;
		System.out.println("pochiCar.getOwner()   �F" + pochiCar.getOwner()    ) ;
		System.out.println("pochiCar.getColor()   �F" + pochiCar.getColor()    ) ;
		System.out.println("pochiCar.getSpeed()   �F" + pochiCar.getSpeed()    ) ;
		System.out.println("pochiCar.getRight()   �F" + pochiCar.getRight()    ) ;
		
	}
}
