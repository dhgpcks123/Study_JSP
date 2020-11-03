$(document).ready(function(){
	$('#lbtn').click(function(){
		$(location).attr('href', '/jspcls/member/login.cls');
	});
	$('#obtn').click(function(){
		$(location).attr('href', '/jspcls/member/logout.cls');
	})
});