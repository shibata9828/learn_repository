package churimon;

class Fushigiyade extends Monster3 {

	//------------�R���X�g���N�^------------
	//�R���X�g���N�^1[�����Ȃ�]
	Fushigiyade(){
		//super()���ÖٓI�Ɏ��s����Ă��܂�
		super.setCharacter("�t�V�M���f");
	}
	//�R���X�g���N�^2[����1:�g���[�i�[, ����2:�Ȃ܂�]
	Fushigiyade(String tr, String nm){
		super(tr,nm);
		super.setCharacter("�t�V�M���f");
	}
	//�R���X�g���N�^3[����1:�g���[�i�[, ����2:�Ȃ܂�, ����3:���x��]
	Fushigiyade(String tr, String nm, int lev){
		super(tr,nm,lev);
		super.setCharacter("�t�V�M���f");
	}

	//------------���\�b�h------------
	//levelUp���\�b�h
	//[����:���x���iint�^�j/�߂�l:�Ȃ�/�@�\:���������Ƀt�B�[���h�̒l���X�V����]
	public void levelUp(int up){
		setLv(    getLv()    + 1   * up )  ;
		setHpMax( getHpMax() + 31  * up )  ;
		setAtk(   getAtk()   + 6   * up )  ;
		setDef(   getDef()   + 7   * up )  ;
		setSpd(   getSpd()   + 8   * up )  ;
		setHp(    getHpMax() )             ;
	}
}
