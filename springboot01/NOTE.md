# SpringApplication

 - 기본 로그 레벨 INFO
    - Debug 레벨
        - VM options : -Ddebug
        - Program arguments : --debug
        
 
 - FailureAnalyzer
 
 - 배너
    - banner.txt | gif | jpg | png
    - classpath 또는 properties에서 spring.banner.location 설정.
    - ${spring-boot.version} 등의 변수 사용할 수 있음.
    - Banner 클래스를 구현하고 SpringApplication.setBanner()로 설정 가능.
    - 배너 끄는 방법 SpringApplication.setBannerMode(Banner.Mode.OFF)
    - 배너 우선순위 : classpath:텍스트파일 > 코딩
    
 - SpringApplicationBuilder로 빌더 패턴 사용 가능.
 
 - Application Events and Listeners
    - ApplicationContext가 만들어지기 이전의 이벤트들은 @Bean으로 등록한다고 하더라도 리스너가 동작하지 않음.
        - ApplicationStartingEvent 등..
        - SpringApplication.addListener()를 사용.
 
 - WebApplicationType 설정
    - SpringMVC가 있으면 기본적으로 SERVLET 으로 동작함.
    - SpringWebFlux가 있으면 REACTIVE 로 동작함.
    - 둘 다 있으면 SERVLET 우선순위가 높음.
    - 둘 다 없으면 NONE
    
 - 애플리케이션 아규먼트 사용
    - ApplicationArguments를 빈으로 등록해 주니까 가져다 쓰면 됨.
    - VM options은 ApplicationArguments가 아님(ex. -Dfoo)
    - Program arguments만 빈으로 등록해 줌(ex. --bar)
    
 - 애플리케이션 실행한 뒤 뭔가 실행하고 싶을 때
    - ApplicationRunner (추천) 또는 CommandLineRunner
    - 러너가 여러개일 경우 순서 지정 가능 @Order()