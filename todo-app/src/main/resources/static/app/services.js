(function (angular) {
    var UserFactory = function ($resource) {
        return $resource('/user/:id', {
            id: '@id'
        });
    };

    var TodoListFactory = function ($resource) {
        return $resource('/todo/:id', {
            id: '@id'
        });
    };

    UserFactory.$inject = ['$resource'];
    TodoListFactory.$inject = ['$resource'];
    angular.module("myApp.services")
        .factory("UserFactory", UserFactory)
        .factory("TodoListFactory", TodoListFactory);
}(angular));