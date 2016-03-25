<html>
<head>
    <script src="../resources/js/angular.min.js"></script>
    <script type="text/javascript"
            src="../resources/js/controller/controller.js"></script>
</head>
<body ng-app="myApp">
<div ng-controller="myAppController as controller">
    <h1>Username : {{user.username}}</h1>
    <h1>Password : {{user.password}}</h1>
</div>
</body>
</html>