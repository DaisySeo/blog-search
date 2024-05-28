# blog-search
블로그 검색 서비스

### 프로젝트 설명
개인 공부를 위한 '블로그 검색 서비스' 토이 프로젝트
- 블로그 서비스를 만들기 전에 우선 외부 블로그 검색 API들의 결과를 노출해주는 서비스이다.
#### 목표
* 기능 구현
  * [기본] 블로그 검색 (외부 API 연동 -> 내부 검색 API 추가 구현 후 연동)
  * [기본] 실시간 검색어 순위 노출
  * [고도화] 검색 
  * [고도화] 검색 자동완성
* K8S 구성
* 동시성 고려
* 대용량 트래픽 고려
* Kotlin 전환

### 프로젝트 구조
* DDD 개발
* MSA 기반 개발 가정

<br/><br/>
--------------------------------------------
### Built with
* Java 17 - Language
* Spring Boot 3.0.5 - Framework
* Gradle - Dependency Management

### Getting Started
1. build
```shell
./gradlew 
```
2. execute
```shell
java -jar 
```
3. database console
```
localhost:8989/h2-console
- Driver Class: `org.h2.Driver`
- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
```