//倒计时总秒数量
var intDiff = parseInt(14400);

function timer(intDiff) {
	window.setInterval(function() {
		var day = 00,
			hour = 00,
			minute = 00,
			second = 00;
		//时间默认值
		if (intDiff > 0) {
			day = Math.floor(intDiff / (60 * 60 * 24));
			hour = Math.floor(intDiff / (60 * 60)) - (day * 24);
			minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
			second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
		}
		if (minute <= 9)
			minute = '0' + minute;
		if (second <= 9)
			second = '0' + second;
		$('#hour_show').html('0<s id="h"></s>' + hour + ' ');
		$('#minute_show').html('<s></s>' + minute + ' ');
		$('#second_show').html('<s></s>' + second + ' ');
		intDiff--;
	}, 1000);
}

$(function() {
	timer(intDiff);
});
