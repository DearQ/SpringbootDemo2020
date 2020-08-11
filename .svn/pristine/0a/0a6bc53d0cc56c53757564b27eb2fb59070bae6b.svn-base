function paymentDialog(callback) {
	/*创建元素*/
	var $div = $('.pay-box');
	if (!$div.length) {
		var html = '<div class="pay">'+
			'<div class="pay-box transitionAll05">'+
				'<div class="pb-close">'+
					'<i class="iconfont icon-juxing9"></i>'+
				'</div>'+
				'<div class="pb-title">请输入支付密码</div>'+
				'<div class="pb-int flex flex-center align-center">'+
					'<span class="flex flex-center align-center"></span><span class="flex flex-center align-center"></span><span class="flex flex-center align-center"></span><span class="flex flex-center align-center"></span><span class="flex flex-center align-center"></span><span class="flex flex-center align-center"></span>'+
				'</div>'+
				'<div class="pb-keyboard flex flex-wrap align-center">'+
					'<span class="figure">1</span><span class="figure">2</span><span class="figure">3</span><span class="figure">4</span><span class="figure">5</span><span class="figure">6</span><span class="figure">7</span><span class="figure">8</span><span class="figure">9</span><span class="pb-empty"><i class="iconfont icon-qingkong"></i></span><span class="figure">0</span><span class="pb-del"><i class="iconfont icon-juxing9"></i></span>'+
				'</div>'+
			'</div>'+
			'<div class="modal"></div>'+
		'</div>';
		$('body').append(html);
	}

	/*this*/
	var that = this;

	/*密码 数组*/
	var arr = [];

	/*数字键盘 点击*/
	$('.pay-box .pb-keyboard').on('click','.figure',function () {
		var $span = $(this);
		var $spans = $('.pay-box .pb-int span');
		if (arr.length < 6) {
			arr.push($span.html());
		}
		$spans.each(function (i,e) {
			var $e = $(e);
			if (!$e.html()) {
				$e.html('<img src="img/payImg/dd_03.jpg">');
				return false;
			}
		});
		// 获取密码
		if (arr.length == 6) {
			var ret = {};
			var err = "";
			ret.password = arr.join('');
			callback.call(that,ret,err);
		}
	});

	/*删除 数字*/
	$('.pay-box .pb-del').click(function () {
		var $spans = $('.pay-box .pb-int span');
		if (arr.length > 0) {
			arr.splice(arr.length - 1, 1);
		}
		for (var i=arr.length;i>-1;i--) {
			var $e = $spans.eq(i);
			if ($e.html()) {
				$e.html('');
				break;
			}
		}
	});

	/*清空 数字*/
	function empty() {
		arr = [];
		var $spans = $('.pay-box .pb-int span');
		$spans.each(function (i,e) {
			var $e = $(e);
			$e.html('');
		});
	}
	this.empty = function () {
		empty();
	}
	$('.pay-box .pb-empty').click(function () {
		empty();
	});

	/*打开弹框*/
	function open() {
		$('.pay-box').css('bottom',0);
		$('.modal').fadeIn();
	}
	this.open = function (obj) {
		if (obj) {
			$('.pay .pb-money').html(obj.money);
		}
		open();
	}

	/*关闭弹框*/
	function close() {
		$('.pay-box').css('bottom','-408px');
		$('.modal').fadeOut();
		empty();
	}
	this.close = function () {
		close();
	}
	$('.pay-box .pb-close i').click(function () {
		close();
	});
	$('.modal').click(function () {
		close();
	});
}
