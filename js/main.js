   // jQuery for page scrolling feature - requires jQuery Easing plugin
   $(function () {
    "use strict";
       $('a.page-scroll').on('click', function (event) {
           var $anchor = $(this);
           $('html, body').stop().animate({
               scrollTop: $($anchor.attr('href')).offset().top
           }, 1500, 'easeInOutExpo');
           event.preventDefault();
       });
   });

   //Counter style
   jQuery(document).ready(function ($) {
       "use strict";
       $('.counter').counterUp({
           delay: 10,
           time: 800
       });
       
    $("#port_carouse, #port_carouse2,#port_carouse3,#port_carouse4,#port_carouse5,#port_carouse6,#port_carouse7,#port_carouse8").owlCarousel({
           navigation: true, // Show next and prev buttons
           navigationText: ["<i class='fa fa-caret-left'></i>", "<i class='fa fa-caret-right'><i>"],
           slideSpeed: 300,
           pagination: false,
           paginationSpeed: 400,
           singleItem: true
       });
       
       $('body').sectionMenu().fragmentScroll();
       
      
   });

   //Preloader Effect	
   document.addEventListener('DOMContentLoaded', function () {
       "use strict";
       document.querySelector('body').className += ' loaded';
   });


// Highlight the top nav as scrolling occurs
   $('body').scrollspy({
       target: '.navbar-fixed-top'
   })

   // Porfolio filter
   /*Mixitup portfolio shrting*/
   jQuery('#grid').mixitup({
       targetSelector: '.mix',
   });
var pieData1 = [{
       value: 85,
       color: "#3F3F3F",
       highlight: "#444",
       segmentShowStroke: false,
       showTooltips: false
    }, {
       value: 15,
       color: "transparent"
    }];

   var pieData2 = [{
       value: 85,
       color: "#3c1c1c",
       highlight: "#222",
       segmentShowStroke: false
    }, {
       value: 15,
       color: "transparent"
    }];

   var pieData3 = [{
       value: 65,
       color: "#808080",
       highlight: "#222",
       segmentShowStroke: false
    }, {
       value: 35,
       color: "transparent"
    }];

   var pieData4 = [{
       value: 80,
       color: "#708090",
       highlight: "#222",
       segmentShowStroke: false
    }, {
       value: 20,
       color: "transparent"
    }];

   var pieData5 = [{
       value: 85,
       color: "#2F4F4F",
       highlight: "#222",
       segmentShowStroke: false
    }, {
       value: 15,
       color: "transparent"
    }];

   var pieData6 = [{
       value: 55,
       color: "#778899",
       highlight: "#222",
       segmentShowStroke: false
    }, {
       value: 45,
       color: "transparent"
    }];
   //Setion Menu
  jQuery(window).load(function ($) {
      "use strict";
   
       Chart.defaults.global.showTooltips = false;
       var ctx1 = document.getElementById("chart-area1").getContext("2d");
       window.myPie = new Chart(ctx1).Pie(pieData1);

       var ctx2 = document.getElementById("chart-area2").getContext("2d");
       window.myPie = new Chart(ctx2).Pie(pieData2);

       var ctx3 = document.getElementById("chart-area3").getContext("2d");
       window.myPie = new Chart(ctx3).Pie(pieData3);

       var ctx4 = document.getElementById("chart-area4").getContext("2d");
       window.myPie = new Chart(ctx4).Pie(pieData4);

       var ctx5 = document.getElementById("chart-area5").getContext("2d");
       window.myPie = new Chart(ctx5).Pie(pieData5);

       var ctx6 = document.getElementById("chart-area6").getContext("2d");
       window.myPie = new Chart(ctx6).Pie(pieData6);
      
      /*jQuery('.intro-heading').textillate({
        in: {
            effect: 'fadeIn',
            sequence: true
            }
    });*/
      
  });
   
   /* ------ Wow Effect ---------------------
   ------------------------------------------ */
  var wow = new WOW({
       boxClass: 'wow', // default
       animateClass: 'animated', // default
       offset: 100, // default
       mobile: true, // default
       live: true // default
   })
   wow.init();
   
   var isGraph1Viewed = false;

   $(window).scroll(function () {
       "use strict";
       if (isScrolledIntoView($('#chart-area1, #chart-area2, #chart-area3, #chart-area4, #chart-area5, #chart-area6')) && isGraph1Viewed == false) {
           var ctx1 = document.getElementById("chart-area1").getContext("2d");
           window.myPie = new Chart(ctx1).Pie(pieData1);
           var ctx2 = document.getElementById("chart-area2").getContext("2d");
           window.myPie = new Chart(ctx2).Pie(pieData2);
           var ctx3 = document.getElementById("chart-area3").getContext("2d");
           window.myPie = new Chart(ctx3).Pie(pieData3);
           var ctx4 = document.getElementById("chart-area4").getContext("2d");
           window.myPie = new Chart(ctx4).Pie(pieData4);
           var ctx5 = document.getElementById("chart-area5").getContext("2d");
           window.myPie = new Chart(ctx5).Pie(pieData5);
           var ctx6 = document.getElementById("chart-area6").getContext("2d");
           window.myPie = new Chart(ctx6).Pie(pieData6);
           isGraph1Viewed = true;
       }
   });

   function isScrolledIntoView(elem) {
       var docViewTop = $(window).scrollTop();
       var docViewBottom = docViewTop + $(window).height();
       var elemTop = $(elem).offset().top;
       var elemBottom = elemTop + $(elem).height();
       return ((elemBottom >= docViewTop) && (elemTop <= docViewBottom) && (elemBottom <= docViewBottom) && (elemTop >= docViewTop));
   }

   /* ------ End Document ----------
   ------------------------------------------ */