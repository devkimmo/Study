package XXX_thing;

public class robot_1 extends robot_prototype {
	//조상 robot_prototype 데이타를 robot_1 와 공유한다.
	protected
	//다른 데이타를 공유 및 출력할수있게해준다.
	int attack_power;//데이타 입
	int speed;//데이타 입력.
	robot_1(int e, int atp, int sp){
		super.energy=e;
		attack_power = atp;
		speed = sp;
	}//새로운 객체의 데이터 입력 
	void setPower(int atp){attack_power = atp;}//void set: ()안에는 (타입.저장변수){본변수 = 저장변수}
	void setSpeed(int sp) {speed = sp;}
	int getPower() {return(attack_power);}//겟 세팅은 앞에 타입을 적어줘야한다. (){return(본변수);}
	int getSpeed() {return(speed);}
	void putPower() {System.out.printf("attack_power: %d\n", attack_power);}
	//풋세팅은 ()System.out.println( or printf){""}---이것은 후에 저장객체이름.putPower; 로만으로도 출력가능하게됨.
	void putSpeed() {System.out.printf("speed: %d\n", speed);}

	public static void main(String[] args) {
		robot_1 r1 = new robot_1(5500,32,67);
		int atp = r1.getPower();System.out.printf("겟파워로부터 받은값: %d\n", atp);
		int sp = r1.getSpeed();System.out.printf("겟스피드로부터 받은값: %d\n", sp);
		r1.putPower();r1.putSpeed();r1.putEnergy();
		// TODO Auto-generated method stub

	}

}
