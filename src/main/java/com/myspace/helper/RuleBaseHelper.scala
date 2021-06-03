package com.myspace.helper

object RuleBaseHelper {
  def validateCPT(cpt: Array[String], rules: String): Boolean = {
    /*This function is mainly to handle rule cases where multiple codes
    are given separated by commas. This will work for all single code cases as well
    */
    val splitRules = rules.split(",").filterNot(_.isEmpty)
    if (cpt.nonEmpty && splitRules.intersect(cpt).length == splitRules.length) true else false
  }


  def stringCompare(a: String, b: String): Boolean = {
    a.equalsIgnoreCase(b)
  }

  def main(args: Array[String]): Unit = {
    print(stringCompare("ab","ab"))
  }
}
