$(document).ready(function(){
	$('#btn1').click(function(){
//		지우씨가 해결할겁니다.
	});
	$('#btn2').click(function(){
		// 할 일
		// 1. 입력한 데이터 읽고
		var sid = $('#id').val();
		var spw = $('#pw').val();
		
		if(!(sid && spw)){
			return;
		}
		
		$('#frm').submit();
	});
});
