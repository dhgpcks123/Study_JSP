$(document).ready(function(){
	$('#lbtn').click(function(){
		$(location).attr('href', '/jspcls/day03/login.cls');
	});
	$('#obtn').click(function(){
		$(location).attr('href', '/jspcls/day03/logout.cls');
	})
});