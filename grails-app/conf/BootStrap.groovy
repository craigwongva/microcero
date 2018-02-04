import javax.servlet.*
import java.util.jar.*

class BootStrap {

    def init = { servletContext ->
        InputStream inputStream = servletContext.getResourceAsStream("/META-INF/MANIFEST.MF");
        Manifest manifest = new Manifest(inputStream);
        Attributes secondaryAttributes = manifest.getAttributes("Grails Application")
        String sha =  secondaryAttributes.getValue('Implementation-Build-Number')
        println "i-000000000000 is running sha $sha"
    }

    def destroy = {
    }
}
