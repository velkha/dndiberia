$( document ).ready(function() {
    monster.init();
});
var monster= {
	init: function(){
		console.log("testing monster");
		let classList = $('#filters>div>select');

		$.each(classList, function(index, item) {
		        let o = new Option("Todo","all", true, true);
		        $(item).append(o);
		});
		console.log($('#filters>div>select'));
	},
}

