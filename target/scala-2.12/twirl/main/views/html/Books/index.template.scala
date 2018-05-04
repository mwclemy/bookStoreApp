
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/layout("All Books")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<h1>All Books</h1>
"""),_display_(/*4.2*/for(book <- books) yield /*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
"""),format.raw/*5.1*/("""<a href=""""),_display_(/*5.11*/routes/*5.17*/.BooksController.show(book.id)),format.raw/*5.47*/("""">"""),_display_(/*5.50*/book/*5.54*/.title),format.raw/*5.60*/("""</a>
<p>Price: """),_display_(/*6.12*/book/*6.16*/.price),format.raw/*6.22*/("""</p>
<p>Author: """),_display_(/*7.13*/book/*7.17*/.author),format.raw/*7.24*/("""</p>
""")))}),format.raw/*8.2*/("""
"""),format.raw/*9.1*/("""<a href=""""),_display_(/*9.11*/routes/*9.17*/.BooksController.create()),format.raw/*9.42*/("""">Create Book</a>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 03 18:02:47 CAT 2018
                  SOURCE: D:/Industry/Software/Projects/Personal Projects/Source Codes/WebApps/Java/tomcat_server/bookstoreapp/app/views/Books/index.scala.html
                  HASH: ccb935f1027efec870e29a25371399d678599880
                  MATRIX: 958->1|1073->21|1101->24|1128->43|1166->44|1194->46|1240->67|1273->85|1312->87|1340->89|1376->99|1390->105|1440->135|1469->138|1481->142|1507->148|1550->165|1562->169|1588->175|1632->193|1644->197|1671->204|1707->211|1735->213|1771->223|1785->229|1830->254|1880->274
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|41->9|42->10
                  -- GENERATED --
              */
          