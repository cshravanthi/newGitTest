var module=angular.module("shoppingModule",[]);
module.controller("shoppingCntrl",shoppingCntrl);

function shoppingCntrl($scope){
	$scope.errorText="";
	$scope.products=["milk","fruits","yoghurt","beer"];
	$scope.addItem=function(){
		if($scope.products.indexOf($scope.item)==-1)
		$scope.products.push($scope.item)
		else
			$scope.errorText="Already exists";
	};
		$scope.removeItem=function(x){
			$scope.products.splice(x,1);
		}
}