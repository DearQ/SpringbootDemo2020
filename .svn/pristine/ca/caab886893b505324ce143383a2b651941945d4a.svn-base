jQuery(document).ready(function($) {
   var no=0;
   $(".c a").eq(0).click(function(){
          $(".hu_c .m-down").last().css("margin-left","-2.8rem").prependTo(".hu_c");
          $(".hu_c .m-down").first().animate({"margin-left":"0rem"},1000);
          }
      );
      $(".c a").eq(1).click(function(){

          $(".hu_c .m-down").first().animate({"margin-left":"-2.8rem"},1000,function(){

              $(".hu_c .m-down").eq(0).css("margin-left","0rem").appendTo(".hu_c");

          });
        });
       
  });