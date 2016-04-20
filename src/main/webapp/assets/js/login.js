var page ={};
page.name = "login";
//页面dom加载初始化方法执行
$(function() {
	page.init();
});

// 页面加载需要初始化执行的方法
page.init = function(){
	page.method();
	page.show();
};

page.show = function(){
	$.backstretch("assets/img/backgrounds/1.jpg");
	/*
	 Form validation
	 */
	$('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
		$(this).removeClass('input-error');
	});
}

//事件绑定
page.method = function(){
	$("#submitLogin").click(function (){

		drawInputShap('username');
		drawInputShap('password');
		$("#loginForm").submit();
	});
};
function drawInputShap(targetId){
	targetId = '#'+targetId;
	 if($(targetId).val() ==""|| $.trim($(targetId).val())==""){
		 $(targetId).addClass('input-error');
	 }else{
		 $(targetId).removeClass('input-error');
	 }
}