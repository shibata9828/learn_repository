package churimon;

class Hitokake extends Monster3 {

	//------------�R���X�g���N�^------------
	//�R���X�g���N�^1[�����Ȃ�]
	Hitokake(){
		//super()���ÖٓI�Ɏ��s����Ă��܂�
		super.setCharacter("�q�g�J�P");
	}
	//�R���X�g���N�^2[����1:�g���[�i�[, ����2:�Ȃ܂�]
	Hitokake(String tr, String nm){
		super(tr,nm);
		super.setCharacter("�q�g�J�P");
	}
	//�R���X�g���N�^3[����1:�g���[�i�[, ����2:�Ȃ܂�, ����3:���x��]
	Hitokake(String tr, String nm, int lev){
		super(tr,nm,lev);
		super.setCharacter("�q�g�J�P");
	}

	//------------���\�b�h------------
	//levelUp���\�b�h
	//[����:���x���iint�^�j/�߂�l:�Ȃ�/�@�\:���������Ƀt�B�[���h�̒l���X�V����]
	public void levelUp(int up){
		setLv(    getLv()    + 1   * up )  ;
		setHpMax( getHpMax() + 29  * up )  ;
		setAtk(   getAtk()   + 8   * up )  ;
		setDef(   getDef()   + 5   * up )  ;
		setSpd(   getSpd()   + 9   * up )  ;
		setHp(    getHpMax() )             ;
	}
}