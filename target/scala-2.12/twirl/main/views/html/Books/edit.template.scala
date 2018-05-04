
package views.html.Books

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.25*/("""
"""),_display_(/*3.2*/layout("Edit Book")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<h1>Edit Book</h1>
"""),_display_(/*5.2*/helper/*5.8*/.form(action = routes.BooksController.update())/*5.55*/{_display_(Seq[Any](format.raw/*5.56*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(bookForm("id"))),format.raw/*6.34*/("""
"""),_display_(/*7.2*/helper/*7.8*/.inputText(bookForm("title"))),format.raw/*7.37*/("""
"""),_display_(/*8.2*/helper/*8.8*/.inputText(bookForm("price"))),format.raw/*8.37*/("""
"""),_display_(/*9.2*/helper/*9.8*/.inputText(bookForm("author"))),format.raw/*9.38*/("""
"""),_display_(/*10.2*/helper/*10.8*/.CSRF.formField),format.raw/*10.23*/("""
"""),format.raw/*11.1*/("""<input type="submit" value="Update Book"/>
""")))}),format.raw/*12.2*/("""
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(bookForm:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => apply(bookForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 02 16:23:07 CAT 2018
                  SOURCE: D:/Industry/Software/Projects/Personal Projects/Source Codes/WebApps/Java/tomcat_server/bookstoreapp/app/views/Books/edit.scala.html
                  HASH: 7b3d46cc4ed0cb8f7114409080d204b999872e4c
                  MATRIX: 957->1|1053->27|1098->24|1126->45|1153->64|1191->65|1219->67|1265->88|1278->94|1333->141|1371->142|1399->145|1412->151|1458->177|1486->180|1499->186|1548->215|1576->218|1589->224|1638->253|1666->256|1679->262|1729->292|1758->295|1772->301|1808->316|1837->318|1912->363|1945->366
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|45->13
                  -- GENERATED --
              */
          