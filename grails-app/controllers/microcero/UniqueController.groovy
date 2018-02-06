package microcero

class UniqueController {
    def servletContext
    def grailsApplication

    def index() { 
        String x = servletContext
        String s = x[-9..-1]
        String t = grailsApplication.config.myGlobal
        println "$s/index $t"
        render "hi springfield4 $s $t"
    }
}
