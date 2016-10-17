package br.com.snct2016.rest

class User {

    static hasMany = [car:Car]
    String id
    String name
    String email

    static constraints = {
    }

    static mapping = {
        id generator : 'uuid2'
    }
}
