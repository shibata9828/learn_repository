/*
�E�������ꂽ�u10�~�ʁv�u50�~�ʁv�u100�~�ʁv�u500�~�ʁv�̍��v���z���ȉ��̂悤�ɕ\������
  �u�������܂̓������z�́i���v���z�̒l�j�~�ł��v
�E�u1�~�ʁv�u5�~�ʁv���������ꂽ�ꍇ�͍��v���z�Ɋ܂߂��A�u�x���F1�~�ʂ͎g���܂���v�u�x���F5�~�ʂ͎g���܂���v�ƌx������
�E�d�݂Ƃ��Ăӂ��킵���Ȃ��l�͍��v���z�Ɋ܂߂��A�u�x���F�i���͂��ꂽ�l�j�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���v�ƌx������
  ��j���͒l777 �� �u�x���F777�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���v
*/
class Jihan{
	public static void main (String[] args) {
		
		int coinNum = args.length ;          //�������ꂽ�d�݂̖���
		int coinChk = 0 ;                    //�`�F�b�N�Ώۂ̍d�݂̋��z
		int coinSum = 0 ;                    //�������ꂽ�d�݂̍��v���z ���g�p�\�ȍd�݂݂̂ŎZ�o
		
		//�������ꂽ�d�݂�1�����`�F�b�N���A���v���z���擾�i�g�p�ł��Ȃ��ꍇ�̓G���[���b�Z�[�W���o�́j
		for(int i = 0 ; i < coinNum ; i++){
			
			//����̃��[�v�Ń`�F�b�N����d�݂��Z�b�g
			coinChk = Integer.parseInt(args[i]) ;
			
			//�`�F�b�N�ƍd�݂̎�ނɉ��������������{
			if( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ){
				
				//�g�p�\�ȍd�݂ł������ꍇ�AcoinSum�ɉ��Z
				coinSum += coinChk ;
				
			}else if( coinChk == 1 || coinChk == 5 ){
				
				//�g�p�s�\�ȍd�݂ł������ꍇ�A�G���[���b�Z�[�W�i�g�p�s�\�ȍd�݁j���o��
				System.out.println("�x���F" + coinChk + "�~�ʂ͎g���܂���");
				
			}else{
				
				//�s���ȍd�݂ł������ꍇ�A�G���[���b�Z�[�W�i�s���ȍd�݁j���o��
				System.out.println("�x���F" + coinChk + "�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���");
				
			}
		}
		
		//�������ꂽ�d�݂̍��v���z�����b�Z�[�W�Ƃ��ďo��
		System.out.println("�������܂̓������z��" + coinSum + "�~�ł�");
	}
}