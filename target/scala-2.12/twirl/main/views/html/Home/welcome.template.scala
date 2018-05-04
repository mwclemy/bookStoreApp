
package views.html.Home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name : String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>BookStoreApp</title>
</head>
<body>
<h1>Welocme """),_display_(/*8.14*/name),format.raw/*8.18*/("""  """),_display_(/*8.21*/lastName),format.raw/*8.29*/(""" """),format.raw/*8.30*/("""to my Website </h1>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 30 16:54:35 CAT 2018
                  SOURCE: D:/Industry/Software/Projects/Personal Projects/Source Codes/WebApps/Java/tomcat_server/bookstoreapp/app/views/Home/welcome.scala.html
                  HASH: ce433ced85db93424b159130350c948b54bd96fe
                  MATRIX: 962->1|1090->34|1120->38|1221->113|1245->117|1274->120|1302->128|1330->129
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|40->8|40->8
                  -- GENERATED --
              */
          