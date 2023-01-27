# coupon-service

coupon-service

1. 쿠폰 등록하기
    1. 저장방법
        1. 이미지 저장 후 경로를 DB에 저장
    2. 이미지 분석하기
        1. 어느 회사에서 사용가능한지?
        2. 어떤 메뉴인지?
        3. 금액
        4. 바코드 생성해주기
        5. 이용가능일자
2. 그룹 공유 하기
    1. 그룹에 쿠폰 올라오면 알람 주기
        1. 이용가능일자가 끝나가면 알려주기
    2. 그룹에 들어가는 방법
        1. 누군가의 초대(id 혹은 전화번호)
        2. 그룹 들어가는 링크 전달하기
3. 사용 여부 체크하기(언제 사용했는지, 누가 사용했는지)
4. 유저는 여러개의 그룹에 들어가 있을 수 있음

### ERD

![ERD](www.plantuml.com/plantuml/png/jL9DImCn4BtdL-JcgVPU45eLHAX5gVw0QJ9i0viFafd3Kltl9YnRbcvQIy7SykPDtfitMIQ2I6nRSRSd2canduSMN47kbRTprK9ACssWYM2541e8Tf1GldNRZ_L1o7pGaQ5EVYMCiY3zCLekv9QYSSqHSs1nYeQzTxXXkyCuBIfEj2KWJfLQH23KAygbjLVGFkVhfx5uP73G5nW_Okp_9NeEDmsWCQbe0Xdl_jlaK_RetHykbRS1N3SjM7IygOu0rhFh3OpG7KJbTMrYncBox4Z6GeFlGFkpUJnsDqMLwfsShiolVDALqzVicZFrjO8tfVUaKFjAMQQ-hVfxjJMMxgbIrkhzV_lPp1zErHP5vM5uLlJePUwW94ey0tKSrK3iCndawxon-1ATPjl-0W00)