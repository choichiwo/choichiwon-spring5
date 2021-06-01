$(document).ready(function() {
    $('.to_top a').smoothScroll();
    	// 모바일용 메뉴 보이기/숨기기 액션처리
		$('.openMOgnb').click(function(){
			// alert('메뉴보이기 액션클릭')
			// $('.header_cont').css('display','block');
			$('.header_cont').slideDown('slow');
			$('#header').addClass('on');
		});
		$('.closePop').click(function() {
			// $('.header_cont').css('display','none');
			$('.header_cont').slideUp('fast');
			$('#header').removeClass('on');
		});	
});

// PC용 서브메뉴가 사라지는 엑션(아래)
var isOver1 = false;//대메뉴1이 false일때 서브메뉴가 사라지는 조건
var isOverSub1 = false;//서브메뉴1번이 false일떄 서브메뉴가 사라지는 조건
// 1번 서브메뉴 숨기는 함수(아래) 
function goHide1() {
	if(!isOver1 && !isOverSub1) {//2개변수값이 모두 false 일때 구현조건이 됩니다.
		$('.gnb_depth2_1').stop().fadeOut('fast');
	}
}
//두번째대메뉴 서브메뉴=.gnb_depth2_2 마우스 롤아웃 상태처리
var isOver2 = false;//대메뉴2이 false일때 서브메뉴가 사라지는 조건
var isOverSub2 = false;//서브메뉴2번이 false일떄 서브메뉴가 사라지는 조건
// 2번 서브메뉴 숨기는 함수(아래)
function goHide2() {
	if(!isOver2 && !isOverSub2) {
		$('.gnb_depth2_2').stop().fadeOut('fast');
	}
}

//PC용 서브메뉴가 나타나는 엑션 만들기(아래)
$(document).ready(function(){
	// 대메뉴1번 엑션
	$('.openAll1').mouseover(function(){
		// parseInt 문자를 숫자로 변환하는 형변환 함수 1066(윈도우) == 1049(CSS))
		if(parseInt($('header').css('width'))>=1049) { //header태그의 가로크기가 1055 이상이라면
			$('.gnb_depth2_1').fadeIn('fast');//서브메뉴1번이 나타나게 처리
		}
		isOver1 = true;// false일때 숨기는 조건 <-> true일떄 나타나는 조건
	});
	// [대메뉴1번]의 마우스 아웃 이벤트 => .gbn_depth2_1 서브메뉴 숨기기
	$('.openAll1').mouseout(function(){
		isOver1 = false;
		setTimeout('goHide1()',200);// 기본은 goHide1() 이것만하면되는데, mouseout이벤트 놓치면 않되기 떄문에 setTimeout사용
	});
	// 서브메뉴1번 엑션
	$('.gnb_depth2_1').mouseover(function(){
		isOverSub1 = true;//서브메뉴 1 계속 나타납니다.
	});
	// [서브메뉴] 마우스 아웃 했을때
	$('.gnb_depth2_1').mouseout(function(){
		isOverSub1 = false;//서브메뉴 1번이 사라집니다.
		setTimeout("goHide1()", 200);
	});
	//================================================================
	// 대메뉴2번 엑션
	$('.openAll2').mouseover(function(){
		if(parseInt($('header').css('width'))>=1049) {
			$('.gnb_depth2_2').fadeIn('fast');
		}
		isOver2 = true;
	});
	// [대메뉴2번]의 마우스 아웃 이벤트 => .gbn_depth2_2 숨기기
	$('.openAll2').mouseout(function(){
		isOver2 = false;
		setTimeout('goHide2()',200);//서브메뉴 숨김
	});
	// 서브메뉴2번 엑션
	$('.gnb_depth2_2').mouseover(function(){
		isOverSub2 = true;//서브메뉴 2 계속 나타납니다.
	});
	$('.gnb_depth2_2').mouseout(function(){
		isOverSub2 = false;//서브메뉴 2번이 사라집니다.
		setTimeout("goHide2()", 200);
	});
});