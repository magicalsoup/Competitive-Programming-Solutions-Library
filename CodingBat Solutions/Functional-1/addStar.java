public List<String> addStar(List<String> strings) {
  strings.replaceAll(n->n+"*");
  return strings;
}
