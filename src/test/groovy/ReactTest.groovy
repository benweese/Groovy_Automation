import geb.Page
import geb.spock.GebSpec
import pages.HomePage

class ReactTest extends GebSpec {

    static Page page

   def "Can get XS shirt"(){
       given:
       to HomePage
       page = at HomePage

       when:
       page.sizeMenu.sizes[0].find('input').value() == 'XS'

       then:
       page.sizeMenu.sizes[0].click()

       when:
       page.shirtMenu.shirts[0].displayed

       then:
       !page.shirtMenu.shirts[1].displayed
   }

}
