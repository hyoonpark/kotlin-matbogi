# kotlin-matbogi
코틀린으로 화면 구현 맛보기

## 학습 내용

### Day 1 - 안드로이드 기본 UI 구현
- 주요 학습 내용
  - 안드로이드 프로젝트 생성 및 기본 구조 이해
  - Activity 생명주기 학습
  - Layout XML을 통한 UI 구현
  - Intent를 활용한 화면 전환
  - ImageView와 클릭 이벤트 처리
  
- 구현 기능
  - 메인 화면에 BTS 멤버 이미지 그리드 레이아웃 구현
  - 각 멤버 이미지 클릭 시 Toast 메시지 출력
  - 이미지 클릭 시 해당 멤버의 상세 화면으로 전환
  - 각 멤버별 상세 화면에서 전체 이미지 표시

- 사용된 기술
  - ConstraintLayout
  - ImageView
  - Intent
  - Toast
  - OnClickListener
  - ViewBinding

### Day 2 - 스플래시 화면과 카드뷰 활용
- 주요 학습 내용
  - 스플래시 화면 구현
  - Handler를 이용한 화면 전환 딜레이
  - CardView를 활용한 이미지 스타일링
  - Intent Extra를 통한 데이터 전달
  - LinearLayout을 활용한 그리드 형태의 UI 구현

- 구현 기능
  - 3초간 표시되는 스플래시 화면
  - TWICE 멤버 이미지를 3x3 그리드로 표시
  - CardView를 사용한 둥근 모서리 이미지 처리
  - 이미지 클릭 시 전체화면으로 확대
  - Intent putExtra를 통한 멤버 정보 전달

- 사용된 기술
  - LinearLayout
  - CardView
  - Handler
  - Intent Extra
  - ImageView scaleType
  - Activity Lifecycle

### Day 3 - DataBinding과 주사위 게임 구현
- 주요 학습 내용
  - DataBinding 설정 및 사용법
  - findViewById 대체 방법
  - Random 함수를 활용한 난수 생성
  - 조건문을 활용한 이미지 리소스 변경
  - Kotlin에서의 변수 선언과 초기화

- 구현 기능
  1. DataBinding 예제
     - DataBinding 기본 설정
     - XML 레이아웃과 코드 바인딩
     - 버튼 클릭 이벤트 처리
  
  2. 주사위 게임 앱
     - 두 개의 주사위 구현
     - 버튼 클릭시 랜덤한 주사위 값 생성
     - 주사위 값에 따른 이미지 동적 변경
     - Toast 메시지로 사용자 피드백 제공

- 사용된 기술
  - DataBinding
  - Random 클래스
  - ImageView 리소스 동적 변경
  - LinearLayout
  - Toast
  - Kotlin 조건문
  - Gradle 설정

### Day 4 - 안드로이드 심화 기능 학습
- 주요 학습 내용
  - 뒤로가기 버튼 커스터마이징
  - 커스텀 폰트 적용
  - List와 ListView 활용
  - BaseAdapter를 활용한 커스텀 리스트뷰
  - DataBinding과 ListView 결합
  - Random 함수를 활용한 데이터 랜덤 출력

- 구현 기능
  1. 뒤로가기 기능
     - OnBackPressedCallback 구현
     - 2초 내 더블 클릭 시 앱 종료
     - Toast 메시지로 사용자 안내
  
  2. 커스텀 폰트
     - 외부 폰트 파일(bmjua_ttf) 적용
     - XML에서 fontFamily 속성 사용
  
  3. List 실습
     - MutableList 생성 및 데이터 추가
     - Log를 통한 데이터 확인
  
  4. ListView 구현
     - BaseAdapter를 상속한 커스텀 어댑터 생성
     - 커스텀 레이아웃을 통한 리스트 아이템 디자인
     - ListView와 어댑터 연동
  
  5. 명언 앱 제작
     - 랜덤 명언 표시 기능
     - 전체 명언 목록 보기
     - DataBinding을 활용한 UI 업데이트
     - 커스텀 폰트가 적용된 리스트뷰

- 사용된 기술
  - OnBackPressedCallback
  - Custom Font
  - MutableList
  - ListView
  - BaseAdapter
  - LayoutInflater
  - DataBinding
  - Random
  - Intent
  - Toast