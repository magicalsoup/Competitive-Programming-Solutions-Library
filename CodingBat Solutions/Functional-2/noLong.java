public List<String> noLong(List<String> strings) {
  strings.removeIf(n->n.length()>=4);
  return strings;
}
