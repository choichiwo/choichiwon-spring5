#### 20210528(금) 작업예정.
- 오라클11g ExpressEditon 설치예정. OracleXE112_Win64.zip
- SQL디벨러퍼를 다운받아서 압축풉니다. - ERD제작할 예정.
- StructuredQueryLanguage: 구조화된 질의 언어(오라클서버) -> 답변
- QueryString: URL에서 전송하는 값(서버에 질의문)을 문장으로 저장한내용 ?로 시작.  
- CommendLineInterface : SQL*Plus 터미널화면으로 SQL쿼리 실행X
- GrapicUserInter: SQL디벨러퍼 윈도우화면 에디터에서 SQL쿼리 실행O
- SQL Developer 프로그램으로 ERD를 다이어그램그림으로 프로젝트 구조제작예정.
- EntityRelationDiagram: 테이블관계도형(아래)
- 프로젝트 진행; 발주(클라이언트) -> 수주(개발사) -> 디자인UI(Client-Dev) -> ERD(이사,팀장) -> 코딩시작(ERD보면서+UI소스프로그램입히기) 
- ERD에서 SQL쿼리가 생성 -> 물리테이블을 생성.
- ------------------------------------------------
- 첨부파일(자식)->게시판테이블(부모)<-댓글테이블(자식)
- 자바앱에서는 객체를 생성후 사용이 끝나면, 메모리에서 삭제하는 명령이 필수.
- 객체를 메모리에서 삭제: Object = null; Object.close();
- 스프링에서는 내장된 가비지컬렉터 (garbage쓰레기수집가)가 자동실행 사용하지 않는 객체를 자동으로 지워줌.
- 위와 같이 개발자가 하던 메모리관리를 스프링의 대신 = IoC(Inversion Of Control)제어의 역전. 특징3가지중 1개(IoC, AOP, DI)
- Step2클래스에서 MeberService 클래스에 직접접근해서 메서드를 실행하려면 static으로 변경(컴파일시 실행가능한 상태로됨=메모리에 로딩)해야 함. 
대신, memberServie객체을 이용해서 메서드에 접근할때는 (호출시=런타임시 실행이가능한 상태로됨=메모리에 로딩)
- 클래스와 상속에 대해서 이론 및 실습
- https://github.com/miniplugin/spring5-kimilguk/blob/master/src/test/java/kr/or/test/ClassApp.java


#### 20210527(목) 작업.
- 3장 객체와 클래스 부터 시작.
- 스프링에서는 클래스 extends(상속)보다는 인터페이스 (implements)를 더 많이 사용합니다.
- abstract클래스(추상클래스): 구현내용이없이, 메서드명만 있는 클래스,
- 메서드명만 있기 (구현내용이 없기) 때문에, *객체로 만들수 없는 클래스 입니다.
- 부모로서 자식에게 상속만(메서드이름만)해서 재사용만 가능하게 됩니다.
- *객체로 만들수 없다? 실행가능한 클래스로 사용못하지만, 프로그램을 구조화 시킬때 필요.
- Step1 aaa = new Step1();//이렇게 생성자로 객체를 만들지 못함.
- final클래스: 부모가 될 수 없는 클래스(상속해서 재사용이 불가능한 클래스임)
- 접근제어자: public(페키지위치에 상관없이 접근-제일많이 사용),
- public 클래스안에서 멤버변수는 private을 제일많이 사용. (private보안성갖춤)
- public 클래스안에서 멤버메서드는 public을 많이 사용.(외부 다른 클래스의 메서드를 실행가능) 대신, 변수가 private이기 때문에, 직접수정않됨, 실행만 됩니다.
- 인스턴스(클라우드주로사용)=오브젝트(자바)=객체=실행중인클래스
- 클래스 자료형(int, long, String처럼)는 멤버변수,멤버메서드, 서브클래스 등등 포함할 수 있습니다. =C언어  구조체 자료형
- 이클립스 커밋, 푸시가 않될때 커밋 팝업창 하단에 Force 항목을 체크하시고, 진행하면 됨.


#### 20210526(수) 작업
- 붕어빵: 붕어빵틀(클래스) -> 붕어빵 구어져서 나오면 오브젝트(객체)
- OOP: 자바를 객체지향 프로그래밍
- 객체 = 오브젝트 = 인스턴스 = 실행가능한 클래스
- 겍체[(Object) 와 클래스? 클래스형 자료를 실행 가능하게 만든 것을 오브젝트(객체)라고함.
- 추상화(Abstract): 오프라인 업무 -> 대표 업무만 뽑아낸 클래스 = 추상클래스
- 클래스는 맴버변수 + 맴버메서드(실행) + 서브클래스 
- 변하지 않는 변수=상수=변수명을 대문자(원주율)PI=3.141592...
- 보통 상수변수는 클래스의 제일 상단 위치합니다.
- 기본형(정수자료형-소문자시작): bytr<short<int<long, 10L(롱타입변수)
- 기본형(실수자료형 -소수점,소문자시작): float<doble, 12.34f(실수형숫자) 
- 기본형(문자형-'a'단따움표 값을 입력해야 에러가 나지 않음): char, 1개 문자만 입력.
- 문자형에서 유니코드 \u숫자 입니다.
- 기본형(불린형-참,거짓): boolean, (0|1)
- 참조형(대문자로 시작): 참조형 변수의 대표적인 변수 클래스 입니다.
- 클래스변수(저장된상태) -> 실행가능하게 되었을때, 인스턴스 변수(메모리로드된상태)
- 인스턴스라는 말보다는 오브젝트라는 말을 더 많이 사용합니다.
- String(문자열 클래스변수): 대문자로 시작.
- 상수변수를 명시적 만들때: final int MAX = 100;
- for-each 반복문 전까지 실습

#### 20210525(화) 작업
- 스프링MVC프로젝트: ModelViewController? 약자MVC구조(웹프로그램구조)
- src/test/java폴더 만들었습니다.: 테스트작업으느 이 폴더에서 하라는 약속.
- src/main/java폴더가 진짜 프로그램작업을 하는 폴더.
- javac HelloWorld.java -encoding UTF-8 (한글 내용도 컴파일됨)
- 위 java컴파일러로 실행한 결과 -> HelloWorld.class 파일이 생성됨.
- 주), 클래스파일은 실행 패키지의 루트(최상위)에서 실행해야 함.
- kr.or.test패키지 root폴더 src/test/java폴더에 실행을 해야함.
- java kr.or.test.HelloWorld 클래스를 실행하게 됨
- 이클립스 나오기전, 25년전 javac 컴파일에서 class프로그램을 만들었습니다.
- 지금은 터미널에서 javac 사용하지 않고, 이클립스에서 바로 실행합니다.
- javac? 자바앱 컴파일러 -> 클래스 실행파일을 만듬.class(바이트코드) (자바가상머신JVM실행)
- 메이븐?Maven : 웹프로그램 컴파일러 -> 웹프로그램(앱) 실행파일을 만듬.war(톰캣에서 실행)
- 메이븐이 컴파일할때, 자바소스만 컴파일하는 것이 아니고, 외부 라이브러리도 가져와서 바인딩(묶어줌)하게 됨 = 패키징 이라고 합니다. = .war(와르)파일로 패키징됨.
- 메이븐이 관리하는 외부 라이브러리파일(lib) 목록을 저장하는 파일 pom.xml 입니다.
- pom.xml에서 자바버전을 1.6 -> 1.8 변경 후 메이븐을 업데이트 합니다.
- 외부 라이브러리 파일을 참조하는 방식을 영어로 = dependency디펜던시
- jar파일? JavaARchive = jar 자바클래스를 패키징한 파일입니다.
- 자바 기초 실습 
- 자바 ,java클래스 컴파일해서 생성된 .class파일 실행하는 구조.
- 파이썬/자바스크립트는 인터프리터 방식을 실행
- 자바스크립트는 함수구조의 프로그래밍. = Function(함수)
- 자바는 객체지향 프로그래밍.(Object Oriented Program)
- 오브젝트(객체) = 실행가능한 Class(클래스)
- 아스키, 유니코드(UnicodeTypeFormat-8)
- 아스키코드IOT에서 데이터 전송시 필수로 확인해야합니다. 0,1을 전송 -> 48,49값을 받습니다.
- IOT프로그램시 하드웨어 값을 주고 받을때 if(var1 == 48 ) {구현내용}
- 공유기가 하위 가질수 있는 사설IP는 공유기본인IP + 255개(여유분) = 256개 인터넷이 가능.
- 영어인코딩은 아스키코드로 다 표현가능
- 한글 인코딩, 중국어/일본어 인코딩 등등은 아스키코드로 다 표현못함 그래서, 유니코드 등장.UTF-8   
- Hex(16진수), Dec(10진수), Char(문자) = 127개  = 아스키문자의 크기(컴문자-사람문자 1:1매칭 )
- Oct(8진수), Bin(2진수)
- 아스키코드-7비트코드(127) -> ANSI코드-8비트(256글자) -> UniCode(65536글자)-UTF8
- UTF8mb4(이모지까지 포함: 이모티콘+이미지)
- 자바언어를 한다는 것은 컴파일 후 실행이 된다는 의미. -> 실습예정
- 자바스크립트(파이썬)는 그냥 실행해서 프로그램을 만들어 집니다. -> 실습예정