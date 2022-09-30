--BOOKS
INSERT INTO books(
    `book_code`, `title`, `prefix_title`, `suffix_title`, `feature`,
    `orign_title`, `publisher`, `publication_date`, `page`, `size`,
    `weight`, `isbn10`, `isbn13`, `cover_img_url`, `is_cover_img_copy`,
    `status`,
    `toc`,
    `introduce`,
    `place`, `info_url`, `donor_user_no`, `bookcase_category_code`, `created_at`, `updated_at`)
VALUES (
    461, '앱 인벤터 2', '시작하세요!', '뚝딱뚝딱 혼자서도 만드는 안드로이드 앱', '개정판',
    'App Inventor', '위키북스', PARSEDATETIME('2016-12-30', 'yyyy-MM-dd'), '480쪽', '188*240*22mm',
    '562g', '1158390246', '9791158390242', 'http://image.yes24.com/momo/TopCate702/MidCate004/70137713.jpg', 'N',
    '폐기',
    '[첫째마당] 안녕! 앱 인벤터<br><br>▣ 01장: 앱 인벤터란?<br>1.1 앱 인벤터의 이해 <br>1.2 앱 인벤터로 할 수 있는 것들<br>1.3 앱 인벤터를 위한 준비<br>___구글 크롬 설치 <br>___구글 계정 만들기 <br>___앱 인벤터 접속 <br><br>▣ 02장: 첫 번째 앱 만들기 <br>2.1 프로젝트 만들기<br>2.2 디자인 편집기로 형태 만들기<br>___컴포넌트 배치<br>___컴포넌트 속성 설정 <br>2.3 블록 편집기로 생명 불어넣기<br>___그림 그리기 기능 만들기<br>___지우개 기능 만들기 <br>2.4 스마트폰에서 확인하기<br><br>▣ 03장: 앱 인벤터 메뉴 이해하기 <br>3.1 프로젝트 관리하기<br>3.2 스마트폰과 연결하기<br>___AI 컴패니언을 이용한 스마트폰과의 무선 연결<br>___에뮬레이터를 이용한 앱 실행<br>___USB로 스마트폰과 연결하기<br>___연결 초기화하기<br>3.3 설치 파일 만들기 <br>___QR 코드를 이용한 앱 설치 <br>___apk 파일을 컴퓨터에 저장 <br>3.4 도움 받기<br>3.5 스크린 이동, 추가, 삭제<br>3.6 그 밖의 기능들 <br>___내 프로젝트<br>___갤러리 <br>___가이드 <br>___문제 보고<br>___English<br>___***@gmail.com<br><br>▣ 04장: 디자인 편집기 들여다보기<br>4.1 팔레트 패널<br>___사용자 인터페이스<br>___레이아웃 <br>4.2 뷰어 패널<br>4.3 컴포넌',
    '쉽고 빠르게 나만의 앱을 만들 수 있다!앱 인벤터는 복잡한 프로그래밍 언어 대신 퍼즐처럼 조립할 수 있는 블록을 이용해 초보자도 쉽게 안드로이드 앱을 만들 수 있게 도와주는 웹 기반의 앱 개발 도구이다. 앱 인벤터를 이용하면 어린이나 어른 누구라도 나만의 앱을 손쉽게 만들 수 있다. 이 책은 앱 인벤터를 처음 접하는 독자를 위해 앱 인벤터의 기본 개...',
    '5층 책장', 'http://www.yes24.com/24/goods/24246335', null, 'L-55', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--USERS
INSERT INTO USERS (USER_ID, NAME, IS_ADMIN, CREATED_AT, UPDATED_AT)
VALUES ('hgd', '홍길동', 'Y', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);