var app=angular.module("todoapp",[]);
app.controller("toDoCntrl",toDoCntrl);

function toDoCntrl(){
	
	this.edit=false;
	
	this.todos=[
		"lets do this","virat kohli","shravanthi"		
	];	
	
	
	this.addNewTodo=function(){
		
		this.todos.push(this.todo);
		this.todo="";
	}
	
	this.editTodo=function(){
		
		this.edit=!this.edit;
	}
	
	this.deleteTodo=function(index){
		
		this.todos.splice(index,1);
	}
}