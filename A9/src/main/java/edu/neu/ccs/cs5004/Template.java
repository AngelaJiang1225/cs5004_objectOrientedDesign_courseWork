package edu.neu.ccs.cs5004;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a template file with list of TemplateLine.
 */
public class Template {
  List<TemplateLine> templateLines;

  /**
   * Create an empty Template.
   */
  public Template() {
    this.templateLines = new ArrayList<>();
  }

  /**
   * return the templatelines.
   *
   * @return the templatelines.
   */
  public List<TemplateLine> getTemplateLines() {
    return this.templateLines;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Template template = (Template) obj;
    return Objects.equals(this.templateLines, template.getTemplateLines());
  }

  @Override
  public int hashCode() {

    return Objects.hash(this.templateLines);
  }

  @Override
  public String toString() {
    return "Template{"
        + "templatesLines=" + this.templateLines.toString()
        + '}';
  }
}
