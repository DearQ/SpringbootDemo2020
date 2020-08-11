jQuery(document).ready(function($) {
	calc();
	// 实现商品金额自动计算的功能
	function calc() {
		var sum = 0;
		var to = 0;
		var interval = 0;
		$(".bd tr").each(function(index, dom) {
			// 获取商品单价
			var flag = $(this).find("input[name=cartCheckBox]").prop("checked");
			/* alert(flag) */
			var RMB = $(this).find(".cart_td_5").html();
			/* alert(RMB); */
			// 获取数量
			var num = $(this).find(".num_input").val();
			/* alert(num); */
			// 计算总价=单价*数量
			var pricrR = RMB * num;
			// 计算总价
			// 显示出来
			$(this).find(".cart_td_7").html(pricrR.toFixed(2));
			if(flag) {
				//alert(index);
				// 人民币总价
				to += pricrR;
			}

		});
		$("#total").html(to.toFixed(2));
	}

	//实现增加和减少功能
	$(".add").click(function() {
		// alert(1);
		// 累加 取++ 显示出来
		var add = $(this).prev().val();
		// alert(add);

		add++;
		var sid=$(this).siblings(".sid").val();
		$.get("http://localhost:8080/addAmount.do",{"sid":sid},function(ret){
			
		})
		$(this).prev().val(add);
		calc();
	});
	$(".minus").click(function() {
		/* alert(); */
		var minus = $(this).next().val();
		/* alert(minus); */
		if(minus <= 1) {
			alert("不能再减了");
			return;
		} else {
			minus--;
			var sid=$(this).siblings(".sid").val();
			$.get("http://localhost:8080/minusAmount.do",{"sid":sid},function(ret){
				
			})
		}
		
		$(this).next().val(minus);
		calc();
	});
	// 实现删除商品的功能
	$(".cart_td_8").find(".aa").click(function() {
		// $(this).parent().parent().prev().remove();//删除前tr
		// 是否删除
		var flag = confirm("是否删除该商品？");
		if(flag) {
			// 如果该语句放在后面，因为元素已删除，因此parents("tr[id]").prev()这语句找不到
			/*
			 * $(this).parents("tr").prev().remove();
			 * $(this).parents("tr").remove();
			 */
			//$(this).parent().parent().remove(); // 删除当前
			

			calc();
		}

	});

	// 删除所选
	$(".del").click(function() {
		// 遍历所有tr[id]的行 checkbox--如果选中了就删除
		$(".bd tr").each(function() {
			// 判断复选框是否选中
			// alert($(this).find("input[name=skuIds]").val());
			var flag = $(this).find("input[name=cartCheckBox]").get(0).checked;

			// alert(flag);
			if(flag == true) {

				$(this).remove();
				calc();
			}
		});
	});

	// 实现全选或全不选功能
	$("#allCheckBox").click(function() {
		// alert(1);
		// 所有复选框和#allCheckBox选项一致
		var flag = $("#allCheckBox").prop("checked");
		$("input[name=cartCheckBox]").prop("checked", flag);
		calc();
	});
	// 选项只有一个没选中，全选这个复选框就取消选中
	$("input[name=cartCheckBox]").click(function() {
		// alert(1);
		$("#allCheckBox").get(0).checked = true;
		// 遍历
		$("input[name=cartCheckBox]").each(function() {
			if($(this).is(":checked") == false) {
				$("#allCheckBox").get(0).checked = false;
				// return--遍历退出 break--退出循环
				return;
			}
		});
		calc();
	});

	// 点击结算
	var gwc = [];
	var ss;

	$("#jiesuan").on("click", function() {
		/*$("#s-main").css("display","none");
		$("#address").css("display","block");*/
		var flag = $("input[name=cartCheckBox]").prop("checked");
		//alert(flag);
		/*if(flag == false) {

			alert("请选择您要买的商品！");

		}*/
		// 判断是否选中过要买的商品
		var count = 0;
		$(".order-pro-area").html("");
		$(".bd tr").each(function(i, dom) {
			var flag = $(dom).find("input[name=cartCheckBox]").prop("checked");
			//alert(flag);
			if(flag) {
				count = count + 1;
				//alert(count);
				
			}
			$(".s-show .cart_td_6").html($(".num_input").val());
			$(".s-show .cart_td_7").html($(".cart_td_7").html());
			$("#price_RMB").html($("#total").html());
			var p=$("#price_RMB").html();
			var c=p*1;

			$(".price-checked-count").html($(".s-show tr[id]").length);
			//alert(c);
			$("#grandTotal").html(c);

			if(count > 0) {
				//alert()
				$("#s-main").hide(); // 我的购物车隐藏

				$("#address").show(); // 填写核对订单显示

			}


		});

	});
	$(".addres").click(function(){
		$(".dzglkj").css("display","none");
		$(".s-show").css("display","none");
		$(".addrssForm").css("display","block");
	})
	
	$(".btn-cancel").click(function(){
		$(".addrssForm").css("display","none");
		$(".s-show").css("display","block");
		$(".dzglkj").css("display","block");
	})
	//修改地址管理
	/*$("a .dykj").eq(0).addClass("bjtys1");
	$("a .dykj").eq(0).removeClass("bjtys2");*/
	$(".addressi").on("click","a",function() {
		//alert();
		$(".addressi .dykj").removeClass("bjtys1");
		$(this).children(".dykj").addClass("bjtys1");
		$(this).children(".dykj").removeClass("bjtys2");
		//$(this).removeClass("bjtys2").siblings().addClass("bjtys2");

	});
	$(".xgys2").hover(function() {
		$(this).css('color', '#ff0036');
	}, function() {
		$(this).css('color', '#cc9977');
	});
});
