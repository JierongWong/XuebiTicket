$(function() {
	initPage(); //初始化页面，数据本应在应用启动时通过ajax来获取，在这里用mock来模拟
	$('#login').on('click', function() {
		alert('login done');
	})
	$('input:radio[name="sort"]').change(function() {
		var sort = $(this).val();
		sortMvoies(sort);
	})
});

function initPage() {
	var movies = sortByGrade(mock.getAllMovies());
	genratePanelGroup(movies);
  var theaters = mock.getAllTheaters();
  genrateTheaterGroup(theaters);
}

function genratePanelGroup(movies) {
  var tmpl = `
    <div class="panel panel-primary small-panel">
      <div class="panel-heading">
        <p class="panel-title"></p>
      </div>
      <div class="panel-body text-center">
        <img src="" alt="">
      </div>
      <div class="panel-footer">
        <p id="grade"></p>
        <p id="playdate"></p>
      </div>
    </div>
   `	
  for(item in movies) {
    group = $(tmpl)
    $(group).attr('movieId', movies[item].id);
  	$(group).children(".panel-heading").children('.panel-title').text(movies[item].name);
  	$(group).children(".panel-footer").children('#grade').text("评分:" + movies[item].grade);
  	$(group).children(".panel-footer").children('#playdate').text("上映时间:" + movies[item].playdate);  	
  	$(group).children(".panel-body").children('img').attr('src', movies[item].imgSrc);
  	$(group).on('click', function(event) {
  		
  		// for file://
  		window.location.href = window.location.href.replace("index.html", "detail.html#" + $(this).attr("movieId"));
  		//for live-serve
  		//window.location.href = window.location.href + 'detail.html#' + $(this).attr("movieId");
  	})

  	$('.panel-group').append(group);
	}	
}

function genrateTheaterGroup(theaters) {
  var tmpl = `
    <div class="panel panel-default thread">
    <div class="panel-heading">
      <p class="panel-title"></p>
    </div>
    <div class="panel-body">
      <img src="./img/1.jpg" alt="">
      <div class="detail">
        <p class="address"></p>
        <p class="traffic"></p>
        <p class="telephone"></p>
      </div>
    </div>
  `
  for(item in theaters) {
    var theater = $(tmpl);
    $(theater).children(".panel-heading").children('.panel-title').text(theaters[item].name);
    $(theater).children('.panel-body').children('img').attr('src', theaters[item].imgSrc);
    $(theater).children('.panel-body').children('.detail').children('.address').text('地址： ' + theaters[item].address);
    $(theater).children('.panel-body').children('.detail').children('.traffic').text('交通： ' + theaters[item].traffic);
    $(theater).children('.panel-body').children('.detail').children('.telephone').text('电话： ' + theaters[item].telephone);
    $('.theater-group').append(theater);
  }
}

function sortMvoies(sort) {
	var movies = sort === "time" ? sortByPlaydate(mock.getAllMovies()) : sortByGrade(mock.getAllMovies());
	$('.panel-group').children().remove();
	genratePanelGroup(movies);
}

function sortByGrade(movies) {
	return movies.sort(function(a, b) {
		return a.grade < b.grade ? 1 : -1;
	})
}

function sortByPlaydate(movies) {
	return movies.sort(function(a,b) {
		return new Date(a.playdate).getTime() > new Date(b.playdate).getTime() ? 1 : -1; 
	})
}