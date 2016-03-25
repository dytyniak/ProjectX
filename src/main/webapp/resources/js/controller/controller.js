angular.module('myApp', []).controller('myAppController',
    function ($scope, $http) {
        $http.get("/getUser").then(function (response) {
            $scope.user = response.data;
        });
    });