
## 기능 목록

- [ ]  "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)" 출력
- [ ]  참여자 이름 입력 받기
    - [ ]  쉼표 기준으로 분리하기
- [ ]  참여자별로 "배팅 금액은?" 출력
- [ ]  참여자 별로 배팅 금액 입력 받기
- [ ]  참여자 별로 배팅 금액 설정
- [ ]  딜러, 참여자 객체 별로 2개의 카드 객체 생성
- [ ]  생성한 카드 객체 참여자 별 객체의 카드 리스트에 설정
- [ ]  참여자 별 카드 출력
- [ ]  참여자 별로
    - [ ]  21 초과인지 확인하기
        - [ ]  초과면
    - [ ]  "한 장의 카드를 더  받겠습니까?" 출력
        - [ ]  y, n 입력받기
            - [ ]  y
                - [ ]  1개의 카드 객체 생성
                - [ ]  참여자 객체의 카드 리스트에 추가
                - [ ]  참여자 객체가 보유한 카드 출력
                - [ ]  다시 물어보기
            - [ ]  n
                - [ ]  참여자 객체가 보유한 카드 출력
            - [ ]  예외 상황
                - [ ]  y, n가 아닌 다른 입력일 때
- [ ]  딜러의 카드가 16개 이하동안 반복
    - [ ]  17 이상이면 진행
    - [ ]  16 이하이면 한 개의 카드 객체 생성
    - [ ]  딜러 객체의 카드 리스트에 추가
- [ ]  최종 수익 출력

- [ ]  참가자 이름 입력받기
- [ ]  참가자 이름을 쉼표로 구분하기
- [ ]  참가자 객체 생성하기
- [ ]  딜러 객체 생성하기
- [ ]  딜러 객체에 1개, 참가자 객체별 2개 씩 카드 추가
- [ ]  딜러와 참가자의 카드 상황 출력
- [ ]  두장의 카드 합이 21인 참가자 있는지 조회
    - [ ]  있으면 베팅 금액의 1.5배 딜러는 배팅 금액 빼고, 참가자에게 주기
    - [ ]  딜러, 참가자 모두 21이면 딜러는 배팅 금액 빼고 참가자에게 주기
- [ ]  참가자의 카드가 21이하라면 카드 받기 여부 입력 받기 (반복)
    - [ ]  y
        - [ ]  참가자 객체에게 카드 1개 추가
        - [ ]  참가자의 카드 상황 출력
        - [ ]  참가자의 카드 합이 21이 넘으면 배팅 금액 빼기
        - [ ]  
    - [ ]  n
    - [ ]  예외 상황
        - [ ]  y, n 가 아닐 경우

- [ ]  딜러의 카드가 16이하인지 판별
    - [ ]  16 초과가 될 때 까지 카드 추가
        - [ ]  21
- [ ]  딜러, 참가자들의 카드 상황 출력
- [ ]  최종 수익 출력
    - [ ]  참가자가 승리할 경우 배팅한 금액 만큼 수익을 얻는다.
    - [ ]  무승부일 경우 배팅한 금액을 돌려 받는다.
    - [ ]  패배할 경우 배팅한 금액 잃는다.
    - [ ]  딜러가 21을 초과하면 21점 초과한 참가자의 배팅액을 얻는다.

### 게임 규칙

- A를 포함해서 21이 넘으면 A는 1로 여긴다.
- 처음 2장의 카드가 에이스와 10(j,q,k를 포함)으로 21점이 된 것을 블랙잭이라 한다. = 배팅액의 2배를 얻는다.
- 딜러가 블랙잭인 경우는 참가자가 배팅한 돈의 전부를 받는다.
- 딜러와 참가자가 동시에 블랙잭인 경우는 참가자는 배팅한 돈을 돌려 받는다.
- 딜러 점수와 비교해서 동점이면 무승부, 딜러보다 높으면 이기고, 낮으면 진다.
- 21점을 초과하면 0점으로 간주된다.
- 딜러가 21점을 초과하면 21점을 초과한 참가자의 배팅액을 딸 수 있다.

## 프로그래밍 요구사항

- 메소드의 길이가 10라인을 넘어가지 않는다. - 최대 15라인까지 허용
- 메소드는 한가지 일만.
- 인덴트의 뎁스는 2가 넘지 않도록 구현. 1까지만 허용한다.
- 메소드의 인자 수를 3개 까지만 허용한다.