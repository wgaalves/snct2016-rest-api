package br.com.snct2016.rest

import grails.transaction.Transactional

@Transactional
class UserService {

    def save(params) {
        def map = [:]

        if(!params.name){
            map.put("status",200)
            map.put("text","Name not found")

        } else if(!params.email){
            map.put("status",200)
            map.put("text","Name not found")

        }else{
            try{
                new User(params).save(failOnError: true,flush: true)
                map.put("status",201)
                map.put("text","User created")
            }catch (Exception e){
                log.debug(e.getMessage())
            }

        }

        return  map

    }

    def update(){

        def map = [:]

        if(!params.id){
            map.put("status",200)
            map.put("text","User not found")

        } else {
            try{
                def user = User.get(params.id)

                if(params.name)
                    user.name = params.name

                if(params.email)
                    user.email = params.email

                user.save(failOnError: true,flush: true)
                map.put("status",200)
                map.put("text","User Updated")
            }catch (Exception e){
                log.debug(e.getMessage())
            }

        }

        return  map

    }

    def delete() {
        def map = [:]

        if (!params.id) {
            map.put("status", 200)
            map.put("text", "User not found")

        } else {
            try {
                def user = User.get(params.id)
                user.delete(flush: true)
                map.put("status", 200)
                map.put("text", "User Updated")
            } catch (Exception e) {
                log.debug(e.getMessage())

            }
        }
    }

    def get(params){
        def map = [:]
        if(params.id && User.get(params.id) ){
            return User.get(params.id)
        }else if(!User.get(params.id) ){
            map.put("status", 200)
            map.put("text", "User not found from id")

            return map
        }

    }
}
