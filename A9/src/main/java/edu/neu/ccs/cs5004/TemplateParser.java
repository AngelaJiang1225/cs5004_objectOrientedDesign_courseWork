package edu.neu.ccs.cs5004;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Use Template to parse template.
 */
public class TemplateParser implements IParser {
  private Template resTemplate;
  private static final String REG_EXP = "\\[\\[(\\S*)\\]\\]";
  private static final int GROUP_NO = 1;

  public TemplateParser() {
    this.resTemplate = new Template();
  }

  // parse in string line and make it into a list that store the placeholders and terms
  // to be replaced.
  //add them into template
  @Override
  public void parse(String line) {
    // for each line, split them into list
    Pattern pat = Pattern.compile(REG_EXP);
    Matcher mat = pat.matcher(line);
    int star = 0;
    TemplateLine templateLine = new TemplateLine();
    while (mat.find()) {
      String startFrom = mat.group(GROUP_NO);
      // if the term is found when there is placeholders in front of it for every part of matching.
      if (mat.start() - star >= GROUP_NO) {
        templateLine.getLineList().add(line.substring(star, mat.start()));
        templateLine.getLineList().add(startFrom);
      } else {
        // if start with braced word
        templateLine.getLineList().add("");
        templateLine.getLineList().add(startFrom);
      }
      star = mat.end();
    }
    // if there are still placeholders remained, add them to the list
    if (star < line.length()) {
      templateLine.getLineList().add(line.substring(star));
    }
    this.resTemplate.getTemplateLines().add(templateLine);
  }

  public Template getResTemplate() {
    return this.resTemplate;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    TemplateParser that = (TemplateParser) obj;
    return Objects.equals(this.resTemplate, that.resTemplate);
  }

  @Override
  public int hashCode() {

    return Objects.hash(this.resTemplate);
  }

  public String toString() {
    return "TemplateParser{" + "resTemplate = " + this.resTemplate.toString() + "}";
  }
}
