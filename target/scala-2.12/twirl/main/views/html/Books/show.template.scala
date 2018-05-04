
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book : Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),_display_(/*2.2*/layout(book.title)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<h2>"""),_display_(/*3.6*/book/*3.10*/.title),format.raw/*3.16*/("""</h2>
<p>Price: """),_display_(/*4.12*/book/*4.16*/.price),format.raw/*4.22*/("""</p>
<p>Author: """),_display_(/*5.13*/book/*5.17*/.author),format.raw/*5.24*/("""</p>
<a href=""""),_display_(/*6.11*/routes/*6.17*/.BooksController.edit(book.id)),format.raw/*6.47*/("""">Edit<a/>
<a href=""""),_display_(/*7.11*/routes/*7.17*/.BooksController.destroy(book.id)),format.raw/*7.50*/("""">Delete<a/>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 02 16:23:07 CAT 2018
                  SOURCE: D:/Industry/Software/Projects/Personal Projects/Source Codes/WebApps/Java/tomcat_server/bookstoreapp/app/views/Books/show.scala.html
                  HASH: 087d9b40524faff9dcdcce4c2fff6faa5c293657
                  MATRIX: 951->1|1059->14|1087->17|1113->35|1151->36|1179->38|1209->43|1221->47|1247->53|1291->71|1303->75|1329->81|1373->99|1385->103|1412->110|1454->126|1468->132|1518->162|1566->184|1580->190|1633->223|1677->238
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8
                  -- GENERATED --
              */
          