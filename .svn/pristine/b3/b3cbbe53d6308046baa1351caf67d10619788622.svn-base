window.onload = function() {

	/*倒计时*/
	downTime();
};
/*设置秒杀时间*/
var downTime = function() {
	/*倒计时的时间*/
	/*1.每一秒改变当前的时间*/
	/*2.倒数计时  假设 4小时*/
	var time = 4 * 60 * 60;

	/*时间盒子*/
	/* var spans = document.querySelectorAll('.time span');*/
	var spans = document.querySelector('.time').querySelectorAll('span');

	/* 每一秒去 更新显示的时间*/
	var timer = setInterval(function() {
		time--;
		/*格式化还是秒  给不同的元素html内容*/
		var h = Math.floor(time / 3600);
		var m = Math.floor(time % 3600 / 60);
		var s = Math.floor(time % 60);

		spans[0].innerHTML = Math.floor(h / 10);
		spans[1].innerHTML = h % 10;

		spans[3].innerHTML = Math.floor(m / 10);
		spans[4].innerHTML = m % 10;

		spans[6].innerHTML = Math.floor(s / 10);
		spans[7].innerHTML = s % 10;

		if(time <= 0) {
			clearInterval(timer);
		}

	}, 1000)

}
var marginLeft = 0;
// alert($("#express li").height());
//向上移动
var flag = true;
var timers = setInterval(function() {
	//判断是否运动 --第二种方法

	if(flag) {
		marginLeft--;
		$(".news li").eq(0).css("margin-left", marginLeft);
		//满足条件(走完一行) 希望把第一条放在ul最后
		if(-marginLeft >= 150) {
			//-marginTop --负负得正
			$(".news li").eq(0).appendTo(".news ul").css("margin-left", "0px");
			marginLeft = 0;
		}
	}
}, 10);
//定时器理论值越小，越快 <1 5几乎没有区别
//鼠标移入 书讯快递停止 
//第一种方法 --停止定时器 离开--开启
$(".news li").hover(function() {
	flag = false;
}, function() {
	flag = true;
});
