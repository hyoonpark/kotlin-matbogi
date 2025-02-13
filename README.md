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