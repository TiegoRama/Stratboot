package org.ldv.myhello.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MainController {
    @GetMapping("/")
    @ResponseBody
    fun myResponse():String {
        return "Hello World du Contrôleur !"
    }
    @GetMapping("/hello")
    @ResponseBody
    fun querrString(querry: HttpServletRequest): String {
        val nom = querry.getParameter("nom") ?:""
        val prenom = querry.getParameter("prenom") ?:""

        return "Hello ${nom} ${prenom}! "
    }
}