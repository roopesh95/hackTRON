
var sampleApp = angular.module('sampleApp',['ngRoute']);
sampleApp.config(['$routeProvider',

    function($routeProvider){debugger
    $routeProvider.
    when('/first',{
        templateUrl : './first.html',
        controller: 'FirstController'
    }).
    when("/second", {
        templateUrl: './second.html',
        controller: 'SecondController'
    });
}]);

sampleApp.controller('FirstController',function($scope,$http) {debugger
		$http.get('http://localhost:8080/hackTRON/getAllUsers').then(function(response){
			console.log(response.data);
		})
    
});

sampleApp.controller('SecondController',function($scope){debugger

});