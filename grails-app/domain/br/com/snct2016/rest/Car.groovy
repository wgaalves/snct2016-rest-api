package br.com.snct2016.rest

class Car {

    static belongsTo = [ user:User]
    String id
    String name
    String model
    String year

    static constraints = {

    }

    static mapping = {
        id generator : 'uuid2'
    }
}
