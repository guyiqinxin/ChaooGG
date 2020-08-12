/**
 * 菜单展开显示的js
 */
$(function() {
	$(".list-group-item").click(function() {
		if ($(this).find("ul")) {
			$(this).toggleClass("tree-closed");
			if ($(this).hasClass("tree-closed")) {
				$("ul", this).hide("fast");
			} else {
				$("ul", this).show("fast");
			}
		}
	});
});