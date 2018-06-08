public List<String> noYY(List<String> strings) {
  strings.replaceAll(n->n+"y");
  strings.removeIf(n->n.contains("yy"));
  return strings;
}
