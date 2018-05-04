
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Create Book")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
"""),format.raw/*5.1*/("""<h1>Create Book</h1>
"""),_display_(/*6.2*/helper/*6.8*/.form(action = routes.BooksController.save())/*6.53*/{_display_(Seq[Any](format.raw/*6.54*/("""
"""),_display_(/*7.2*/helper/*7.8*/.inputText(bookForm("id"))),format.raw/*7.34*/("""
"""),_display_(/*8.2*/helper/*8.8*/.inputText(bookForm("title"))),format.raw/*8.37*/("""
"""),_display_(/*9.2*/helper/*9.8*/.inputText(bookForm("price"))),format.raw/*9.37*/("""
"""),_display_(/*10.2*/helper/*10.8*/.inputText(bookForm("author"))),format.raw/*10.38*/("""
"""),_display_(/*11.2*/helper/*11.8*/.CSRF.formField),format.raw/*11.23*/("""
"""),format.raw/*12.1*/("""<input type="submit" value="Create Book"/>
""")))}),format.raw/*13.2*/("""
""")))}),format.raw/*14.2*/("""
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
                  SOURCE: D:/Industry/Software/Projects/Personal Projects/Source Codes/WebApps/Java/tomcat_server/bookstoreapp/app/views/Books/create.scala.html
                  HASH: fbfcff10d7b1e174ccecda36f02cd8eafa2b9285
                  MATRIX: 959->1|1055->27|1100->24|1128->44|1156->47|1185->68|1223->69|1251->71|1299->94|1312->100|1365->145|1403->146|1431->149|1444->155|1490->181|1518->184|1531->190|1580->219|1608->222|1621->228|1670->257|1699->260|1713->266|1764->296|1793->299|1807->305|1843->320|1872->322|1947->367|1980->370
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|45->13|46->14
                  -- GENERATED --
              */
          