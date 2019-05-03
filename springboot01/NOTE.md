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