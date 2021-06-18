--SQL쿼리 페이징을 구현해서 변수로 삼을것을 정의 - 아래쿼리에서 상수 -> 변수로
--PageVO의 멤버변수로 사용예정 -> 게시물 때문에 board_type 맴버변수로
SELECT TableB.* FROM
(
    SELECT ROWNUM AS RNUM, TableA.* FROM
    (
        SELECT * FROM tbl_board
        WHERE board_type = 'notice' --게시물관리 다중게시판 검색떄문에 추가한 코드
        and (title LIKE '%%'
        OR content LIKE '%%')
        ORDER BY reg_date DESC
    ) TableA WHERE ROWNUM <= (2*5)+ 5
) TableB WHERE TableB.RNUM > 2*5
--페이징쿼리에서 필요한 변수는 2개
--현재페이지수의 변수 page*queryPerpageNum == queryStartNo
--1페이당보여줄 개수의변수 queryPerpageNum
--PageVO에서 필요한 추가변수: page
--UI하단의 페이지 선택번호 출력할때 사용하는 변수(아래) 
-- perPageNum 변수받아서 StartPage, endPage 를 구해서
-- 하단의 페이지 선택 번호를 출력