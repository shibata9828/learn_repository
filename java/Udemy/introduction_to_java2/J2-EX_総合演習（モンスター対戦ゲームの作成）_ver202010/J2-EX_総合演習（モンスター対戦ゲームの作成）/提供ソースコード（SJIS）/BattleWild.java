package churimon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BattleWild {

	//�t�B�[���h�i�萔�j
	final int ESCAPE_SUCCESS_ST_RATE = 50 ;     //�u�ɂ���v�������̊�l�i50%�j

	//�₹���̃����X�^�[�Ƃ̃o�g��
	public void mainBattle () {

		//�o�g��������C���X�^���X��
		Fushigiyade enemy = new Fushigiyade("�₹��","�t�V�M���f",20);
		prinTextAsGame("�����I �₹���� " + enemy.getCharacter() + " �� �Ƃт����Ă����I");
		//�������͂����܂őҋ@
		System.out.println("��");
		pushBtn();

		//�����̃����X�^�[���C���X�^���X��
		System.out.println("");
		Hitokake myMonster = new Hitokake("�ڂ�","�J�P�Y",21);
		prinTextAsGame("�䂯�I " + myMonster.getName() + "�I");
		//�������͂����܂őҋ@
		System.out.println("��");
		pushBtn();

		//�o�g���Ŏg�p���郍�[�J���ϐ��̒�`
		boolean winFlg      = true;    //�����t���O�i�����ltrue�j
		boolean escapeFlg   = false;   //�����t���O�i�����lfalse�j
		int turn = 0;                    //�^�[�����i�����l0�j
		int dmg;                         //�^����_���[�W
		String cmd;                      //�v���C���[����̓��̓R�}���h
		boolean firstAtkFlg;           //��U�t���O

		//�ǂ��炩��HP�[���ɂȂ邩�u�ɂ���v����������܂Ńo�g�����J��Ԃ�
		while(myMonster.getHp() > 0 && enemy.getHp() > 0){

			//�^�[���J�n���Ƀ��[�J���ϐ���������
			turn = turn + 1;     //�J��Ԃ��̂��тɃ^�[������+1����
			dmg  = 0;
			cmd  = null;
			firstAtkFlg = true;  //��U�t���O�i�����ltrue�j

			//�^�[�����̕\��
			System.out.println("");
			System.out.println("�`�`�` �^�[��" + turn + " �`�`�`");

			//�݂��̃X�e�[�^�X��\��
			System.out.println("");
			System.out.println("�����āF" + enemy.getStatus() );
			System.out.println("������F" + myMonster.getStatus() );

			//getCmd���\�b�h����R�}���h���󂯎��
			System.out.println("");
			cmd = getCmd(myMonster.getName());

			//��U�E��U�����肷��
			if(myMonster.getSpd() < enemy.getSpd()){
				//����̃����X�^�[�ƃX�s�[�h���r���A���肪������ΐ�U�t���O��false�ɕς���
				firstAtkFlg = false;
			}else if (myMonster.getSpd() == enemy.getSpd()){
				//�X�s�[�h���S�������ł����50%�̊m���Ő�U�t���O��false�ɕς���
				firstAtkFlg = judgeFiftyFifty();
			}

			if(firstAtkFlg){
				//�����̃����X�^�[����U�̏ꍇ

				//�����̃����X�^�[�̍s��
				System.out.println("");
				if(cmd.equals("1")){
					//�u���������v�R�}���h�̏ꍇ

					//����̃����X�^�[�Ƀ_���[�W��^����
					dmg = enemy.damaged(myMonster.useWaza());
					prinTextAsGame(myMonster.getName() + "�� " + myMonster.getWazaNm() + " �I");
					prinTextAsGame("  ��  " + enemy.getName() + " �� " + dmg + " �̃_���[�W �� �������I");

				}else if(cmd.equals("2")){
					//�u�ɂ���v�R�}���h�̏ꍇ

					//�u�ɂ���v�����������ꍇ�͌J��Ԃ��𔲂��A���s�����ꍇ�́u�ɂ����Ȃ��I�v�ƕ\������
					escapeFlg = challengeEscape(myMonster.getSpd() , enemy.getSpd());
					if(escapeFlg){
						break;
					}else{
						System.out.println("");
						prinTextAsGame("�ɂ����Ȃ��I");
					}
				}
				//�������͂����܂őҋ@
				System.out.println("��");
				pushBtn();

				//����̃����X�^�[�̍s��(HP���[���̍ۂ͉������Ȃ�)
				System.out.println("");
				if(enemy.getHp() > 0){

					//����̃����X�^�[����_���[�W���󂯂�
					dmg = myMonster.damaged(enemy.useWaza());
					prinTextAsGame(enemy.getName() + "�� " + enemy.getWazaNm() + " �I");
					prinTextAsGame("  ��  " + myMonster.getName() + " �� " + dmg + " �̃_���[�W �� �������I");
					//�����̃����X�^�[��HP��0�̏ꍇ�͏����t���O��false�ɕς���
					if(myMonster.getHp()==0){
						winFlg = false;
					}
				}
				//�������͂����܂őҋ@
				System.out.println("��");
				pushBtn();

			}else{
				//�����̃����X�^�[����U�̏ꍇ

				//����̃����X�^�[�̍s��
				System.out.println("");
				//����̃����X�^�[����_���[�W���󂯂�
				dmg = myMonster.damaged(enemy.useWaza());
				prinTextAsGame(enemy.getName() + "�� " + enemy.getWazaNm() + " �I");
				prinTextAsGame("  ��  " + myMonster.getName() + " �� " + dmg + " �̃_���[�W �� �������I");
				//�����̃����X�^�[��HP��0�̏ꍇ�͏����t���O��false�ɕς���
				if(myMonster.getHp()==0){
					winFlg = false;
				}
				//�������͂����܂őҋ@
				System.out.println("��");
				pushBtn();

				//�����̃����X�^�[�̍s��(HP���[���̍ۂ͉������Ȃ�)
				System.out.println("");
				if(myMonster.getHp() > 0){
					if(cmd.equals("1")){
						//�u���������v�R�}���h�̏ꍇ

						//����̃����X�^�[�Ƀ_���[�W��^����
						dmg = enemy.damaged(myMonster.useWaza());
						prinTextAsGame(myMonster.getName() + "�� " + myMonster.getWazaNm() + " �I");
						prinTextAsGame("  ��  " + enemy.getName() + " �� " + dmg + " �̃_���[�W �� �������I");

					}else if(cmd.equals("2")){
						//�u�ɂ���v�R�}���h�̏ꍇ

						//�u�ɂ���v�����������ꍇ�͌J��Ԃ��𔲂��A���s�����ꍇ�́u�ɂ����Ȃ��I�v�ƕ\������
						escapeFlg = challengeEscape(myMonster.getSpd() , enemy.getSpd());
						if(escapeFlg){
							break;
						}else{
							System.out.println("");
							prinTextAsGame("�ɂ����Ȃ��I");
						}
					}
				}
				//�������͂����܂őҋ@
				System.out.println("��");
				pushBtn();
			}
		}

		//�o�g������
		if(escapeFlg){
			System.out.println("");
			prinTextAsGame("���܂� �ɂ����ꂽ�I");
		}else{
			if(winFlg){
				System.out.println("");
				prinTextAsGame(enemy.getTrainer() + "�� " +  enemy.getCharacter() +  " �� �����ꂽ�I");
			}else{
				System.out.println("");
				prinTextAsGame(myMonster.getTrainer() +  "�� �߂̂܂��� �܂������ �Ȃ����I");
			}
		}
		System.out.println("�i�o�g���I���j");
	}

	//�퓬�R�}���h���󂯕t����
	//�������I�Ɏg�����\�b�h�Ȃ̂�private�ݒ�ɂ���
	private String getCmd(String monsterName) {
		BufferedReader br = null;
		String cmdin = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			do {
				//
				prinTextAsGame(monsterName + "�� �ǂ�����H");
				System.out.println("1:�������� 2:�ɂ���");
				System.out.println("��");
				cmdin = br.readLine();

				if(!(cmdin.equals("1") || cmdin.equals("2"))){
					System.out.println("[INFO]�R�}���h���s���ł��B�ē��͂��Ă��������B");
				}
			} while(!(cmdin.equals("1") || cmdin.equals("2")));

		} catch(IOException e) {
			e.printStackTrace();
		}

		return cmdin;
	}

	//��������̓��͂�����܂őҋ@����
	//�������I�Ɏg�����\�b�h�Ȃ̂�private�ݒ�ɂ���
	private String pushBtn() {
		BufferedReader br = null;
		String cmdin = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			cmdin = br.readLine();
			System.out.println("");
		} catch(IOException e) {
			e.printStackTrace();
		}
		return cmdin;
	}

	//�R�}���h�u�ɂ���v�I�����̏���
	//�������I�Ɏg�����\�b�h�Ȃ̂�private�ݒ�ɂ���
	private boolean challengeEscape(int spMy, int spEn) {
		boolean escapeFlag;

		//�������i100���z���邱�Ƃ������j
		int success_rate = (int) ESCAPE_SUCCESS_ST_RATE * spMy / spEn ;

		//1�`100�̃����_���Ȑ������擾
		int rndmNum = 1 + (int)(Math.random() * 100.0);

		//1�`100�̃����_���Ȑ�����萬�����̕���������΁u������v����
		if(rndmNum < success_rate){
			escapeFlag = true;
		}else{
			escapeFlag = false;
		}
		return escapeFlag;
	}

	//50%�̊m����true��Ԃ��i���΂₳�������������ꍇ�ɂǂ�����U�Ƃ��邩���߂�ۂɎg�p�j
	//�������I�Ɏg�����\�b�h�Ȃ̂�private�ݒ�ɂ���
	private boolean judgeFiftyFifty() {
		boolean judge = true ;

		//0��1�������_���Ŏ擾
		int rndmNum = (int)(Math.random() * 2.0);

		if(rndmNum == 0){
			judge = false ;
		}
		return judge;
	}

	//�������Q�[���̂悤�ɕ\���i50�~���b��1�����j
	//�������I�Ɏg�����\�b�h�Ȃ̂�private�ݒ�ɂ���
	private void prinTextAsGame(String txt){

		//�������z���1�������Z�b�g
		char data[] = txt.toCharArray();
		
		//�z�񐔂��擾
		int arr_num = data.length;
		
		for (int i = 0; i < arr_num; i++) {
			
			try{
				//�w��~���b�̊Ԗ���
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.print(data[i]);
		}
		System.out.print("\n");
	}
}