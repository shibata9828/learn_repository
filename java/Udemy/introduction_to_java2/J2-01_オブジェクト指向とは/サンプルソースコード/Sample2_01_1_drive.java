class Sample2_01_1_drive {
	public static void main (String[] args) {
		
		//�V�i���I�@�F�Ԃ���ɓo�ꂳ����iSample2_01_1_car�N���X�̃C���X�^���X���j
		System.out.println("���V�i���I�@�F�Ԃ���ɓo�ꂳ����------------------") ;
		
		Sample2_01_1_car mocoCar  = new Sample2_01_1_car();
		Sample2_01_1_car chocoCar = new Sample2_01_1_car();
		
		
		//�V�i���I�A�F�Ԃ̏��i�����j�̊m�F�imocoCar�C���X�^���X�̃t�B�[���h�̊m�F�j
		System.out.println("���V�i���I�A�F�Ԃ̏��i�����j�̊m�F�imocoCar�C���X�^���X�̃t�B�[���h�̊m�F�j--------------") ;
		
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.carModel�F" + mocoCar.carModel ) ;
		System.out.println("mocoCar.owner   �F" + mocoCar.owner    ) ;
		System.out.println("mocoCar.color   �F" + mocoCar.color    ) ;
		System.out.println("mocoCar.speed   �F" + mocoCar.speed    ) ;
		System.out.println("mocoCar.right   �F" + mocoCar.right    ) ;
		
		
		//�V�i���I�B�F�Ԃ̏��i�����j�̊m�F�ichocoCar�C���X�^���X�̃t�B�[���h�̊m�F�ispeed�̂݁j�j
		System.out.println("���V�i���I�B�F�Ԃ̏��i�����j�̊m�F�ichocoCar�C���X�^���X�̃t�B�[���h�̊m�F�ispeed�̂݁j�j--------------") ;
		
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.speed  �F" + chocoCar.speed   ) ;
		
		
		//�V�i���I�C�Faccelerator���\�b�h�̋N��&�m�F
		System.out.println("���V�i���I�C�Faccelerator���\�b�h�̋N��&�m�F------") ;
		
		mocoCar.accelerator();
		
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.carModel�F" + mocoCar.carModel ) ;
		System.out.println("mocoCar.owner   �F" + mocoCar.owner    ) ;
		System.out.println("mocoCar.color   �F" + mocoCar.color    ) ;
		System.out.println("mocoCar.speed   �F" + mocoCar.speed    ) ;
		System.out.println("mocoCar.right   �F" + mocoCar.right    ) ;
		
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.speed  �F" + chocoCar.speed   ) ;
		
		
	}
}
