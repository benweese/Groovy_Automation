package pages

import geb.Page
import modules.SizeMenuModule

class HomePage extends Page{
    static at = { title == "Home - BenWeese.Dev" }

    static content = {
        sizeMenu { module SizeMenuModule }
    }
}
