package churimon;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster1 {

	//------------�t�B�[���h------------
	String character     = "(unknown)"  ;       //�푰
	String trainer       = "(wild)"     ;       //�g���[�i�[
	String name          = "(noname)"   ;       //�Ȃ܂�
	int    lv            = 1            ;       //���x��
	int    hp            = 80           ;       //HP
	int    atk           = 15           ;       //��������
	int    def           = 10           ;       //�ڂ�����
	int    spd           = 10           ;       //���΂₳
	int    hpMax         = 80           ;       //HP�����l
	String wazaNm        = "����������" ;       //�킴�i�Ȃ܂��j
	String wazaDmgRate   = "1.0"        ;       //�킴�i�_���[�W�{���j
	//------------�t�B�[���h(�萔)------------
	final String WAZA_DMG_RATE_REGEXP = "^[0-9]+\\.[0-9]$"  ;  //�o���f�[�V�����`�F�b�N�Ŏg�p���鐳�K�\��
	final String DMG_CORRECTION_120 = "120" ;                     //�_���[�W�v�Z�̕␳�Ŏg������
	final String DMG_CORRECTION_1   = "1"   ;                     //�_���[�W�v�Z�̕␳�Ŏg������

	//------------toString���\�b�h------------
	//���ׂẴt�B�[���h�̒l��Ԃ� �������܂Ńv���O���}�[�̊m�F�p�Ƃ��Ďg�p����
	public String toString(){
		String status = "[ " +  name  + " lv" + lv  + " HP" + hp + "/" + hpMax
		                + " ] (status) character:" + character + " trainer:" + trainer
		                + " atk:" + atk + " def:" + def + " spd:" + spd + " wazaNm:"
		                + wazaNm + " wazaDmgRate:" + wazaDmgRate ;
		return status;
	}
	//------------���\�b�h------------
	//levelUp���\�b�h
	//[����:���x���iint�^�j/�߂�l:�Ȃ�/�@�\:���������Ƀt�B�[���h�̒l���X�V����]
	void levelUp(int up){
		lv    = lv    + 1  * up  ;
		hpMax = hpMax + 30 * up  ;
		atk   = atk   + 5  * up  ;
		def   = def   + 5  * up  ;
		spd   = spd   + 5  * up  ;
		hp    = hpMax ;
	}

	//setWaza���\�b�h
	//[����1:�킴���iString�^�j,����2:�_���[�W�iString�^�j/�߂�l:�Ȃ�/�@�\:�킴���Ƃ��̃_���[�W��ݒ肷��]
	void setWaza(String nm, String dmr){

		//�o���f�[�V�����`�F�b�N�F����2���uX.X(X��0�`9�̐����̂����ꂩ)�v�`���œn���ꂽ�����`�F�b�N
		if(dmr.matches(WAZA_DMG_RATE_REGEXP)){
			wazaNm  = nm;
			wazaDmgRate = dmr;
		}else{
			System.out.println("[ERROR]�킴�̐ݒ�Ɏ��s���܂���");
		}
	}

	//getStatus���\�b�h
	//[����:�Ȃ�/�߂�l:�X�e�[�^�X���/�@�\:�X�e�[�^�X���i�ꕔ�t�B�[���h�̏��j�𕶎���ŕԂ�]
	String getStatus(){

		//�X�e�[�^�X���̐��`	�E�E�E �y��z[ �s�J�� lv20 HP500/688 ]
		String status = "[ " +  name  + " lv" + lv  + " HP" + hp + "/" + hpMax + " ]";

		return status;
	}

	//useWaza���\�b�h
	//[����:�Ȃ�/�߂�l:����ɒl�n������_���[�W�iint�^�j/�@�\:����ɒl�n�����闝�_��̃_���[�W���v�Z���ĕԂ�]
	int useWaza(){

		//����ɒl�n������_���[�W�̌v�Z���@�F���������~�킴�̃_���[�W�{��
		//BigDecimal�Ōv�Z�����l�̏����_�ȉ���؂�̂āABigDecimal�^��int�^�ւƕϊ�
		BigDecimal bdAtk  = new BigDecimal(atk);
		BigDecimal bdDmrt = new BigDecimal(wazaDmgRate);
		int dmg = ( bdAtk.multiply(bdDmrt) ).intValue();

		return dmg;
	}

	//damaged���\�b�h
	//[����:�l�n�����ꂽ�_���[�W�iint�^�j/�߂�l:���ۂɎ󂯂�_���[�W�iint�^�j/�@�\:���ۂɎ󂯂�_���[�W���v�Z����HP���猸�Z����]
	int damaged(int orgDm){
		BigDecimal bdOrgDm   = new BigDecimal(orgDm);
		BigDecimal bdDmCr120 = new BigDecimal(DMG_CORRECTION_120);
		BigDecimal bdDmCr1   = new BigDecimal(DMG_CORRECTION_1);
		BigDecimal bdDef     = new BigDecimal(def);

		//�_���[�W���Z���F1 / (1�{�ڂ����偀120)  ��������R�ʐ؂�̂�
		BigDecimal dmRate = bdDmCr1.divide( bdDmCr1.add( bdDef.divide(bdDmCr120, 2, RoundingMode.DOWN) ), 2, RoundingMode.DOWN );

		//BigDecimal�Ōv�Z�����l�̏����_�ȉ���؂�̂āABigDecimal�^��int�^�ւƕϊ�
		//���ۂɎ󂯂�_���[�W�v�Z�F�󂯎�����_���[�W�l�~�_���[�W���Z��
		int dmg  = ( bdOrgDm.multiply( dmRate ) ).intValue();

		//���ۂɎ󂯂�_���[�W��HP�����傫���ꍇ�͎cHP��0�Ƃ���
		if(hp > dmg){
			hp = hp - dmg ;
		}else{
			hp = 0 ;
		}
		return dmg;   //���ۂɎ󂯂�_���[�W�̒l��Ԃ�
	}
}
