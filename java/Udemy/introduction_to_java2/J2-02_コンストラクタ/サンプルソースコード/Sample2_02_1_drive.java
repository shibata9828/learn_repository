class Sample2_02_1_drive {
	public static void main (String[] args) {
		
		//�V�i���I�@�F�Ԃ���ɓo�ꂳ����iSample2_02_1_car�N���X�̃C���X�^���X���j
		System.out.println("���V�i���I�@�F�Ԃ���ɓo�ꂳ����------------------") ;
		
		Sample2_02_1_car chocoCar = new Sample2_02_1_car();
		Sample2_02_1_car mocoCar  = new Sample2_02_1_car( "�N�[�y"   , "���R" , "RED"   , 100 , true );
		Sample2_02_1_car pochiCar = new Sample2_02_1_car( "�g���b�N" , "�|�`" , "WHITE" , 80  , true );
		
		System.out.println("��------------------------------------------------") ;
		
		
		//�V�i���I�A�F�Ԃ̏��i�����j�̊m�F�imocoCar�C���X�^���X�̃t�B�[���h�̊m�F�j
		System.out.println("���V�i���I�A�F�Ԃ̏��i�����j�̊m�F--------------") ;
		
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.carModel�F" + chocoCar.carModel ) ;
		System.out.println("chocoCar.owner   �F" + chocoCar.owner    ) ;
		System.out.println("chocoCar.color   �F" + chocoCar.color    ) ;
		System.out.println("chocoCar.speed   �F" + chocoCar.speed    ) ;
		System.out.println("chocoCar.right   �F" + chocoCar.right    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.carModel �F" + mocoCar.carModel  ) ;
		System.out.println("mocoCar.owner    �F" + mocoCar.owner     ) ;
		System.out.println("mocoCar.color    �F" + mocoCar.color     ) ;
		System.out.println("mocoCar.speed    �F" + mocoCar.speed     ) ;
		System.out.println("mocoCar.right    �F" + mocoCar.right     ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.carModel�F" + pochiCar.carModel ) ;
		System.out.println("pochiCar.owner   �F" + pochiCar.owner    ) ;
		System.out.println("pochiCar.color   �F" + pochiCar.color    ) ;
		System.out.println("pochiCar.speed   �F" + pochiCar.speed    ) ;
		System.out.println("pochiCar.right   �F" + pochiCar.right    ) ;
		
		System.out.println("��------------------------------------------------") ;
		
		
		//�V�i���I�B�F���\�b�h�̋N��&�m�F
		System.out.println("���V�i���I�B�F���\�b�h�̋N��&�m�F------") ;
		
		chocoCar.accelerator() ;    //chocoCar��accelerator���\�b�h�N��
		mocoCar.rightOff() ;        //mocoCar��rightOff���\�b�h�N��
		pochiCar.brake() ;          //pochiCar��brake���\�b�h�N��
		
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.carModel�F" + chocoCar.carModel ) ;
		System.out.println("chocoCar.owner   �F" + chocoCar.owner    ) ;
		System.out.println("chocoCar.color   �F" + chocoCar.color    ) ;
		System.out.println("chocoCar.speed   �F" + chocoCar.speed    ) ;
		System.out.println("chocoCar.right   �F" + chocoCar.right    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.carModel �F" + mocoCar.carModel  ) ;
		System.out.println("mocoCar.owner    �F" + mocoCar.owner     ) ;
		System.out.println("mocoCar.color    �F" + mocoCar.color     ) ;
		System.out.println("mocoCar.speed    �F" + mocoCar.speed     ) ;
		System.out.println("mocoCar.right    �F" + mocoCar.right     ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.carModel�F" + pochiCar.carModel ) ;
		System.out.println("pochiCar.owner   �F" + pochiCar.owner    ) ;
		System.out.println("pochiCar.color   �F" + pochiCar.color    ) ;
		System.out.println("pochiCar.speed   �F" + pochiCar.speed    ) ;
		System.out.println("pochiCar.right   �F" + pochiCar.right    ) ;
		
		System.out.println("��------------------------------------------------") ;
		
	}
}
