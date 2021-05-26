#### 20210526(수) 작업
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
- javac? 자바앱 컴파일러 -> 클래스 실행파일을 만듬.class (자바가상머신JVM실행)
- 메이븐?Maven : 웹프로그램 컴파일러 -> 웹프로그램(앱) 실행파일을 만듬.war(톰캣에서 실행)
- 메이븐이 컴파일할때, 자바소스만 컴파일하는 것이 아니고, 외부 라이브러리도 가져와서 바인딩(묶어줌)하게 됨 = 패키징 이라고 합니다. = .war(와르)파일로 패키징됨.
- 메이븐이 관리하는 외부 라이브러리파일(lib) 목록을 저장하는 파일 pom.xml 입니다.

#### 20210525(화) 작업
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