public class Sample2_03_1_car {
	
	//---�t�B�[���h�i�N���X�����Œ�`���ꂽ�ϐ��j-----------------------
	
	private String  carModel ;  //�Ԏ햼
	private String  owner    ;  //�I�[�i�[
	private String  color    ;  //�h���F
	private int     speed    ;  //���݂̑��x
	private boolean right    ;  //���C�g�itrue:�_��/false:�����j
	
	
	//---�R���X�g���N�^------------------------------------------------
	
	//�R���X�g���N�^�@�i�����Ȃ��j
	public Sample2_03_1_car(){
		this.carModel = "���o�^" ;  //�Ԏ햼
		this.owner    = "���o�^" ;  //�I�[�i�[
		this.color    = "���o�^" ;  //�h���F
		this.speed    = 0        ;  //���݂̑��x
		this.right    = false    ;  //���C�g�itrue:�_��/false:�����j
	}
	
	//�R���X�g���N�^�A�i��������j
	public Sample2_03_1_car(String cm , String on , String cl , int sp , boolean rt ){
		this();                    //�R���X�g���N�^�@�i�����Ȃ��j�̋N��
		this.carModel = cm ;         //�Ԏ햼
		this.owner    = on ;         //�I�[�i�[
		this.color    = cl ;         //�h���F
		this.speed    = sp ;         //���݂̑��x
		this.right    = rt ;         //���C�g�itrue:�_��/false:�����j
	}
	
	
	//---���\�b�h------------------------------------------------
	
	//accelerator���\�b�h�i���݂̑��x��1km/h�グ��j��180km/h�ȏ�ɂ͂Ȃ�Ȃ��悤����
	public void accelerator(){
		if( this.speed < 180 ){
			this.speed++;
		}
	}
	
	//brake���\�b�h�i���݂̑��x��1km/h������j��0km/h�ȉ��ɂ͂Ȃ�Ȃ��悤����
	public void brake(){
		if( this.speed > 0 ){
			this.speed--;
		}
	}
	
	//rightOn���\�b�h�i���C�g��_��������j
	public void rightOn(){
		this.right = true ;
	}
	
	//rightOff���\�b�h�i���C�g����������j
	public void rightOff(){
		this.right = false ;
	}
	//klaxon���\�b�h�i�N���N�V������炷�j
	public void klaxon(){
		System.out.println(this.owner + "�̎ԁF�u�v�b�v�`�`�`�`�`�`�`�`�`�`�b�v") ;
	}
	
	//paint���\�b�h�i�F��h��j���Z�b�g�ł���h���F�́uWHITE�v�uBLACK�v�uRED�v
	public void paint( String cl ){
		if( checkColor(cl) ){
			this.color = cl ;
		}
	}
	
	
	//�h���F�������ȃJ���[�o���G�[�V�����i�uWHITE�v�uBLACK�v�uRED�v�j�����`�F�b�N����
	private boolean checkColor( String cl ){
		
		boolean checkResult = false ; //�`�F�b�N���ʁi�����l�Ffalse�j
		
		//�����ȃJ���[�o���G�[�V�����i�uWHITE�v�uBLACK�v�uRED�v�j�ƈ�v���Ă����checkResult��true��ݒ�
		if( cl.equals( "WHITE" ) || cl.equals( "BLACK" )|| cl.equals( "RED" ) ){
			checkResult = true ;
		}
		
		return checkResult ;
	}
	
	//---getter/setter------------------------------------------------
	
	//carModel��getter/setter
	public String getCarModel() {
		return this.carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	//owner��getter/setter
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//color��getter
	public String getColor(){
		return this.color ;
	}
	
	//speed��getter
	public int getSpeed() {
		return this.speed;
	}
	
	//right��getter
	public boolean getRight() {
		return this.right;
	}
	
}
