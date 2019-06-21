<!DOCTYPE html>
<html>

<body ng-app="sampleApp">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
<script type="text/javascript"  src="app.js"></script>
<title>HackTRON</title>


<h1> HackTRON</h1>

<div class="container">
    <ul>
        <li><a href="#!first">First</a></li>
        <li><a href="#!second">Second</a></li>
    </ul>
    <div ng-view> </div>
</div>

</body>
</html>
