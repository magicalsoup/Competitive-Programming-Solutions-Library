public List<String> no34(List<String> strings) {
  strings.removeIf(n->n.length()==3||n.length()==4);
  return strings;
}
