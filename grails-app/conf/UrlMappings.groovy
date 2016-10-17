class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/users/$id"(controller: 'user', action: 'get', method: 'GET')
        "/api/users/"(controller: 'user', action: 'getAll', method: 'GET')
        "/api/users"(controller: 'user', action: 'save', method: 'POST')
        "/api/users"(controller: 'user', action: 'update', method: 'PUT')
        "/api/users/delete/$id"(controller: 'user', action: 'delete', method: 'POST')


        "/"(view:"/index")
        "500"(view:'/error')
	}
}
