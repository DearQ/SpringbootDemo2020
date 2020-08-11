$(function(){
	/* 瀑布流初始化设置 */
	var $grid = $('.sa-grid').masonry({
		itemSelector: '.sa-grid-item',
		gutter: 10
	});
	// 每次图像加载后的布局砌体
	$grid.imagesLoaded().done(function(){
		 // console.log('1');
		$grid.masonry('layout');
	});
	var pageIndex = 0;
	var dataFall = [];
	var totalItem = 10;
	$(window).scroll(function(){
		$grid.masonry('layout');
		var scrollTop = $(this).scrollTop();
		var scrollHeight = $(document).height();
		var windowHeight = $(this).height(); 
		if(scrollTop + windowHeight == scrollHeight){
			// ajax请求数据时延时500毫秒
			$.ajax({
				dataType:'json',
				type:'get',
				url:'./json/article.json',
				success:function(result){
					dataFall = result.result.article;
					setTimeout(function(){
						appendFall();
					},100)
				},
				error:function(e){
					console.log('请求失败!');
				}		
			})
		}
	});
	
	function appendFall(){
		$.each(dataFall, function(index, value){
			var dataLength = dataFall.length;
			$grid.imagesLoaded().done(function(){
				$grid.masonry('layout');
			});
			var detailUrl;
//			var c_symbol = "￥";
			var $griA = $('<a href="javascript:;" class="aui-list-item sa-grid-item">');
			var $griDiv1 = $('<div class="aui-list-theme-img">');
			$griDiv1.appendTo($griA);
			var $img = $('<img alt="">');
			$img.attr('src', value.articlePic).appendTo($griDiv1);
			var $griDiv2 = $('<div class="aui-list-theme-message">');
			$griDiv2.appendTo($griA);
			var $h3 = $('<h3 class="aui-list-theme-subtitle">');
			$h3.html(value.c_name).appendTo($griDiv2);
			var $griDiv3 = $('<div class="aui-flex2">');
			$griDiv3.appendTo($griDiv2);
			var $span1 = $('<span>');
			$span1.html(value.c_size).appendTo($griDiv3);
			var $span2 = $('<span>');
			$span2.html(value.c_storage).appendTo($griDiv3);
			var $span3 = $('<span>');
			$span3.html(value.c_colType).appendTo($griDiv3);
			var $griDiv4 = $('<div class="aui-flex">');
			$griDiv4.appendTo($griDiv2);
			var $griDiv5 = $('<div class="aui-flex-box">');
			$griDiv5.appendTo($griDiv4);
			var $h2 = $('<h2>');
			$h2.html(value.c_discountprice).appendTo($griDiv5);
//			var $em = $('<em>');
//			$em.html(c_symbol).appendTo($h2);
//			var $i = $('<i>');
//			$i.html(value.c_price).appendTo($h2);
			var $span4 = $('<span class="aui-flex-span">');
			$span4.html(value.busModel).appendTo($griDiv5);
			var $span5 = $('<span class="aui-flex-span2">');
			$span5.html(value.assess).appendTo($griDiv5);
			var $griDiv6 = $('<div class="aui-flex-span3">');
			$griDiv6.html(value.store).appendTo($griDiv5);
			var $items = $griA;
			$items.imagesLoaded().done(function(){
				$grid.masonry('layout');
				$grid.append($items).masonry('appended', $items);
			})
		}); 
	}
})