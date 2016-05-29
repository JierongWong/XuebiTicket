$(function() {
	var id = window.location.hash.substr(1);
	movie = mock.getMovieById(id);
		$('.view-page').append('<p> name: ' + movie.name + '</p>')
	$('.view-page').append('<p> introduction: ' + movie.introduction + '</p>')
})