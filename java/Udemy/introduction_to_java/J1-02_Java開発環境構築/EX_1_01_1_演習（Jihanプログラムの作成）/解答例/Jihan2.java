/*
�E�R�}���h���C�������Ɉȉ��̃��[����K�p
  �Ō�ɓ��͂��ꂽ�R�}���h���C�������F�w�����ꂽ���i�̒l�i
  ����ȊO�F�������ꂽ�d��
�E�󂯕t����d�݂́u10�~�ʁv�u50�~�ʁv�u100�~�ʁv�u500�~�ʁv�̂�
�E�u1�~�ʁv�u5�~�ʁv���������ꂽ�ꍇ�͍��v���z�Ɋ܂߂��A�u�x���F1�~�ʂ͎g���܂���v�u�x���F5�~�ʂ͎g���܂���v�ƌx������
�E�d�݂Ƃ��Ăӂ��킵���Ȃ��l�͍��v���z�Ɋ܂߂��A�u�x���F�i���͂��ꂽ�l�j�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���v�ƌx������
  ��j���͒l777 �� �u�x���F777�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���v
�E�������ꂽ�d�݂̍��v���z����w�����ꂽ���i�̒l�i�����������Ĉȉ��̂悤�ɂ��ނ�̃��b�Z�[�W��\��������
  �u�i���ނ�̋��z�j�~�̂��ނ�ł��B���肪�Ƃ��������܂����B�v

*/
class Jihan2{
	public static void main (String[] args) {
		
		int coinNum = args.length - 1 ;                         //�������ꂽ�d�݂̖���
		int coinChk = 0 ;                                       //�`�F�b�N�Ώۂ̍d�݂̋��z
		int coinSum = 0 ;                                       //�������ꂽ�d�݂̍��v���z ���g�p�\�ȍd�݂݂̂ŎZ�o
		int price   = Integer.parseInt(args[args.length - 1]) ; //�w�����ꂽ���i�̒l�i
		int change  = 0 ;                                       //���ނ�
		
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
		
		//���v���z����w�����ꂽ���i�̒l�i�������Ă��ނ���Z�o
		change = coinSum - price ;
		
		//���ނ�̃��b�Z�[�W��\��
		if(change > 0 ){
			System.out.println(change + "�~�̂��ނ�ł��B���肪�Ƃ��������܂����B");
		}else if( change == 0 ){
			System.out.println("���傤�ǂ̂��a����ł��B���肪�Ƃ��������܂����B");
		}else{
			System.out.println("����������Ȃ��ł��ˁE�E�E");
		}
	}
}