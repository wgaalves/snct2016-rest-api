package br.com.snct2016.rest

import grails.converters.JSON

class UserController {
    def userService

    def save() {
        def response = userService.save(params)

        render(status: response.status,text: response.text) as JSON
    }

    def update(){
        def response = userService.update(params)

        render response.user as JSON
    }

    def delete(){
        def response = userService.save(params)

        render(status: response.status,text: response.text) as JSON
    }

    def get(){
        def response = userService.get(params)

        render response as JSON
    }

    def getAll(){

        render User.findAll() as JSON
    }


}
