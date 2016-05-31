$(function() {
	var id = window.location.hash.substr(1);
	movie = mock.getMovieById(id); // 这是获取到的movie
	// 将获取到的moive信息填入页面中，不过后面数据结构设计的不同可能要修改
	$(".movietitle").text(movie.name);
	$(".moivescore").text(movie.grade);
	$(".movieshowdate").text(movie.playdate+" 上映");
	$(".detaiMoivepost").attr({"src" : movie.imgSrc});
	$(".moviedirector").text(movie.director);
	$(".movieactors").text(movie.actors);
	$(".movielanguage").text(movie.movielanguage);
	$(".movieclass").text(movie.movieclass);
	$(".moviecountry").text(movie.moviecountry);
	$(".movietime").text(movie.movietime);
	$(".inshort_description").text(movie.inshort_description);
	$(".moviedescription").text(movie.introduction);
	
	// 填入 所有的大致地区和电影院数量，并添加mouseover 和 mousedown事件
	var B_addersses = mock.getAllB_addresses();
	
	for (var i=0;i<B_addersses.length;i++) {
		var item_num = $("<span class='num'></span>").text(B_addersses[i].num);
		var item_address = $("<span class='b_address'></span>").text(B_addersses[i].b_adderss);
		var item = $("<span class='B_addresses_item'></span>").text("");
		item.append(item_address);
		item.append(item_num);
		
		// item点击事件
		item.mousedown(function(){
			// 去掉其他item中有样式的
			$(".B_addresses").find(".B_addresses_item_clicked").removeClass("B_addresses_item_clicked");
			// 给自己添加样式
			$(this).addClass("B_addresses_item_clicked");
			
			// 通过item获取该地区所有影院的列表theaterslist
			//...未写
		});
		// 显示各个item
		$(".B_addresses").append(item);
	}
	
	// 根据 大致地区 显示出 具体的电影院有哪些
	
	var theaterslist = mock.getAllTheaters(); // 本来应该是从后台获取
	
	for (var i=0; i<theaterslist.length;i++){
		var item = $("<span class='theater'></span>").text(theaterslist[i].name);
		item.mousedown(function(){
			// 去掉其他item中有样式的
			$(".theaters").find(".theater_clicked").removeClass("theater_clicked");
			// 给自己添加样式
			$(this).addClass("theater_clicked");
		});
		$(".theaters").append(item);
	}
	
	// 最后根据 选定的电影院 显示 场次等
	var theaterDetail = mock.getAllTheaterDetail();
	
	for(var i=0; i<theaterDetail.length;i++){
		var item = $("<span class='playDate text-center'></span>").text(theaterDetail[i].playDate);
		item.mousedown(function(){
			// 去掉其他item中有样式的
			$(".playDates").find(".Date_clicked").removeClass("Date_clicked");
			// 给自己添加样式
			$(this).addClass("Date_clicked");
			// 改变表格中的信息
			changemovieinfo(1);
		});
		$(".playDates").append(item);
	}
	
	// 改变表格中的信息
	function changemovieinfo(id){
		for (var i=0; i<theaterDetail[i].details.length;i++) {
			// 遍历其中信息然后填入表格中即可
		}
	}
});
